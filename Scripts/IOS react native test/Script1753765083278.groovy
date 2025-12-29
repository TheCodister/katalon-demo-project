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

Mobile.startApplication('/Users/quang.nnguyen/Downloads/reactnativesample.app', true)

Mobile.swipe(400, 550, 400, 490)

Mobile.setText(findTestObject('Object Repository/XCUIElementTypeTextField - text-input'), 'I have an erection', 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - popup-button'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Close'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Interaction, tab, 2 of 2'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeOther - double-tap-box'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeOther - double-tap-box'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeSwitch - switch-toggle'), 0)

Mobile.swipe(400, 900, 600, 900)

Mobile.closeApplication()

