package com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class OrangeHRM_Login {
	@Keyword
	public Login() {

		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

		WebUI.setText(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/input_Username_username'),
				,GlobalVariable.Username1)

		WebUI.setEncryptedText(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/input_Password_password'),
				'hUKwJTbofgPU9eVlw/CnDQ==')

		WebUI.click(findTestObject('Object Repository/Day-2/OrangeHRM/Page_OrangeHRM_MyInfo/Page_OrangeHRM/button_Login'))
	}
	@Keyword
	public Waitforclick(object, timeout) {

		WebUI.waitForElementPresent(findTestObject(object), timeout)
		WebUI.click(findTestObject(object))
	}
}
