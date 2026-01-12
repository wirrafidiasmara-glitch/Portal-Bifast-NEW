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
import java.nio.file.*

WebUI.callTestCase(findTestCase('User Profile/Sign In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu/Settings/Settings'))

WebUI.click(findTestObject('Menu/Settings/span_Composite Config'))

WebUI.click(findTestObject('Button_Global/button_Export'))

WebUI.setText(findTestObject('Menu/Settings/Composite Config/Export_Available Composite'), 'Testing23')

WebUI.click(findTestObject('Menu/Settings/Composite Config/li_Testing23  JSON  BMRIIDJA'))

WebUI.click(findTestObject('Menu/Settings/Composite Config/btn_addAvailable Composite'))

WebUI.click(findTestObject('Menu/Settings/Composite Config/btn_Export Selected'))

//Verifikasi file export ada
String downloadPath = "C:\\Users\\hutap\\Downloads"
String expectedPartialName = "composite"

int timeout = 30
boolean fileFound = false

File dir = new File(downloadPath)

for (int i = 0; i < timeout; i++) {

    File[] files = dir.listFiles()

    if (files != null) {
        fileFound = files.any { file ->
            file.isFile() &&
            file.name.contains(expectedPartialName) &&
            file.name.endsWith(".json") &&
            !file.name.endsWith(".crdownload") &&
            !file.name.endsWith(".part")
        }
    }

    if (fileFound) break
    WebUI.delay(1)
}

assert fileFound : "File tidak ditemukan"