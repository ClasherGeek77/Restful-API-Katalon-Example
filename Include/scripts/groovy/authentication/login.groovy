package authentication
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	def data = new constructor.Data()

	@When("I hit login API")
	def I_input_form() {
		def response = WebUI.callTestCase(findTestCase('Test Cases/pages/authentication/login/login'), [:], FailureHandling.STOP_ON_FAILURE)
		data.setResponse(response)
	}

	@Then("I receive login recipt")
	def I_receive_login_receipt() {
		def response = data.getResponse()
		WebUI.callTestCase(findTestCase('Test Cases/pages/authentication/login/assert_login'),[('response'):response], FailureHandling.STOP_ON_FAILURE)
	}
}