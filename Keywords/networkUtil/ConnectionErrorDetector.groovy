package networkUtil

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebDriverException

class ConnectionErrorDetector {

	/**
	 * Checks if the current page is displaying the "Your connection was interrupted" error.
	 * @return true if the error message is found, false otherwise.
	 */
	@Keyword
	def static boolean isConnectionInterruptedError() {
		try {
			// Get the page source using the WebDriver instance
			WebDriver driver = DriverFactory.getWebDriver()
			String pageSource = driver.getPageSource()

			// Check for the specific error message
			if (pageSource.contains("Your connection was interrupted")) {
				KeywordUtil.logInfo("Detected 'Your connection was interrupted' error.")
				return true
			}

			return false
		} catch (WebDriverException e) {
			// An exception while getting the page source might also indicate an unstable page
			KeywordUtil.logInfo("A WebDriver error occurred while checking for network issues.")
			return true
		} catch (Exception e) {
			// Handle any other unexpected errors
			KeywordUtil.logInfo("An unexpected error occurred: " + e.getMessage())
			return false
		}
	}
}