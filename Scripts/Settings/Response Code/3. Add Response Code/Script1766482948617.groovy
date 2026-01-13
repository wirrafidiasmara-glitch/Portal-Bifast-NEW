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

WebUI.click(findTestObject('Menu/Settings/span_Response Code'))

WebUI.click(findTestObject('Button_Global/Add'))

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Backend Name'), 'KOMI')

WebUI.click(findTestObject('Menu/Settings/Response Code/Backend Name_KOMI'))

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Backend Response Code'), '8082')

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Response Code'), '808')

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Response Category'), 'Testing123')

WebUI.setText(findTestObject('Menu/Settings/Response Code/Add_Response Message'), 'Sedang Test')

WebUI.click(findTestObject('Menu/Settings/Response Code/Add_Status_Inactive'))

WebUI.click(findTestObject('Button_Global/btn_Submit_EditRC'))

WebUI.click(findTestObject('Button_Global/btn_Yes'))

WebUI.delay(5)

WebUI.verifyTextPresent('Success To Submit Data', false)

