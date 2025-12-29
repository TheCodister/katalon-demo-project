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

WebUI.openBrowser('https://live-demo.edge6.nep.aws.jobready.io/')

WebUI.setViewPortSize(2560, 1600)

WebUI.setText(findTestObject('Object Repository/Page_(edge) job ready/input_Email Address'), 'quang.nnguyen@katalon.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_(edge) job ready/input_Password'), 'U8CPRW5hPg9ew4VqaEERMA==')

WebUI.click(findTestObject('Object Repository/Page_(edge) job ready/input_commit'))

WebUI.click(findTestObject('Object Repository/Page_(edge) job ready/button_Add New'))
//
//WebUI.click(findTestObject('Object Repository/Page_(edge) job ready/li_Job Seekers'))
//
//WebUI.click(findTestObject('Object Repository/Page_(edge) job ready/a_New Job Seeker'))
//
//WebUI.takeElementScreenshotAsCheckpoint('ElementWindow', findTestObject('Page_(edge) job ready/div_'))

WebUI.closeBrowser()

WebUI.comment(GlobalVariable.G_LMS)

