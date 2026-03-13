import org.openqa.selenium.WebDriver
import org.openqa.selenium.JavascriptExecutor
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import org.apache.pdfbox.Loader
import java.util.Base64
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory

// Open the website with PDF
WebUI.openBrowser('https://smallpdf.com/blog/sample-pdf')

// Click button to download PDF
TestObject btnDownloadSamplePDF = findTestObject("Object Repository/Download Files/btnDownloadSamplePDF")
WebUI.scrollToElement(btnDownloadSamplePDF, 3)
WebUI.click(btnDownloadSamplePDF)

TestObject btnDownload = findTestObject("Object Repository/Download Files/btnDownload")
WebUI.click(btnDownload)

// Navigate to Chrome downloads page to get the file name
WebDriver driver = DriverFactory.getWebDriver()
driver.get('chrome://downloads/')

// Get the latest downloaded file name
String fileName = ((JavascriptExecutor) driver).executeScript(
    "return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList').items.filter(e => e.state === 2).map(e => e.fileName)[0];"
)

WebUI.back()

// Retrieve Base64-encoded content from TestCloud
String encodedContent = CustomKeywords.'com.katalon.testcloud.FileExecutor.getFileContent'(fileName)
byte[] decodedBytes = Base64.getDecoder().decode(encodedContent)

// Use PDFBox to read and verify the PDF content
PDDocument document = Loader.loadPDF(decodedBytes)
PDFTextStripper pdfStripper = new PDFTextStripper()
String text = pdfStripper.getText(document)

println "Extracted PDF Content:\n" + text

// Verify specific content in the PDF
WebUI.verifyTrue(text.contains('Expected Text'), 'PDF contains expected content')

document.close()