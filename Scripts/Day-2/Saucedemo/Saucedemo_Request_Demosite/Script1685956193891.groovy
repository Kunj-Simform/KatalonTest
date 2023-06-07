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

WebUI.navigateToUrl(GlobalVariable.Saucedemo)

CustomKeywords.'com.Saucedemo_Login.Login'()

WebUI.click(findTestObject('Object Repository/Day-2/SauceDemo/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Day-2/SauceDemo/Page_Swag Labs/a_About'))

WebUI.click(findTestObject('Object Repository/Day-2/SauceDemo/Page_Sauce Labs Cross Browser Testing, Sele_e8ee84/button_Request a demo'))

WebUI.setText(findTestObject('Day-2/SauceDemo/Page_Request a Sauce Labs Demo/input__FirstName'), 'kunj')

WebUI.setText(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/input__LastName'), 'patel')

WebUI.setText(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/input__Email'), 'kunjpt2002@gmail.com')

WebUI.setText(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/input__Company'), 'simform')

WebUI.selectOptionByValue(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/select_Select.AfghanistanAlbaniaAlgeriaAndo_2e5989'), 
    'India', true)

WebUI.setText(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/input__Phone'), '1234567890')

WebUI.selectOptionByValue(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/select_Select.Sauce Cross-BrowserSauce Mobi_6b7086'), 
    'Cross-Browser Testing', true)

WebUI.setText(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/textarea__Sales_Contact_Comments__c'), 
    'none')

WebUI.click(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/label_Please check this box if youd like to_15e628'))

WebUI.click(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/button_Submit'))

WebUI.click(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/span_Company details'))

WebUI.setText(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/input__Email'), 'kunj.k@simformsolutions.com')

WebUI.click(findTestObject('Object Repository/Day-2/SauceDemo/Page_Request a Sauce Labs Demo/button_Submit'))

WebUI.closeBrowser()

