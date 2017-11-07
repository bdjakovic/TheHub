import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('Equity Deal/New Deal button'), 5)

WebUI.click(findTestObject('Equity Deal/New Deal button'))

WebUI.click(findTestObject('Equity Deal/Equity deal button'))

WebUI.setText(findTestObject('Equity Deal/Deal Name Field'), 'Bojan2')

WebUI.selectOptionByValue(findTestObject('Equity Deal/Deal Is dropdown'), '4', true)

WebUI.delay(2)

WebUI.click(findTestObject('Equity Deal/ELITE Partner field'))

WebUI.click(findTestObject('Equity Deal/ELITE Partner field select'))

WebUI.delay(1)

WebUI.click(findTestObject('Equity Deal/Use Of Proceeds field'))

WebUI.click(findTestObject('Equity Deal/Use Of Proceeds field select'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.delay(1)

WebUI.click(findTestObject('Equity Deal/Entity Name field'))

WebUI.click(findTestObject('Equity Deal/Entity Name field Select'))

WebUI.selectOptionByValue(findTestObject('Equity Deal/Platform Status'), '1', true)

WebUI.delay(2)

WebUI.click(findTestObject('Equity Deal/Next button'))

WebUI.setText(findTestObject('Equity Deal/Final Price for Follow-on Investor field'), '123')

WebUI.setText(findTestObject('Equity Deal/Number of Shares Issued field'), '123')

WebUI.delay(2)

WebUI.click(findTestObject('Equity Deal/Expected Close Date field'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Equity Deal/Expected Close Date select'))

WebUI.selectOptionByValue(findTestObject('Equity Deal/Guarantor dropdown'), '0', true)

WebUI.click(findTestObject('Equity Deal/Next button'))

WebUI.click(findTestObject('Equity Deal/Next button'))

WebUI.click(findTestObject('Equity Deal/Next button'))

WebUI.click(findTestObject('Equity Deal/Finish button'))

WebUI.closeBrowser()

