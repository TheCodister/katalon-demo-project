package baseUtil;

import java.nio.file.Files
import java.nio.file.Path
import com.kms.katalon.core.annotation.Keyword
import java.nio.file.Paths
import java.util.stream.Collectors
import com.kms.katalon.core.util.KeywordUtil
import java.io.IOException
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import internal.GlobalVariable
import java.util.Optional // Added for Optional usage in verifyFileExistsByPartialName

public class NewFileDownload {

	/**
	 * Checks if the test is running in the TestCloud environment.
	 */
	private boolean isTestCloudExecution() {
		return System.getenv().containsKey('TESTOPS_SESSION_ID')
	}

	/**
	 * This method does NOT use a polling loop. It checks only once due to TestCloud issue.
	 * @param expectedFileName The exact name of the file to expect (e.g., "some-file.txt").
	 * @param timeoutInSeconds The maximum time to wait for the file to download.
	 * @return true if the file is downloaded successfully within the timeout, false otherwise.
	 */
	@Keyword
	def verifyFileExists(String expectedFileName) {

		// Check if we are running in TestCloud.
		if (isTestCloudExecution()) {
			WebUI.comment("Execution in Testcloud, perform verify with Chrome Download path")
			WebDriver driver = DriverFactory.getWebDriver()
			driver.get('chrome://downloads/')

			WebUI.delay(2)

			// Fetch the latest downloaded file path using JavaScript
			String latestDownloadFile = (String) ((JavascriptExecutor) driver).executeScript(
					"return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').innerText.trim()"
					)

			WebUI.comment('Latest Download File is: ' + latestDownloadFile)

			//Verify the latest download File exist
			// NOTE: CustomKeywords.'com.katalon.testcloud.FileExecutor.exist' should be FileExecutor.exist
			// assuming 'com.katalon.testcloud.FileExecutor' is imported or fully qualified
			if (CustomKeywords.'com.katalon.testcloud.FileExecutor.exist'(latestDownloadFile)) {

				KeywordUtil.logInfo('Passed - Latest download File exist')
				KeywordUtil.markPassed("Passed - Latest download File exist. File name: " + latestDownloadFile)
			} else {

				KeywordUtil.logInfo('Failed - Latest download File not exist')
				KeywordUtil.markFailedAndStop('Failed - Latest download File not exist')
			}
		} else {
			// If run other than testCloud, and have access to download folder, perform this
			Path downloadsDir = Paths.get(System.getProperty("user.home"), "Downloads")

			Path targetPath = downloadsDir.resolve(expectedFileName)

			if (Files.exists(targetPath) && Files.isRegularFile(targetPath)) {
				// "Found ${targetPath.toAbsolutePath()}"
				//WebUI.comment ("Found ${targetPath.toAbsolutePath()}")
				KeywordUtil.markPassed("Found ${targetPath.toAbsolutePath()}")
				WebUI.comment("Latest Download File is: ${targetPath.toAbsolutePath()}")
			} else {
				//WebUI.comment("No file named ${expectedFileName} in $downloadsDir")
				KeywordUtil.markWarning("No file named ${expectedFileName} in $downloadsDir")
			}
		}
	}

	/**
	 * Verifies if a file starting with the partial name exists in the Downloads directory.
	 * This method does NOT use a polling loop. It checks only once due to TestCloud issue.
	 * @param partialFileName The beginning part of the file to search for.
	 * @return The full name of the found file, or null if not found.
	 */
	@Keyword

	String verifyFileExistsByPartialName(String partialFileName) {
		// Check if we are running in TestCloud.
		if (isTestCloudExecution()) {
			WebUI.comment("Execution in Testcloud, perform verify with Chrome Download path")

			WebDriver driver = DriverFactory.getWebDriver()
			driver.get('chrome://downloads/')

			WebUI.delay(2)

			// Fetch the latest downloaded file path using JavaScript
			String latestDownloadFile = (String) ((JavascriptExecutor) driver).executeScript(
					"return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').innerText.trim()"
					)

			WebUI.comment('Latest Download File is: ' + latestDownloadFile);

			//Verify the latest download File exist
			// NOTE: CustomKeywords.'com.katalon.testcloud.FileExecutor.exist' should be FileExecutor.exist
			// assuming 'com.katalon.testcloud.FileExecutor' is imported or fully qualified
			if (CustomKeywords.'com.katalon.testcloud.FileExecutor.exist'(latestDownloadFile)) {

				KeywordUtil.logInfo('Passed - Latest download File exist')
				KeywordUtil.markPassed("Passed - Latest download File exist. File name: " + latestDownloadFile)
			} else {

				KeywordUtil.logInfo('Failed - Latest download File not exist')
				KeywordUtil.markFailedAndStop("Failed - Latest download File not exist")
			}
		} else {

			Path downloadDir = Paths.get(System.getProperty("user.home"), "Downloads").toAbsolutePath()
			KeywordUtil.logInfo("Searching for a file starting with '${partialFileName}' in: " + downloadDir.toString())

			try {
				// Try to find the first file that starts with the partial name.
				Optional<Path> foundFile = Files.list(downloadDir)
						.filter({path -> path.getFileName().toString().startsWith(partialFileName) && Files.isRegularFile(path)})
						.findFirst()

				if (foundFile.isPresent()) {
					String fullFileName = foundFile.get().getFileName().toString()
					KeywordUtil.markPassed("SUCCESS: Found file: '${fullFileName}'")
					return fullFileName // Return the full name of the found file
				} else {
					KeywordUtil.markWarning("No file starting with '${partialFileName}' was found in ${downloadDir}")
					return null // Return null if no file was found
				}
			} catch (IOException e) {
				KeywordUtil.markWarning("Could not scan Downloads directory for verification. Reason: " + e.getMessage())
				return null
			}
		}
	}
}