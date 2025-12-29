 /*Debug download simplified*/ import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
/*additional import*/ import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

// === CONFIGURATION ===
String BASE_URL = 'https://the-internet.herokuapp.com/download'

/*

String baseFileName = 'some-file'

 

String fileType = 'TXT'

*/
//int downloadTimeout = 5 // seconds to wait for download to complete
// === 1. OPEN BROWSER & NAVIGATE ===
WebUI.openBrowser(BASE_URL)

/*

String partialFileName = CustomKeywords.'hubbleKeywords.FileNameManager.getFullFileName'(baseFileName, fileType)

WebUI.comment("Expecting file: '${partialFileName}'")

*/
String partialFileName = 'a_random_data.txt'

///*Perform cleanup the file to prevent existing file is present*/
//
//CustomKeywords.'baseUtil.NewFileDownload.cleanDownloadDirectory'(partialFileName)
WebUI.waitForElementVisible(findTestObject('Page_The Internet/a_random_data.txt'), 0)

WebUI.click(findTestObject('Page_The Internet/a_random_data.txt'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

/*verify the file in the download folder*/
CustomKeywords.'baseUtil.NewFileDownload.verifyFileExists'(partialFileName)

WebUI.closeBrowser()

