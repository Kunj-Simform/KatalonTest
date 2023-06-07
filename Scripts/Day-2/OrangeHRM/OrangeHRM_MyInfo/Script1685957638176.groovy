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

WebUI.navigateToUrl(GlobalVariable.OrangeHRM)

CustomKeywords.'com.OrangeHRM_Login.Login'()

WebUI.click(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/a_My Info'))

WebUI.setText(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    Firstname)

WebUI.setText(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/input_Employee Full Name_middleName'), 
    Middlename)

WebUI.setText(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    Lastname)

WebUI.setText(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    EmployeeId)

CustomKeywords.'com.OrangeHRM_Login.Waitforclick'('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/p_Successfully Updated',
	5)

WebUI.click(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/div_A'))

WebUI.click(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/button_Save'))

CustomKeywords.'com.OrangeHRM_Login.Waitforclick'('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/p_Successfully Updated', 
    5)

WebUI.click(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

