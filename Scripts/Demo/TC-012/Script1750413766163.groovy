import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Load Excel Test Data
TestData productData = TestDataFactory.findTestData("Data Files/ProductIDs")

// Open browser and navigate to site
WebUI.openBrowser('')
WebUI.navigateToUrl('https://automationexercise.com/')
WebUI.verifyElementPresent(findTestObject('Object Repository/Excel-test-object/Page_Automation Exercise/h1_AutomationExercise'), 10)
WebUI.click(findTestObject('Object Repository/Excel-test-object/Page_Automation Exercise/a_Products'))

// Iterate through Excel rows
int totalRows = productData.getRowNumbers()

for (int i = 1; i <= totalRows; i++) {
	String productName = productData.getValue("prod_id", i)
	WebUI.comment("Adding product: " + productName)

	// Build a dynamic TestObject using product name
	TestObject productDiv = new TestObject("dynamicProductDiv")
	productDiv.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS,
		"//a[text()='${productName}']/ancestor::div[contains(@class, 'productinfo')]/following-sibling::div/a[contains(text(), 'Add to cart')]")

	WebUI.scrollToElement(productDiv, 5)
	WebUI.mouseOver(productDiv)
	WebUI.click(productDiv)
	
	WebUI.click(findTestObject('Object Repository/Excel-test-object/Page_Automation Exercise - All Products/button_Continue Shopping'))
}

// Final check (optional)
WebUI.click(findTestObject('Object Repository/Excel-test-object/Page_Automation Exercise - All Products/u_View Cart'))

// Close browser
WebUI.closeBrowser()

