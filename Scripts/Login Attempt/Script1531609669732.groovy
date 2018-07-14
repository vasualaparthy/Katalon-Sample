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
WebUI.navigateToUrl('https://www.sprint.com/en/home/home-vb.html?adobe_mc_ref=&adobe_mc_sdid=SDID%253D47DD35018423999A-70458D37CC460FAB%257CMCORGID%253D5E6C123F5245B32D0A490D45%252540AdobeOrg%257CTS%253D1531609736')
WebUI.click(findTestObject('Object Repository/Page_Best Value in Wireless  Sprint/Page_Sprint/a_Sign In'))
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/Page_Best Value in Wireless  Sprint/Page_Sprint/input_USER'),findTestData('New Test Data').getValue('UserName', 1))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Best Value in Wireless  Sprint/Page_Sprint/input_PASSWORD'),findTestData('New Test Data').getValue('Password', 1))
WebUI.click(findTestObject('Object Repository/Page_Best Value in Wireless  Sprint/Page_Sprint/button_Submit'))