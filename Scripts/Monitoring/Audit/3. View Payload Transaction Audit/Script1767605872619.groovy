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

WebUI.callTestCase(findTestCase('User Profile/Sign In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu/Monitoring/span_Monitoring'))

WebUI.click(findTestObject('Menu/Monitoring/Audit/span_Audit'))

WebUI.click(findTestObject('Menu/Monitoring/Audit/Audit_Transaction Audit'))

WebUI.setText(findTestObject('Button_Global/Search'), 'a6f4519a-c0dc-49f3-85c8-c6dbc8773d25')

WebUI.delay(3)

WebUI.click(findTestObject('Button_Global/View'))

WebUI.click(findTestObject('Button_Global/max_min'))

WebUI.click(findTestObject('Menu/Monitoring/Audit/Transaction Audit/View'))

WebUI.verifyElementPresent(findTestObject('Menu/Monitoring/Audit/Transaction Audit/Element_Payload'), 0)

