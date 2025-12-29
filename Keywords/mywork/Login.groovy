package mywork
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.text.SimpleDateFormat as SimpleDateFormat
import java.text.DateFormat as DateFormat
import java.util.Date as Date
import java.util.Calendar as Calendar
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.Keys as Keys
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import javax.swing.JDialog
import javax.swing.JOptionPane
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.slf4j.LoggerFactory

import ch.qos.logback.classic.Logger;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder

import ch.qos.logback.core.ConsoleAppender

public class Login {


	/**
	 * Login with User
	 */
	@Keyword
	def customizeConsoleLog() {

		Logger rootLogger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)

		rootLogger.iteratorForAppenders().forEachRemaining({appender ->

			if (appender instanceof ConsoleAppender) {

				ConsoleAppender<?> consoleAppender = (ConsoleAppender<?>) appender;PatternLayoutEncoder newEncoder = new PatternLayoutEncoder();

				newEncoder.setContext(rootLogger.getLoggerContext());

				// Remove timestamp from pattern

				//newEncoder.setPattern("[%thread] %-5level %logger{36} - %msg%n");

				newEncoder.setPattern("[%msg%n");

				newEncoder.start();consoleAppender.setEncoder(newEncoder);

		});
	}
}