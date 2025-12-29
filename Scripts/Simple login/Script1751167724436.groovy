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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Keys as Keys

Map<String, Object> chromeOptions = [('args') : ['--window-size=1920,1080', '--disable-gpu', '--no-sandbox', '--disable-dev-shm-usage'
        , '--user-agent=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36']]

RunConfiguration.setWebDriverPreferencesProperty('goog:chromeOptions', chromeOptions)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')

WebUI.executeJavaScript('window.scrollTo(0,1816)', null)

WebUI.setText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Username'), 'student')

WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/input_Password'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/button_submit'))

WebUI.scrollToPosition(0, 1816)

WebUI.click(findTestObject('Object Repository/Page_Logged In Successfully  Practice Test _c87e4f/a_Log out'))

WebUI.closeBrowser()

