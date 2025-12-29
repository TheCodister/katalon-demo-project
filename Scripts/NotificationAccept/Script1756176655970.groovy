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
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.chrome.ChromeDriverUtil as ChromeDriverUtil

//System.setProperty("webdriver.chrome.driver", ChromeDriverUtil.getChromeDriverPath());
//
//ChromeOptions options = new ChromeOptions();
//
////options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//
//options.addArguments("start-maximized", "disable-infobars");
//
//Map<String, Object> prefs = new HashMap<>();
//
//// Your existing cookie preference
//prefs.put("profile.default_content_settings.cookies", 1);
//
//// Add the notification preference
//// 1 = Allow notifications
//// 2 = Block notifications
//prefs.put("profile.default_content_settings.notifications", 2);
//
//options.setExperimentalOption("prefs", prefs);
//
//ChromeDriver driver = new ChromeDriver(options);
//
//DriverFactory.changeWebDriver(driver);
//
//driver.get("https://v0-notification-alert-app.vercel.app/");
WebUI.openBrowser('')

WebUI.navigateToUrl('https://v0-notification-alert-app.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_v0 App/button_Enable Notifications'))

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Object Repository/Page_v0 App/h1_Notification Demo'), 'Notification Demo')

