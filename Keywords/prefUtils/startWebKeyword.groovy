package prefUtils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.webui.driver.chrome.ChromeDriverUtil

import com.kms.katalon.core.webui.util.WebDriverPropertyUtil as WebDriverUtil

import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import com.kms.katalon.core.webui.driver.DriverFactory

public class startWebKeyword {
	@Keyword

	def Launch_Browser_with_options(){

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", prefs);

		options.addArguments("--disable-infobars");

		WebDriver driver = new ChromeDriver(options);

		DriverFactory.changeWebDriver(driver)
		//
		//		driver.get("https://www.pinterest.com/")
	}
}
