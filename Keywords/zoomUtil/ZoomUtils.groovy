package zoomUtil

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver

class ZoomUtils {

	/**
	 * Sets the browser zoom level using the CSS 'transform: scale()' property.
	 * This is generally more reliable and modern than using the 'zoom' property.
	 * @param scaleFactor The desired zoom level as a decimal (e.g., 0.7 for 70%).
	 */
	@Keyword
	def static void setZoomByScale(double scaleFactor) {
		WebDriver driver = DriverFactory.getWebDriver()

		// Use JavaScript to change the CSS 'transform' property of the document body
		String script = "document.body.style.transformOrigin = '0 0'; document.body.style.transform = 'scale(${scaleFactor})';"

		try {
			((JavascriptExecutor) driver).executeScript(script)
			KeywordUtil.logInfo("Browser zoom set to ${scaleFactor * 100}% using CSS Transform.")
		} catch (Exception e) {
			KeywordUtil.markFailed("Failed to set browser zoom via CSS Transform. Reason: " + e.getMessage())
		}
	}

	@Keyword

	def static void setBrowserZoom(int zoomPercentage) {

		WebDriver driver = DriverFactory.getWebDriver()
		// Convert the percentage to a decimal value (e.g., 60 -> 0.6)
		double zoomFactor = zoomPercentage / 100.0
		// Use JavaScript to change the CSS 'zoom' property of the document body
		// The 'transform: scale()' property is also a good alternative for modern browsers
		String script = "document.body.style.zoom = '${zoomFactor}';"
		try {
			((JavascriptExecutor) driver).executeScript(script)
			KeywordUtil.logInfo("Browser zoom set to ${zoomPercentage}% successfully.")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Failed to set browser zoom to ${zoomPercentage}%. Reason: " + e.getMessage())
		}
	}

	/**
	 * Sets the browser zoom level using the CSS 'zoom' property.
	 * @param scaleFactor The desired zoom level as a decimal (e.g., 0.7 for 70%).
	 */
	@Keyword
	def static void setZoomByNative(double scaleFactor) {
		WebDriver driver = DriverFactory.getWebDriver()

		String script = "document.body.style.zoom = '${scaleFactor}';"

		try {
			((JavascriptExecutor) driver).executeScript(script)
			KeywordUtil.logInfo("Browser zoom set to ${scaleFactor * 100}% using native zoom property.")
		} catch (Exception e) {
			KeywordUtil.markFailed("Failed to set browser zoom via native zoom. Reason: " + e.getMessage())
		}
	}
}