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

WebUI.setText(findTestObject('Object Repository/Monitoring/History Network Management Message/input_Username_userid'), 'userbifast09')

WebUI.setEncryptedText(findTestObject('Object Repository/Monitoring/History Network Management Message/input_Password_p-inputtext p-component ng-t_b30a64'), 
    'iFGeFYmXIrUgEHdN1RQC0g==')

WebUI.sendKeys(findTestObject('Object Repository/Monitoring/History Network Management Message/input_Password_p-inputtext p-component ng-t_b30a64'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Monitoring/History Network Management Message/span_Monitoring'))

WebUI.click(findTestObject('Object Repository/Monitoring/History Network Management Message/span_History'))

WebUI.click(findTestObject('Object Repository/Monitoring/History Network Management Message/span_Network Management Message'))

WebUI.click(findTestObject('Object Repository/Monitoring/History Network Management Message/button_Filter Data'))

WebUI.setText(findTestObject('Object Repository/Monitoring/History Network Management Message/input_Clear_p-inputtext p-component ng-pris_a014f4'), 
    'TEST')

