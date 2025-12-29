//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.remote.RemoteWebDriver
//import org.openqa.selenium.JavascriptExecutor
//
//import com.kms.katalon.core.annotation.BeforeTestCase
//import com.kms.katalon.core.annotation.BeforeTestSuite
//import com.kms.katalon.core.annotation.AfterTestCase
//import com.kms.katalon.core.annotation.AfterTestSuite
//import com.kms.katalon.core.context.TestCaseContext
//import com.kms.katalon.core.context.TestSuiteContext
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.configuration.RunConfiguration
//import com.kms.katalon.core.util.KeywordUtil
//import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.testobject.ConditionType
//
//import internal.GlobalVariable
//
//
//class NewTestListener {
//	
//	@BeforeTestCase
//	def beforeTestCase()
//}
//
//	@BeforeTestSuite
//	def beforeTestSuite(TestSuiteContext testSuiteContext) {
//		String buildName = ""
//		print("Before Test Suite, I do somthing")
//		Date today = new Date()
//		String todaysDate = today.format('-MMM-dd-yyyy')
//		String nowTime = today.format('-hh:mm')
//		String activeProfile = RunConfiguration.getExecutionProfile()
//	//	String testSuiteName = testSuiteContext.getTestSuiteId().replace('Test Suites/', '').replaceAll(' - Android - TCs', '').replaceAll(' - IOS - TCs', '')
//
////		if (activeProfile == 'devqa') {
////			String serverLabel = GlobalVariable.serverLabel
////			buildName = "Mobile Web Devbox Execution in - " + serverLabel + todaysDate + nowTime
////		} else if (activeProfile == 'tnw - mobile web - staging - android' || activeProfile == 'tnw - mobile web - staging - iOS') {
////			String serverLabel = GlobalVariable.serverLabel
////			buildName = "Mobile Web Staging Execution - " + serverLabel + todaysDate + nowTime
////		} else if (activeProfile.contains('mobile web - IOS')) {
////			buildName = "Mobile Web iOS Execution - " + testSuiteName + todaysDate + nowTime
////		} else if (activeProfile.contains('mobile web - android')) {
////			buildName = "Mobile Web Android Execution - " + testSuiteName + todaysDate + nowTime
////		} else {
////			buildName = testSuiteName + todaysDate + nowTime
////		}
//
//		Map<String, Object> bstackOptions = new HashMap<>()
//		bstackOptions.put("buildName", buildName)
//		GlobalVariable.bstackOptions = bstackOptions
//		RunConfiguration.setDriverPreferencesProperty("Remote", "bstack:options", bstackOptions)
//
//		KeywordUtil.logInfo("Mobile Test Suite setup with build name: ${buildName}")
//
//	}
//
//	@BeforeTestCase
//	def beforeTestCase(TestCaseContext testCaseContext) {
//		boolean isRemote = DriverFactory.getRemoteWebDriverServerType() != null
//		String testCaseName = testCaseContext.getTestCaseId()
////		String activeProfile = RunConfiguration.getExecutionProfile()
//
//		if (isRemote) {
//			if(GlobalVariable.bstackOptions == "") {
//				Map<String, Object> browserstackOptions = new HashMap<>()
//				browserstackOptions.put("sessionName", testCaseName)
//				GlobalVariable.bstackOptions = browserstackOptions
//				
//				RunConfiguration.setDriverPreferencesProperty("Remote", "bstack:options", browserstackOptions)
//			}
//			else {
//				GlobalVariable.bstackOptions.put("sessionName", testCaseName)
//			}
//
//			
//			WebUI.openBrowser('')
//			WebUI.navigateToUrl("https://badminton-econ-app-nkv4.vercel.app/")
//		}
//
//		KeywordUtil.logInfo("Mobile Web Profile: ${RunConfiguration.getExecutionProfile()} | Remote: ${isRemote}")
//		
////		if (activeProfile == 'tnw - mobile web - devqa - android' || activeProfile == 'tnw - mobile web - staging - android' || activeProfile == 'tnw - mobile web - staging - iOS') {
////			TestObject dropdown = new TestObject('dropdown_ServerSelection')
////			dropdown.addProperty('xpath', ConditionType.EQUALS, "//select[@name='server']")
////			String serverLabel = GlobalVariable.serverLabel
////
////			if(activeProfile=='tnw - mobile web - staging - android' || activeProfile == 'tnw - mobile web - staging - iOS') {
////				Account.clickAccountIcon()
////				Account.clickHeaderSignIn()
////				WebUI.refresh()
////			}
////			
////			WebUI.click(dropdown)
////			WebUI.selectOptionByLabel(dropdown, serverLabel, false)
////			WebUI.waitForPageLoad(60)
////			boolean isOptionSelected = WebUI.verifyOptionSelectedByLabel(dropdown, serverLabel, false, 10)
////
////			if (isOptionSelected) {
////				KeywordUtil.logInfo("Server selection successful: ${serverLabel}")
////			} else {
////				KeywordUtil.markFailed("Failed to select server: ${serverLabel}")
////			}
////			
////			if(activeProfile=='tnw - mobile web - staging - android' || activeProfile == 'tnw - mobile web - staging - iOS') {
////				WebUI.navigateToUrl(GlobalVariable.Url + GlobalVariable.URLParam)
////				TestObject closeButton = new TestObject('closeButton')
////				closeButton.addProperty('xpath', ConditionType.EQUALS, "//*[contains(@class,'close-button')]")
////				Integer intPopUpWait = 0
////				Boolean blnCloseButton = false
////				while(!blnCloseButton) {
////					if(WebUI.verifyElementPresent(closeButton, GlobalVariable.Wait_Small, FailureHandling.OPTIONAL)) {
////						WebUI.click(closeButton)
////						KeywordUtil.logInfo("Pop-up closed")
////						break
////					}else {
////						WebUI.delay(GlobalVariable.Wait_Small)
////						intPopUpWait = intPopUpWait + 1
////					}
////					if(intPopUpWait == 3) {
////						KeywordUtil.logInfo("No pop-up displayed")
////						break
////					}
////				}
////
////			}
////
////			
//		}
//
//	@AfterTestCase
//	def afterTestCase(TestCaseContext testCaseContext) {
//		
//		WebUI.navigateToUrl("https://badminton-econ-app-nkv4.vercel.app/")
////		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Header/Cart/Cart With Items'), GlobalVariable.Wait_Small, FailureHandling.OPTIONAL)) {
////			Cart.clickCartIcon()
////			CartPage.clearShoppingCart()
////		}
////		WebUI.navigateToUrl(GlobalVariable.SignOut_Url)
////		WebUI.navigateToUrl(GlobalVariable.Url)
////		WebUI.waitForPageLoad(GlobalVariable.Wait_Large)
////		
////		String status = testCaseContext.getTestCaseStatus()
////		String qaseStatus = status?.toLowerCase() ?: "failed"
////		String errorMessage = testCaseContext.getMessage() ?: ""
////		String testCaseId = testCaseContext.getTestCaseId()
////		String pageVars = testCaseContext.testCaseVariables?.toMapString() ?: ""
////		String reason = buildReason(status, errorMessage, pageVars)
////
////		try {
////			WebDriver driver = DriverFactory.getWebDriver()
////			if (driver instanceof RemoteWebDriver) {
////				JavascriptExecutor jse = (JavascriptExecutor) driver
////				String safeReason = reason.replaceAll("\"", "'").take(255)
////				String statusValue = (status == "PASSED") ? "passed" : "failed"
////				jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"${statusValue}\", \"reason\":\"${safeReason}\"}}")
////				KeywordUtil.logInfo("BrowserStack session marked: ${statusValue} | Reason: ${safeReason}")
////			} else {
////				KeywordUtil.markWarning("Skipping session status update — not a RemoteWebDriver.")
////			}
////		} catch (Exception e) {
////			KeywordUtil.markWarning("Failed to update BrowserStack status: ${e.message}")
////		} finally {
////			WebUI.closeBrowser()
////		}
////
////	}
////
////	private String buildReason(String status, String message, String contextVars) {
////		if (status in ['FAILED', 'ERROR']) {
////			String reason = ""
////			String start = "Exception:"
////			String end = "at "
////			String causedBy = "Caused by: "
////
////			int startIdx = message.indexOf(start)
////			int endIdx = message.indexOf(end, startIdx)
////			int causedIdx = message.indexOf(causedBy)
////
////			if (startIdx >= 0 && endIdx >= 0) {
////				String extracted = message.substring(startIdx + start.length(), endIdx).trim()
////				reason += "${contextVars} ${extracted}"
////				if (causedIdx >= 0) {
////					String caused = message.substring(causedIdx + causedBy.length())
////					int causeSep = caused.indexOf(": ")
////					String causeDetail = (causeSep >= 0) ? caused.substring(0, causeSep).trim() : caused.trim()
////					reason += " | Caused by: ${causeDetail}"
////				}
////			} else {
////				reason += "${contextVars} | Exception type not shown. Please investigate."
////			}
////			return reason
////		}
////		return "Test passed!"
//	}
//
//	@AfterTestSuite
//	def afterTestSuite(TestSuiteContext testSuiteContext) {
//		/*if (UtilityMethods.isDevProfile()) {
//			WebUI.closeBrowser()
//		}*/
//	}
//}
