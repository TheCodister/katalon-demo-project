import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.Dimension
import com.kms.katalon.core.util.KeywordUtil

// Open a browser for the demonstration
WebUI.openBrowser('https://katalon.com')

// --- Get the outer window dimensions using Selenium ---
WebDriver driver = DriverFactory.getWebDriver()
Dimension windowSize = driver.manage().window().getSize()
int windowWidth = windowSize.getWidth()
int windowHeight = windowSize.getHeight()

KeywordUtil.logInfo("The outer window size is: ${windowWidth} x ${windowHeight}")

// --- Get the inner viewport dimensions using JavaScript ---
// This is the most accurate way to get the viewport dimensions
String jsGetViewportWidth = 'return window.innerWidth;'
String jsGetViewportHeight = 'return window.innerHeight;'

// Execute the JavaScript and get the results
int viewportWidth = Integer.parseInt(WebUI.executeJavaScript(jsGetViewportWidth, null).toString())
int viewportHeight = Integer.parseInt(WebUI.executeJavaScript(jsGetViewportHeight, null).toString())

KeywordUtil.logInfo("The inner viewport size is: ${viewportWidth} x ${viewportHeight}")

// Close the browser
WebUI.closeBrowser()