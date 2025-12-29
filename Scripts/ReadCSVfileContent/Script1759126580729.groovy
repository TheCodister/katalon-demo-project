import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testdata.CSVData
import com.kms.katalon.core.testdata.reader.CSVSeparator
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

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

import com.kms.katalon.core.testdata.CSVData as CSVData

import com.kms.katalon.core.testdata.reader.CSVSeparator as CSVSeparator

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

import com.kms.katalon.core.annotation.Keyword

'Get file Content from TestCloud'
String fileName = 'annual-enterprise-survey-2024-financial-year-provisional.csv'
//String encodedContent = CustomKeywords.'com.katalon.testcloud.FileExecutor.getFileContent'(fileName)
String encodedContent = (new com.katalon.testcloud.FileExecutor()).getFileContent(fileName)
byte[] decodedBytes = Base64.getDecoder().decode(encodedContent);

'Write the content to a new file'
String newFileLocation = new File(RunConfiguration.getProjectDir() + '/' + fileName).getCanonicalPath()
FileOutputStream outputStream = new FileOutputStream(newFileLocation);
outputStream.write(decodedBytes);
outputStream.close();

'Read the CSV file content (Excluding the headers)'
CSVData csvData = new CSVData(newFileLocation, true, CSVSeparator.COMMA)
List<List> allData = csvData.getAllData()

'Get row 27th, column 2nd'
println allData.get(26).get(1)