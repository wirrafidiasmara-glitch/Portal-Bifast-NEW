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

WebUI.click(findTestObject('Menu/Settings/span_Composite Config'))

WebUI.setText(findTestObject('Button_Global/Search'), 'Katalon')

WebUI.click(findTestObject('Button_Global/Copy'))

WebUI.setText(findTestObject('Menu/Settings/Composite Config/Add_Composite Code'), 'Testing23')

WebUI.click(findTestObject('Menu/Settings/Composite Config/btn_Add Step'))

WebUI.setText(findTestObject('Menu/Settings/Composite Config/AddStep_Step Name'), 'Step2')

WebUI.setText(findTestObject('Menu/Settings/Composite Config/AddStep_Step Service'), 'Katalon12324')

WebUI.click(findTestObject('Menu/Settings/Composite Config/AddStep_Action On Exception'))

WebUI.click(findTestObject('Menu/Settings/Composite Config/li_Ignore'))

WebUI.setText(findTestObject('Menu/Settings/Composite Config/AddStep_Compensation Code'), '93')

WebUI.click(findTestObject('Menu/Settings/Composite Config/input__N'))

WebUI.click(findTestObject('Menu/Settings/Composite Config/AddStep_Backend'))

WebUI.click(findTestObject('Menu/Settings/Composite Config/li_BIFAST-API - GLOBAL'))

WebUI.click(findTestObject('Menu/Settings/Composite Config/btn_Submit'))

WebUI.click(findTestObject('Button_Global/btn_Yes'))

WebUI.verifyTextPresent('Step Added successfully (not saved)', false)

WebUI.delay(3)

WebUI.click(findTestObject('Button_Global/Cancel'))

WebUI.click(findTestObject('Button_Global/btn_Yes'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('Success To Submit Data', false)

