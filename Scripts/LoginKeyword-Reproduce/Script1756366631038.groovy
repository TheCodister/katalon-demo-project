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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import javax.swing.JDialog as JDialog
import javax.swing.JOptionPane as JOptionPane
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import kill.KillProcess as KillProcess
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint


import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import javax.swing.JDialog
import javax.swing.JOptionPane
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import kill.KillProcess



//Login as Regional Manager
WebUI.openBrowser('')


WebUI.deleteAllCookies()

WebUI.navigateToUrl(GlobalVariable.RITAUrl)

WebDriver driver = DriverFactory.getWebDriver()

CustomKeywords.'mywork.MyworkLogin.LoginWithRitaUser'('')

WebUI.navigateToUrl(GlobalVariable.RITAUrlAct)

WebUI.delay(5)

CustomKeywords.'mywork.Table.closeMainTab'(driver)

//Start Initiate Institution
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down' //14
        ))

WebUI.click(findTestObject('RITA/Bank Projects/link_Accounts' //15
        ))

WebUI.click(findTestObject('RITA/Create Iniatiate Project/select-list_view'))

WebUI.delay(3)

WebUI.click(findTestObject('RITA/Create Iniatiate Project/select_activebank'))

WebUI.delay(3)

WebUI.click(findTestObject('RITA/Create Iniatiate Project/select_bank'))

WebUI.delay(3)

WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_on_intiate_project'))

WebUI.delay(3)

WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_on_create_sandbox'))

WebUI.delay(3)

WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_on_button_next'))

WebUI.delay(5)


//Optional Shared Loss
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
//WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_BidderManagement'))
//WebUI.delay(3)
//WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_BidderList'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtion = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtion))
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)


//EAI
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtionagain = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtionagain))
WebUI.click(findTestObject('RITA/Bank Projects/Select_EAI'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)


//Loan Pools
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtiononceagain = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtiononceagain))
WebUI.click(findTestObject('RITA/Bank Projects/Select_Loan Pools'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)


//ORE
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtiononceagainore = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtiononceagainore))
WebUI.click(findTestObject('RITA/Bank Projects/Select_ORE'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)


//Other Assets
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtiononceagainotherasset = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtiononceagainotherasset))
WebUI.click(findTestObject('RITA/Bank Projects/Select_Other Assets'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)


//Other Option
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtiononceagainotheroption = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtiononceagainotheroption))
WebUI.click(findTestObject('RITA/Bank Projects/Select_Other Option'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)


//Purchase Money Financing
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtionPurchaseMoneyFinancing = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtionPurchaseMoneyFinancing))
WebUI.click(findTestObject('RITA/Bank Projects/Select_Purchase Money Financing'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)


//Subsidiaries
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtionSubsidiaries = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtionSubsidiaries))
WebUI.click(findTestObject('RITA/Bank Projects/Select_Subsidiaries'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)


//Trust Business
WebUI.click(findTestObject('RITA/Questionnaire/button_Arrrow down'))
WebUI.click(findTestObject('RITA/Create Iniatiate Project/link_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/open_sandbox_project'))
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_TransactionOfferings'))
WebUI.delay(3)
WebUI.scrollToPosition(1000, 1000)
WebUI.delay(3)
WebUI.click(findTestObject('RITA/Create Iniatiate Project/click_Project Options'))
WebUI.delay(5)
WebElement selctSingleOPtionTrustBusiness = WebUiCommonHelper.findWebElement(findTestObject('RITA/Bank Projects/Select_Add Single Options'), 30)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(selctSingleOPtionTrustBusiness))
WebUI.click(findTestObject('RITA/Bank Projects/Select_Trust Business'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/button_ProjectOption_Next'))
WebUI.delay(5)
WebUI.click(findTestObject('RITA/Bank Projects/Button_Pojectoption_Save'))
WebUI.delay(5)
WebUI.closeBrowser()
