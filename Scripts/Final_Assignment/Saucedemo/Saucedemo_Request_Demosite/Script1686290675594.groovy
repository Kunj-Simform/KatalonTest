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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Saucedemo)

CustomKeywords.'com.Saucedemo_Login.Login'('Object Repository/Assignment/SauceDemo/Page_Swag Labs/input_Swag Labs_user-name', 
    EndUser, 'Object Repository/Assignment/SauceDemo/Page_Swag Labs/input_Swag Labs_password', Password, 'Object Repository/Assignment/SauceDemo/Page_Swag Labs/input_Swag Labs_login-button')

WebUI.delay(3)

WebUI.getUrl().equals('https://www.saucedemo.com/inventory.html')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Assignment/SauceDemo/Page_Swag Labs/input_Swag Labs_login-button'), 
    1)

WebUI.click(findTestObject('Object Repository/Assignment/SauceDemo/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Assignment/SauceDemo/Page_Swag Labs/a_About'))

WebUI.click(findTestObject('Object Repository/Assignment/SauceDemo/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/button_Request a demo'))

String str = 'FirstName'

TestObject Firstname = findTestObject('Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__FirstName', [('Empid') : str])

WebUI.setText(Firstname, 'Kunj')

WebUI.setText(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__LastName'), Lastname)

WebUI.setText(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Email'), Email1)

WebUI.setText(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Company'), Company)

WebUI.selectOptionByValue(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/select_Select.AfghanistanAlbaniaAlgeriaAndo_2e5989'), 
    'India', true)

WebUI.setText(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Phone'), Phonenumber)

WebUI.selectOptionByValue(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/select_Select.Sauce Cross-BrowserSauce Mobi_6b7086'), 
    'Cross-Browser Testing', true)

WebUI.setText(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/textarea__Sales_Contact_Comments__c'), 
    'none')

WebUI.click(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/label_Please check this box if youd like to_15e628'))

WebUI.click(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/button_Submit'))

WebUI.verifyTextPresent('Enter valid business email address', false)

WebUI.click(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/span_Company details'))

//WebUI.scrollToElement(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Email'), 
//    Email1)

WebUI.setText(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Email'), Email2)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Email'), 
    'value', Email2, 0)

WebUI.click(findTestObject('Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/button_Submit'))

WebUI.delay(5)

WebUI.verifyTextPresent('Thank you for your request.', false)

WebUI.delay(2)

WebUI.closeBrowser()

