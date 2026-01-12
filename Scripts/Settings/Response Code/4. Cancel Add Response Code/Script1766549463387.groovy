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

WebUI.click(findTestObject('Menu/Settings/Settings'))

WebUI.click(findTestObject('Menu/Settings/span_Response Code'))

WebUI.click(findTestObject('Button_Global/Add'))

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Backend Name'), 'BIFAST-GATEWAY  - BMRIIDJA')

WebUI.doubleClick(findTestObject('Menu/Settings/Response Code/Element Add'))

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Backend Response Code'), 'T357')

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Response Code'), 'T357')

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Response Category'), 'BUSINESS_ERROR')

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Response Message'), 'Sedang Test')

WebUI.click(findTestObject('Menu/Settings/Response Code/Add_Status_Active'))

WebUI.click(findTestObject('Button_Global/Cancel'))

WebUI.click(findTestObject('Button_Global/btn_Yes'))

