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

WebUI.click(findTestObject('Menu/Settings/Settings'))

WebUI.click(findTestObject('Menu/Settings/span_Transaction Management'))

WebUI.click(findTestObject('Button_Global/Add'))

WebUI.setText(findTestObject('Menu/Settings/Transaction Management/Add_Description Feature'), 'Testing Katalon')

WebUI.setText(findTestObject('Menu/Settings/Transaction Management/Add_Transaction Type'), 'Emandate')

WebUI.click(findTestObject('Menu/Settings/Transaction Management/Add_DropDown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu/Settings/Transaction Management/Add_Outgoing Status_Inactive'))

WebUI.click(findTestObject('Menu/Settings/Transaction Management/Add_Incoming Status_Inactive'))

WebUI.click(findTestObject('Button_Global/Cancel'))

WebUI.click(findTestObject('Button_Global/btn_Yes'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('Success To Submit Data', false)

