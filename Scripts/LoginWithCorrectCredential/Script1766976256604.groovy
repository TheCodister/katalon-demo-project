import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('http:/demoaut.katalon.com')

WebUI.setText(findTestObject('Page_Login/txt_username'), 'correct_username')
WebUI.setEncryptedText(findTestObject('Page_Login/txt_password'), 'encrypted_password_here')
WebUI.click(findTestObject('Page_Login/btn_login'))

WebUI.verifyElementPresent(findTestObject('Page_Home/element_after_login'), 10)
WebUI.closeBrowser()
