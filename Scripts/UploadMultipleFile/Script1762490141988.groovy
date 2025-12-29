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
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.Paths

WebUI.openBrowser('')
WebUI.navigateToUrl('https://v0-file-upload-app-three.vercel.app/')

// Define file names
List<String> fileNames = ["test-data1.csv", "test-data2.csv", "test-data3.csv"]
String projectSubFolder = "ExcelDatafile"

// Upload each file using for loop
for (int i = 0; i < fileNames.size(); i++) {
    String fileName = fileNames[i]
    
    // Construct absolute path for each file
    String absolutePath = Paths.get(RunConfiguration.getProjectDir(), projectSubFolder, fileName).toString()
    
    KeywordUtil.logInfo("Uploading file " + (i + 1) + ": " + absolutePath)
    
    // Upload the file
    WebUI.uploadFile(
        findTestObject('Object Repository/Page_v0 App/div_Drop files hereorBrowse Files'),
        absolutePath
    )
    
    // Optional: Add delay between uploads
    WebUI.delay(2)
}

KeywordUtil.logInfo("All 3 files uploaded successfully!")

WebUI.closeBrowser()