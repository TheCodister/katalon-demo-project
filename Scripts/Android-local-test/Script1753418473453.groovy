import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

//import com.kms.katalon.core.mobile.driver.MobileDriverFactory
Mobile.startApplication('/Users/quang.nnguyen/Downloads/application-8fc26f8e-16c6-4626-9cf4-37367f5ca189 (1).apk', true)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView -  Todays tasks'), 20)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView -  Todays tasks'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Write a task'), 'This is a big text', 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

// Get the Appium driver
AppiumDriver driver = MobileDriverFactory.getDriver()

// Retrieve the page source (DOM tree)
String pageSource = driver.getPageSource()

// Log the DOM tree
//println("=== Page Source ===")
println(pageSource)

Mobile.closeApplication()

