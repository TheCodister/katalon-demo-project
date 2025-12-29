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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

// Define the paths to your Excel files
String excelFilePath1 = '/Users/quang.nnguyen/Downloads/OneDrive_1_8-26-2025/Sample Data 1.xlsx'
String excelFilePath2 = '/Users/quang.nnguyen/Downloads/Sample Data.xlsx'
String excelFilePath3 = '/Users/quang.nnguyen/Downloads/SampleSheet.xlsx'

// --- Read Sample Data 1.xlsx ---
KeywordUtil.logInfo("--- Reading Sample Data 1.xlsx ---")

try {
	// Read all data from the first sheet
	List<List<String>> excelData1 = ExcelKeywords.getExcelSheet(excelFilePath1, 0)
	
	// Print the data row by row
	for (List<String> rowData : excelData1) {
		KeywordUtil.logInfo(rowData.toString())
	}
	KeywordUtil.logInfo("Reading of file 1 complete.")

} catch (Exception e) {
	KeywordUtil.markFailed("Failed to read Excel file 1: " + e.getMessage())
}


// --- Read Sample Data.xlsx ---
//KeywordUtil.logInfo("--- Reading Sample Data.xlsx ---")
//
//try {
//	// Read all data from the first sheet
//	List<List<String>> excelData2 = Excel.getExcelDataAsList(excelFilePath2, "Sheet1", true)
//	
//	// Print the data row by row
//	for (List<String> rowData : excelData2) {
//		KeywordUtil.logInfo(rowData.toString())
//	}
//	KeywordUtil.logInfo("Reading of file 2 complete.")
//
//} catch (Exception e) {
//	KeywordUtil.markFailed("Failed to read Excel file 2: " + e.getMessage())
//}

//import com.kms.katalon.core.util.KeywordUtil
//import org.apache.poi.ss.usermodel.Cell
//import org.apache.poi.ss.usermodel.CellType
//import org.apache.poi.ss.usermodel.Row
//import org.apache.poi.ss.usermodel.Sheet
//import org.apache.poi.ss.usermodel.Workbook
//import org.apache.poi.xssf.usermodel.XSSFWorkbook // For .xlsx files
//import org.apache.poi.hssf.usermodel.HSSFWorkbook // For .xls files
//import java.io.File
//import java.io.FileInputStream
//import java.io.IOException
//
//// --- Function to read and print Excel content ---
//def readExcelFile(String filePath) {
//	KeywordUtil.logInfo("Attempting to read Excel file: " + filePath)
//
//	File excelFile = new File(filePath)
//	if (!excelFile.exists()) {
//		KeywordUtil.markFailed("Excel file not found at: " + filePath)
//		return
//	}
//
//	FileInputStream fis = null
//	Workbook workbook = null
//
//	try {
//		fis = new FileInputStream(excelFile)
//		String fileExtension = filePath.substring(filePath.lastIndexOf(".") + 1)
//
//		if (fileExtension.equalsIgnoreCase("xlsx")) {
//			workbook = new XSSFWorkbook(fis)
//			KeywordUtil.logInfo("Detected .xlsx file format.")
//		} else if (fileExtension.equalsIgnoreCase("xls")) {
//			workbook = new HSSFWorkbook(fis)
//			KeywordUtil.logInfo("Detected .xls file format.")
//		} else {
//			KeywordUtil.markFailed("Unsupported file format. Please provide a .xlsx or .xls file.")
//			return
//		}
//
//		// Get the first sheet
//		Sheet sheet = workbook.getSheetAt(0)
//		KeywordUtil.logInfo("Reading data from sheet: " + sheet.getSheetName())
//
//		// Iterate over rows
//		for (Row row : sheet) {
//			StringBuilder rowData = new StringBuilder()
//			// Iterate over cells
//			for (Cell cell : row) {
//				switch (cell.getCellType()) {
//					case CellType.STRING:
//						rowData.append(cell.getStringCellValue()).append("\t")
//						break
//					case CellType.NUMERIC:
//						rowData.append(cell.getNumericCellValue()).append("\t")
//						break
//					case CellType.BOOLEAN:
//						rowData.append(cell.getBooleanCellValue()).append("\t")
//						break
//					case CellType.FORMULA:
//						try {
//							rowData.append(cell.getNumericCellValue()).append("\t")
//						} catch (IllegalStateException e) {
//							rowData.append(cell.getStringCellValue()).append("\t")
//						}
//						break
//					case CellType.BLANK:
//						rowData.append("[BLANK]").append("\t")
//						break
//					default:
//						rowData.append("[UNKNOWN]").append("\t")
//				}
//			}
//			KeywordUtil.logInfo(rowData.toString().trim())
//		}
//
//	} catch (IOException e) {
//		KeywordUtil.markFailed("Error reading Excel file: " + e.getMessage())
//	} catch (Exception e) {
//		KeywordUtil.markFailed("An unexpected error occurred: " + e.getMessage())
//	} finally {
//		if (workbook != null) {
//			try {
//				workbook.close()
//			} catch (IOException e) {
//				KeywordUtil.logWarning("Failed to close workbook: " + e.getMessage())
//			}
//		}
//		if (fis != null) {
//			try {
//				fis.close()
//			} catch (IOException e) {
//				KeywordUtil.logWarning("Failed to close file input stream: " + e.getMessage())
//			}
//		}
//	}
//}
//// --- End of Excel reading function ---
//
//// Define the paths to your Excel files
////String excelFilePath1 = '/Users/quang.nnguyen/Downloads/Sample Data 1.xlsx'
////String excelFilePath2 = '/Users/quang.nnguyen/Downloads/Sample Data.xlsx'
//String excelFilePath3 = '/Users/quang.nnguyen/Downloads/SampleSheet.xlsx'
//
//// --- Call the function for each file ---
//KeywordUtil.logInfo("--- Reading Sample Data 1.xlsx ---")
//readExcelFile(excelFilePath3)
//KeywordUtil.logInfo("Reading of file 1 complete.")
//
////KeywordUtil.logInfo("--- Reading Sample Data.xlsx ---")
////readExcelFile(excelFilePath2)
////KeywordUtil.logInfo("Reading of file 2 complete.")
