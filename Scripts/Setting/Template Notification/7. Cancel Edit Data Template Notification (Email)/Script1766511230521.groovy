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

WebUI.callTestCase(findTestCase('Login-Logout/1. Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu/Settings/Settings'))

WebUI.click(findTestObject('Menu/Settings/span_Template Notification'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Template Notification/button_Edit'))

WebUI.setText(findTestObject('Template Notification/input_code'), 'RFP_INITIATION_KATALON')

WebUI.setText(findTestObject('Template Notification/input_name'), 'Request for Payment Initiation Notification Katalon')

WebUI.setText(findTestObject('Template Notification/input_description'), ' Request for Payment Initiation Notification')

WebUI.click(findTestObject('Template Notification/ceklis email'))

WebUI.click(findTestObject('Template Notification/button Tambah'))

WebUI.setText(findTestObject('Template Notification/input_header'), 'Request for Payment Dikirim')

WebUI.setText(findTestObject('Template Notification/input_content'), '<html lang="en"><head>')

WebUI.click(findTestObject('Template Notification/button_Cancel'))

WebUI.click(findTestObject('Template Notification/button_Yes Cancel'))

