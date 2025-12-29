import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.google.com')

if (CustomKeywords.'networkUtil.ConnectionErrorDetector.isConnectionInterruptedError'()) {
    // Take action if a network error is found
    KeywordUtil.markWarning("Test failed due to network error. Retrying...")
    WebUI.refresh()
    WebUI.delay(5)
    // ... possibly call the keyword again
} else {
    // Continue with the test if everything is okay
    WebUI.comment("Page loaded successfully. Continuing test.")
    // ...
}

WebUI.closeBrowser()