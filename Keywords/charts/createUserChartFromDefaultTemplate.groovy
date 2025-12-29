package charts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.ThreadLocalRandom
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

import CustomKeywords

import smokeTest.SpinnerNotToBePresent

class createUserChartFromDefaultTemplate {
	/**
	 * Refresh browser
	 */


	@Keyword


	def createUserChartFromTemplate () {


		def spinnerNotToBePresent = new SpinnerNotToBePresent()
		spinnerNotToBePresent.Spinner()

		WebDriver driver = DriverFactory.getWebDriver()

		//select random template
		//number of templates
		List list1 = driver.findElements(By.xpath("//div[contains(text(),'USER CHARTS')]//preceding::a[contains(@data-testid,'app.ChartTemplate')]"))

		def countList1 = list1.size()

		println('Number of templates: ' + countList1)

		//WebUI.comment('Number of templates: ' + countList1)
		//index for  chart template

		def x = ThreadLocalRandom.current().nextInt(1, countList1)

		println('Template number under verification (initial):' + x)

		//WebUI.comment('Template number under verification (initial):' + x)
		WebUI.scrollToElement(findTestObject('Smoke Test Objects/Charts/Chart template index', [('index') : x]), 3)
		WebUI.delay(2)
		WebUI.click(findTestObject('Smoke Test Objects/Charts/Chart template index', [('index') : x]))
		WebUI.delay(2)
		WebUI.waitForPageLoad(1)

		WebUI.delay(2)

		CustomKeywords.'smokeTest.SpinnerNotToBePresent.Spinner'()
		CustomKeywords.'smokeTest.SpinnerNotToBePresent_ReactSpinnerCharts.Spinner'()

		// check that template name is not = project overview
		def tabNameTemplate1 = WebUI.getText(findTestObject('Smoke Test Objects/Charts/Chart template index', [('index') : x]))
		println('Name of chart template under verificaton: ' + tabNameTemplate1)

		def tabNameTemplate1_tesID = tabNameTemplate1.toLowerCase().replace(' ', '_')
		println ('test ID for created template' + tabNameTemplate1_tesID)

		//createdUserTemplate
		GlobalVariable.createdUserTemplate = tabNameTemplate1_tesID


		// save random template as a user chart
		WebUI.click(findTestObject('Smoke Test Objects/Charts/Top menu/Save/Save set/Save as'))
		WebUI.verifyElementPresent(findTestObject('Smoke Test Objects/Charts/Top menu/Save/Save set/Save successful/OK button'), 1)
		WebUI.verifyElementPresent(findTestObject('Smoke Test Objects/Charts/Top menu/Save/Save set/Save Configuration/Cancel button'), 1)
		WebUI.verifyElementPresent(findTestObject('Smoke Test Objects/Charts/Top menu/Save/Save set/Save Configuration/Close button'), 1)
		WebUI.verifyElementPresent(findTestObject('Smoke Test Objects/Charts/Top menu/Save/Save set/Save Configuration/Save Configuration in User-Chart text'),
				1)


		WebUI.click(findTestObject('Smoke Test Objects/Charts/Top menu/Save/Save set/Save successful/OK button'))
		WebUI.delay(2)
		CustomKeywords.'smokeTest.SpinnerNotToBePresent.Spinner'()
		CustomKeywords.'smokeTest.SpinnerNotToBePresent_ReactSpinnerCharts.Spinner'()
		WebUI.takeFullPageScreenshot('C:\\Users\\YakovliO\\Documents\\Katalon Screenshots\\Save successful text1.png')


		WebUI.click(findTestObject('Smoke Test Objects/Charts/Chart template index', [('index') : x+1]))
		WebUI.delay(2)
		WebUI.waitForPageLoad(1)

		WebUI.delay(2)

		CustomKeywords.'smokeTest.SpinnerNotToBePresent.Spinner'()
		CustomKeywords.'smokeTest.SpinnerNotToBePresent_ReactSpinnerCharts.Spinner'()


		WebUI.click(findTestObject('Object Repository/Smoke Test Objects/Charts/template by testID', [('testID') : GlobalVariable.createdUserTemplate]))
		WebUI.delay(1)
		CustomKeywords.'smokeTest.SpinnerNotToBePresent.Spinner'()
		CustomKeywords.'smokeTest.SpinnerNotToBePresent_ReactSpinnerCharts.Spinner'()
	}
}