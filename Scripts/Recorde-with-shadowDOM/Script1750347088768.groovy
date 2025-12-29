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

WebUI.navigateToUrl('https://www.ti.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Analog  Embedded processing  Semicondu_0c2cac/a_Products'))

WebUI.click(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Analog  Embedded processing  Semicondu_0c2cac/a_Applications'))

WebUI.click(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Analog  Embedded processing  Semicondu_0c2cac/a_Design  development'))

WebUI.click(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Analog  Embedded processing  Semicondu_0c2cac/a_Quality  reliability'))

WebUI.click(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Analog  Embedded processing  Semicondu_0c2cac/a_Ordering resources'))

WebUI.click(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Analog  Embedded processing  Semicondu_0c2cac/a_About TI'))

WebUI.click(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Analog  Embedded processing  Semicondu_0c2cac/a_Search jobs'))

WebUI.click(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Search Jobs - Texas Instruments Careers/span_Find your role'))

WebUI.verifyElementText(findTestObject('Object Repository/ShadowDOM-RPlus-Object/Page_Search Jobs - Texas Instruments Careers/span_Find your role'), 
    'Find your role')

WebUI.closeBrowser()

