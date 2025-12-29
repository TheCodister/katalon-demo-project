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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://account.microsoft.com/account')

WebUI.click(findTestObject('Object Repository/Page_Microsoft account  Sign In or Create Y_5b63c9/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'quangcuber002@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Create one_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Get a code to sign in/button_Send code'))

WebUI.setText(findTestObject('Object Repository/Page_Enter your code/input_quangcuber002gmail.com_codeEntry-0'), '5')

WebUI.setText(findTestObject('Object Repository/Page_Enter your code/input_quangcuber002gmail.com_codeEntry-1'), '8')

WebUI.setText(findTestObject('Object Repository/Page_Enter your code/input_quangcuber002gmail.com_codeEntry-2'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Enter your code/input_quangcuber002gmail.com_codeEntry-3'), '0')

WebUI.setText(findTestObject('Object Repository/Page_Enter your code/input_quangcuber002gmail.com_codeEntry-4'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Enter your code/input_quangcuber002gmail.com_codeEntry-5'), '9')

WebUI.click(findTestObject('Object Repository/Page_Stay signed in/button_Yes'))

WebUI.closeBrowser()

