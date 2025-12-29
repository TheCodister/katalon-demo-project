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
WebUI.navigateToUrl('https://canvas-demo-website.vercel.app/')

// Define a list of coordinate pairs you want to test
List<List<Integer>> coordinates = [
    [90, 30],
    [60, 120],
    [400, 20],
    [200, 80],
    [-200, 100]
]

// Store chart values here
List<String> chartValues = []

TestObject canvas = findTestObject('Object Repository/Page_/canvas_ValueMonthSample Monthly Data Chart010203') //Test object

for (List<Integer> coord : coordinates) {
    int x = coord[0]
    int y = coord[1]

    WebUI.mouseOverOffset(canvas, x, y)
    WebUI.delay(2)  // Give tooltip time to appear

    String chartText = WebUI.getText(canvas)

    // Trim based on fixed offset (adjust if needed)
    String trimmedText = chartText.length() > 122 ? chartText.substring(122) : chartText

    chartValues.add(trimmedText)
}

// Print all collected values
for (String value : chartValues) {
    println(value)
}
