import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class MemoryMonitor {
    
    @BeforeTestSuite
    def beforeSuite(TestSuiteContext testSuiteContext) {
        println("\n" + "="*60)
        println("TEST SUITE STARTED: ${testSuiteContext.getTestSuiteId()}")
        println("="*60)
        printMemoryInfo("SUITE START", null)
    }
    
    @AfterTestSuite
    def afterSuite(TestSuiteContext testSuiteContext) {
        printMemoryInfo("SUITE END", null)
        println("="*60)
        println("TEST SUITE COMPLETED: ${testSuiteContext.getTestSuiteId()}")
        println("="*60 + "\n")
    }
    
    @BeforeTestCase
    def beforeTestCase(TestCaseContext testCaseContext) {
        printMemoryInfo("BEFORE TEST CASE", testCaseContext)
    }
    
    @AfterTestCase
    def afterTestCase(TestCaseContext testCaseContext) {
        printMemoryInfo("AFTER TEST CASE", testCaseContext)
    }
    
    private void printMemoryInfo(String phase, TestCaseContext testCaseContext) {
        Runtime runtime = Runtime.getRuntime()
        
        long totalMemory = runtime.totalMemory()      // Total allocated memory
        long freeMemory = runtime.freeMemory()        // Free memory within allocated space
        long usedMemory = totalMemory - freeMemory    // Currently used memory
        long maxMemory = runtime.maxMemory()          // Maximum available memory
        
        double usagePercent = (usedMemory * 100.0) / maxMemory
        
        println("--- MEMORY INFO [$phase] ---")
        
        if (testCaseContext != null) {
            println("Test Case: ${testCaseContext.getTestCaseId()}")
        }
        
        println("Total Allocated: ${formatBytes(totalMemory)}")
        println("Used Memory: ${formatBytes(usedMemory)}")
        println("Free Memory: ${formatBytes(freeMemory)}")
        println("Max Memory: ${formatBytes(maxMemory)}")
        println("Usage: ${String.format('%.2f%%', usagePercent)}")
        println("-----------------------------\n")
    }
    
    private String formatBytes(long bytes) {
        if (bytes <= 0) return "0 B"
        final String[] units = ["B", "KB", "MB", "GB"]
        int digitGroups = (Math.log10(bytes) / Math.log10(1024)).toInteger()
        return String.format("%.2f %s", bytes / Math.pow(1024, digitGroups), units[digitGroups])
    }
}