import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Dimension

// Window size was pre-configured in Desired Capabilities: --window-size=1440,900

WebUI.openBrowser('https://www.example.com')

// Get the configured window size
Dimension screenDimension = DriverFactory.getWebDriver().manage().window().getSize()

int width = screenDimension.getWidth()
int height = screenDimension.getHeight()

println("Current window dimensions: ${width} x ${height}")

// Use these values
WebUI.setViewPortSize(width, height)

WebUI.closeBrowser()