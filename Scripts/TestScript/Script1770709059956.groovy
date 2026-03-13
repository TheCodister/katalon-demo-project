import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType

// ---------- Safe parameter getter ----------
def P(String name, def defVal = null) {
	try { return (binding?.hasVariable(name) && this[name] != null) ? this[name] : defVal }
	catch (Throwable ignore) { return defVal }
}

// ---------- Inputs (from Master) ----------
String fieldType = (P('fieldType', '') ?: '').toString()

// Medical labels may vary; accept pipe-separated variants from Actual_Expected
String MedicalReportsAllowed = (P('MedicalReportsAllowed', 'Medical Reports|Medical Report') ?: '').toString()

// Fixed TOs (override if your paths differ)
String TO_MEDICAL_REPORT     = (P('TO_MEDICAL_REPORT', 'ACE ione/verification/Page_Form Builder/td_Medical Reports') ?: '').toString()
String TO_NON_MEDICAL_REPORT = (P('TO_NON_MEDICAL_REPORT', 'ACE ione/verification/Page_Form Builder/Page_Form Builder/non_td_Medical Reports') ?: '').toString()

// Behavior toggles
boolean clickNonMedical      = (P('clickNonMedical', true) as boolean)      // click the non-medical control
boolean enforceMedicalAbsenceForNon = (P('enforceMedicalAbsenceForNon', true) as boolean) // also verify Med Reports absent in Non-Medical

// ---------- Config ----------
final int WAIT_SHORT  = 5
final int WAIT_MEDIUM = 15

boolean ok = true
List<String> reasons = []

try {
	boolean isMedical = fieldType.trim().equalsIgnoreCase('Medical')

	if (isMedical) {
		// ---------- MEDICAL path: verify Medical Reports present ----------
		List<String> allowed = (MedicalReportsAllowed ?: '').split(/\s*\|\s*/).findAll { it?.trim() }
		boolean found = false

		// 1) Dynamic exact-text match for any allowed label
		for (String label : allowed) {
			TestObject dyn = new TestObject("mr_dyn_" + label)
			dyn.addProperty('xpath', ConditionType.EQUALS, "//*[self::td or self::div or self::span][normalize-space()=${xpathLiteral(label)}]")
			if (WebUI.verifyElementPresent(dyn, WAIT_MEDIUM, FailureHandling.OPTIONAL)) {
				found = true; KeywordUtil.logInfo("Medical Reports matched label: " + label); break
			}
		}
		// 2) Fallback: your fixed TO (if configured)
		if (!found && TO_MEDICAL_REPORT) {
			try {
				found = WebUI.verifyElementPresent(findTestObject(TO_MEDICAL_REPORT), WAIT_MEDIUM, FailureHandling.OPTIONAL)
				if (found) KeywordUtil.logInfo('Medical Reports found via fixed TestObject')
			} catch (Throwable ignore) {}
		}
		if (!found) {
			ok = false
			reasons << (allowed.isEmpty() ? 'Medical Reports NOT found' : "Medical Reports NOT found (tried labels: ${allowed})")
		}

	} else {
		// ---------- NON-MEDICAL path: click the Non‑Medical control ----------
		if (!TO_NON_MEDICAL_REPORT?.trim()) {
			ok = false; reasons << 'TO_NON_MEDICAL_REPORT path not provided'
		} else {
			TestObject nonTO = safeFind(TO_NON_MEDICAL_REPORT)
			boolean nonPresent = (nonTO != null) && WebUI.verifyElementPresent(nonTO, WAIT_MEDIUM, FailureHandling.OPTIONAL)
			if (!nonPresent) {
				ok = false
				reasons << "Non‑Medical control not present: ${TO_NON_MEDICAL_REPORT}"
			} else {
				try {
					boolean clickable = WebUI.verifyElementClickable(nonTO, WAIT_SHORT, FailureHandling.OPTIONAL)
					if (clickable) {
						WebUI.click(nonTO, FailureHandling.OPTIONAL)
						KeywordUtil.logInfo('Clicked Non‑Medical control successfully')
					} else {
						reasons << 'Non‑Medical control present but not clickable'
					}
				} catch (Throwable clickEx) {
					reasons << ('Click on Non‑Medical control threw exception: ' + clickEx.getMessage())
				}
			}
		}

		// Optionally ensure Medical Reports NOT visible for Non‑Medical
		if (enforceMedicalAbsenceForNon) {
			List<String> allowed = (MedicalReportsAllowed ?: '').split(/\s*\|\s*/).findAll { it?.trim() }
			boolean medFound = false
			for (String label : allowed) {
				TestObject dyn = new TestObject("mr_dyn_non_" + label)
				dyn.addProperty('xpath', ConditionType.EQUALS, "//*[self::td or self::div or self::span][normalize-space()=${xpathLiteral(label)}]")
				if (WebUI.verifyElementPresent(dyn, WAIT_SHORT, FailureHandling.OPTIONAL)) { medFound = true; break }
			}
			if (!medFound && TO_MEDICAL_REPORT) {
				try { medFound = WebUI.verifyElementPresent(findTestObject(TO_MEDICAL_REPORT), WAIT_SHORT, FailureHandling.OPTIONAL) }
				catch (Throwable ignore) {}
			}
			if (medFound) { ok = false; reasons << 'Medical Reports SHOULD NOT be present for Non‑Medical' }
		}
	}

} catch (Throwable t) {
	ok = false; reasons << ('Exception in TC_01: ' + t.getMessage())
}

return [ pass: ok, reasons: reasons ]

// ---------- Helpers ----------
TestObject safeFind(String repoPath) {
	try { return findTestObject(repoPath) } catch (Throwable ignore) { return null }
}
String xpathLiteral(String text) {
	if (!(text ?: '').contains("'")) return "'${text}'"
	if (!text.contains('"'))        return "\"${text}\""
	return "concat('" + text.replace("'", "',\"'\",'") + "')"
}