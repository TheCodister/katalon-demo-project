import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling // Adding FailureHandling import

// Open the browser and navigate to the login page
WebUI.openBrowser('')  // Insert the URL of the login page
WebUI.navigateToUrl('https://example.com/login')  // Replace with actual login URL

// Input username
WebUI.setText(findTestObject('Page_Login/input_Username'), 'yourUsername')  // Replace with the actual test object ID and username

// Input password
WebUI.setText(findTestObject('Page_Login/input_Password'), 'yourPassword')  // Replace with the actual test object ID and password

// Click login button
WebUI.click(findTestObject('Page_Login/button_Login'))  // Replace with actual test object ID for the login button

// Verify successful login
WebUI.verifyElementPresent(findTestObject('Page_Home/logo'), 10)  // Check for an element that's only present on the home page after login

// Close browser
WebUI.closeBrowser()