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

WS.verifyResponseStatusCode(response, 200)

def schema = '\n{\n  "$schema": "http://json-schema.org/draft-04/schema#",\n  "type": "object",\n  "properties": {\n    "data": {\n      "type": "object",\n      "properties": {\n        "ID": {\n          "type": "integer"\n        },\n        "Name": {\n          "type": "string"\n        },\n        "Description": {\n          "type": "string"\n        },\n        "Price": {\n          "type": "integer"\n        },\n        "Ratings": {\n          "type": "integer"\n        },\n        "Categories": {\n          "type": "array",\n          "items": [\n            {\n              "type": "object",\n              "properties": {\n                "ID": {\n                  "type": "integer"\n                },\n                "Name": {\n                  "type": "string"\n                },\n                "Description": {\n                  "type": "string"\n                }\n              },\n              "required": [\n                "ID",\n                "Name",\n                "Description"\n              ]\n            }\n          ]\n        }\n      },\n      "required": [\n        "ID",\n        "Name",\n        "Description",\n        "Price",\n        "Ratings",\n        "Categories"\n      ]\n    }\n  },\n  "required": [\n    "data"\n  ]\n}\n'

WS.validateJsonAgainstSchema(response, schema)
def del_id = WS.getElementPropertyValue(response, 'data.ID')
WebUI.callTestCase(findTestCase('pages/product/delete_product/delete_product'), [('del_id'):del_id,('token') : GlobalVariable.Token], FailureHandling.STOP_ON_FAILURE)

