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

Mobile.startApplication('5ea3b1bc-4d25-476c-8d70-d160c83e2323', true)

Mobile.setText(findTestObject('Object Repository/XCUIElementTypeSecureTextField - login_password'), 'test123', 0)

Mobile.setText(findTestObject('Object Repository/XCUIElementTypeTextField - login_email'), 'test@perfecto.com', 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Login'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeOther - list_add_btn'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Add'), 0)

Mobile.takeScreenshot('/var/folders/rt/z3fhc06x4nd0mj78vck7t7p40000gp/T/screenshot6835268221919921625.png')

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeTextView - edit_details'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Return (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Return (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeTextField - edit_currency'), 0)

Mobile.swipe(370, 1600, 370, 1500)

Mobile.closeApplication()

