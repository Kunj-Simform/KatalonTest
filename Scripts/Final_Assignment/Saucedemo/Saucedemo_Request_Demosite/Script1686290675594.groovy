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

String Object_Username = 'Object Repository/Assignment/SauceDemo/Page_Swag Labs/input_Swag Labs_user-name'
String Object_Password = 'Object Repository/Assignment/SauceDemo/Page_Swag Labs/input_Swag Labs_password'
String Object_Loginbtn = 'Object Repository/Assignment/SauceDemo/Page_Swag Labs/input_Swag Labs_login-button'
String Object_Menu = 'Object Repository/Assignment/SauceDemo/Page_Swag Labs/button_Open Menu'
String Object_Aboutoption = 'Object Repository/Assignment/SauceDemo/Page_Swag Labs/a_About'
String Object_Requestbutton = 'Object Repository/Assignment/SauceDemo/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/button_Request a demo'
String Object_Firstname = 'Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__FirstName'
String Object_Lastname = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__LastName'
String Object_Email = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Email'
String Object_Company = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Company'
String Object_Country = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/select_Select.AfghanistanAlbaniaAlgeriaAndo_2e5989'
String Object_PhNO = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/input__Phone'
String Object_Testing = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/select_Select.Sauce Cross-BrowserSauce Mobi_6b7086'
String Object_Comments ='Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/textarea__Sales_Contact_Comments__c'
String Object_Checkbox = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/label_Please check this box if youd like to_15e628'
String Object_Submit = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/button_Submit'
String Object_Clickemail = 'Object Repository/Assignment/SauceDemo/Page_Request a Sauce Labs Demo/span_Company details'

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.Saucedemo)

CustomKeywords.'com.Saucedemo_Login.Login'(Object_Username, EndUser, Object_Password, Password, Object_Loginbtn)

WebUI.delay(3)
WebUI.getUrl().equals('https://www.saucedemo.com/inventory.html')
WebUI.verifyElementNotPresent(findTestObject(Object_Loginbtn), 1)

CustomKeywords.'com.Form_Details.Clickevents'(Object_Menu)
CustomKeywords.'com.Form_Details.Clickevents'(Object_Aboutoption)
CustomKeywords.'com.Form_Details.Clickevents'(Object_Requestbutton)

String str = 'FirstName'
TestObject Firstname = findTestObject(Object_Firstname, [('Empid') : str])
WebUI.setText(Firstname, 'Kunj')

CustomKeywords.'com.Form_Details.Formdetails'(Object_Lastname, Lastname)
CustomKeywords.'com.Form_Details.Formdetails'(Object_Email, Email1)
CustomKeywords.'com.Form_Details.Formdetails'(Object_Company, Company)
CustomKeywords.'com.Form_Details.FormDropdowns'(Object_Country, Country, true)
CustomKeywords.'com.Form_Details.Formdetails'(Object_PhNO, Phonenumber)
CustomKeywords.'com.Form_Details.FormDropdowns'(Object_Testing, Testing, true)
CustomKeywords.'com.Form_Details.Formdetails'(Object_Comments, Text)
CustomKeywords.'com.Form_Details.Clickevents'(Object_Checkbox)
CustomKeywords.'com.Form_Details.Clickevents'(Object_Submit)

WebUI.verifyTextPresent('Enter valid business email address', false)

CustomKeywords.'com.Form_Details.Clickevents'(Object_Clickemail)
CustomKeywords.'com.Form_Details.Formdetails'(Object_Email, Email2)

WebUI.verifyElementAttributeValue(findTestObject(Object_Email), 
    'value', Email2, 0)

CustomKeywords.'com.Form_Details.Clickevents'(Object_Submit)
WebUI.delay(5)

WebUI.verifyTextPresent('Thank you for your request.', false)

WebUI.delay(2)
WebUI.closeBrowser()

