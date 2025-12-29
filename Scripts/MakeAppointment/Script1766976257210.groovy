import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('http:/demoaut.katalon.com')

// Assuming user is already logged in or login steps can be added here

WebUI.click(findTestObject('Page_Home/btn_make_appointment'))
WebUI.setText(findTestObject('Page_Appointment/txt_date'), '2023-12-31')
WebUI.setText(findTestObject('Page_Appointment/txt_reason'), 'General Checkup')
WebUI.click(findTestObject('Page_Appointment/btn_book'))

WebUI.verifyElementPresent(findTestObject('Page_Appointment/confirmation_message'), 10)
WebUI.closeBrowser()
