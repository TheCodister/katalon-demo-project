import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.katalon.testcloud.FileExecutor as FileExecutor

//import general.Inputfieldxpath as Inputfieldxpath
//Open browser and navigate the page to 
WebUI.openBrowser('https://the-internet.herokuapp.com/download')

WebDriver driver = DriverFactory.getWebDriver()

//Click download 
WebElement download = driver.findElement(By.xpath('//*[@id="content"]/div/a[1]'))

download.click()

WebUI.delay(2)

// Open Chrome and navigate to chrome://downloads
driver.get('chrome://downloads')

// Wait for the Downloads page to load (adjust timeout as needed)
WebUI.delay(2)

// Wait for 3 seconds (adjust as needd
// Fetch the latest downloaded file path using JavaScript
String latestDownloadFile = (String) ((JavascriptExecutor) driver).executeScript(
	"return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').innerText.trim()"
)

println(latestDownloadFile)

//Verify the latest download File exist
if (CustomKeywords.'com.katalon.testcloud.FileExecutor.exist'(latestDownloadFile)) {
    KeywordUtil.logInfo('Passed - Latest download File exist')
} else {
    KeywordUtil.logInfo('Failed - Latest download File not exist')
}

//Verify the latest download File contains text value
String text = 'file'

if (latestDownloadFile.contains(text)) {
    KeywordUtil.logInfo("Passed: File name '$latestDownloadFile' contains the text '$latestDownloadFile'.")
} else {
    KeywordUtil.logInfo("Failed: File name '$latestDownloadFile' does NOT contain the text '$text'.")

    WebUI.markFailed("File name verification failed: Expected '$text' in '$latestDownloadFile'.")
}



