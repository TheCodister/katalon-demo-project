import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.w3schools.com/graphics/canvas_text.asp')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HTML Canvas Text/canvas_Your browser does not support the HT_984762'), 
    'Your browser does not support the HTML5 canvas tag.')

WebUI.click(findTestObject('Object Repository/Page_HTML Canvas Text/span_const canvas  document.getElementById(_103768'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_HTML Canvas Text/span_const canvas  document.getElementById(_103768'), 
    'const canvas = document.getElementById("myCanvas");\nconst ctx = canvas.getContext("2d");\nctx.font = "50px Arial";\nctx.fillText("Hello World",10,80);')

WebUI.verifyElementText(findTestObject('Object Repository/Page_HTML Canvas Text/canvas_Your browser does not support the HT_984762_1'), 
    'Your browser does not support the HTML5 canvas tag.')

WebUI.closeBrowser()

