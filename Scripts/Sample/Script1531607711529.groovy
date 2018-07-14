import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
 
WebUI.navigateToUrl('https://www.sprint.com/')

WebUI.click(findTestObject('Object Repository/Page_Best Value in Wireless  Sprint/span_Shop'))
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Best Value in Wireless  Sprint/span_Shop'), 3)

WebUI.mouseOver(findTestObject('Page_Best Value in Wireless  Sprint/a_Android phones'))

WebUI.click(findTestObject('Object Repository/Page_Best Value in Wireless  Sprint/a_Android phones'))

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones  Spri/img_device-tile__img'))

WebUI.click(findTestObject('Object Repository/Page_Samsung Galaxy S9  Price Revie/button_Continue to plan'))

WebUI.click(findTestObject('Object Repository/Page_Samsung Galaxy S9  Price Revie/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Samsung Galaxy S9  Price Revie/span_No thanks. I understand I'))

WebUI.click(findTestObject('Object Repository/Page_Samsung Galaxy S9  Price Revie/button_I dont want protection'))

WebUI.waitForElementPresent(findTestObject('Page_Samsung Galaxy S9  Price Revie/button_Continue_1'), 2)

WebUI.click(findTestObject('Object Repository/Page_Samsung Galaxy S9  Price Revie/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_Pre-checkout Confirmation/button_Checkout'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

