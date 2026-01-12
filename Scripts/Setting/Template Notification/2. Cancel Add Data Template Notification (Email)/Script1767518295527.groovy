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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://komi-bifast-fe-dev.commander.k8s.io/komi/bifast/auth')

WebUI.setText(findTestObject('Object Repository/Template Notification/record cancel/input_Username_userid'), 'userbifast09')

WebUI.setEncryptedText(findTestObject('Object Repository/Template Notification/record cancel/input_Password_p-inputtext p-component ng-t_b30a64'), 
    'iFGeFYmXIrUgEHdN1RQC0g==')

WebUI.sendKeys(findTestObject('Object Repository/Template Notification/record cancel/input_Password_p-inputtext p-component ng-t_b30a64'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Template Notification/record cancel/span_Settings'))

WebUI.click(findTestObject('Object Repository/Template Notification/record cancel/span_Template Notification'))

WebUI.click(findTestObject('Object Repository/Template Notification/record cancel/button_Add'))

WebUI.setText(findTestObject('Object Repository/Template Notification/record cancel/input__code'), 'RFP')

WebUI.setText(findTestObject('Object Repository/Template Notification/record cancel/input__name'), 'request for payment')

WebUI.click(findTestObject('Object Repository/Template Notification/record cancel/input_Email_notif'))

WebUI.setText(findTestObject('Object Repository/Template Notification/record cancel/textarea__description'), 'request for payment')

WebUI.click(findTestObject('Object Repository/Template Notification/record cancel/button_Email_p-ripple p-button p-component _876908'))

WebUI.setText(findTestObject('Object Repository/Template Notification/record cancel/input__header'), 'request for payment')

WebUI.setText(findTestObject('Object Repository/Template Notification/record cancel/textarea_Preview_content'), '<html')

WebUI.click(findTestObject('Object Repository/Template Notification/record cancel/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Template Notification/record cancel/button_Yes'))

