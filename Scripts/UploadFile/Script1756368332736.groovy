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
import com.katalon.testcloud.FileExecutor as TestCloudKeyword
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.Paths

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser('')
WebUI.navigateToUrl('https://v0-file-upload-app-three.vercel.app/')

String fileName = "test-data1.csv" 
String projectSubFolder = "ExcelDatafile" // <-- Change this if your file is in a different folder

// Dynamically construct the ABSOLUTE path for the current execution environment
// RunConfiguration.getProjectDir() gets the root path, regardless of OS
String absolutePath = Paths.get(RunConfiguration.getProjectDir(), projectSubFolder, fileName).toString()

log.logInfo("Call successfully")

KeywordUtil.logInfo("Resolved upload path: " + absolutePath)

// Upload the file
CustomKeywords.'com.katalon.testcloud.FileExecutor.uploadFileToWeb'(
    findTestObject('Object Repository/Page_v0 App/div_Drop files hereorBrowse Files'),
    absolutePath  // Use the guaranteed absolute path
)

log.logWarning("This is a warning")

// Get file content using the ABSOLUTE path
String fileContent = CustomKeywords.'com.katalon.testcloud.FileExecutor.getFileContent'(absolutePath)
println(absolutePath)
String decodedBytes = Base64.getDecoder().decode(fileContent)
println(decodedBytes)  // Changed from print to println for better console logging

log.logFailed("The element appear")

WebUI.closeBrowser()