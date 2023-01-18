package authentication
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import org.apache.commons.lang.RandomStringUtils

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	def data = new constructor.Data()

	@When("I hit register API (\\d+) times")
	def I_input_form_register(int n) {
		def email = RandomStringUtils.randomAlphabetic(5) + 'test@mail.com'
		def response = null
		for(int i in 1..n) {
			response = WebUI.callTestCase(findTestCase('Test Cases/pages/authentication/register/register'), [('email'):email], FailureHandling.STOP_ON_FAILURE)
		}
		data.setResponse(response)
	}

	@Then("I receive register recipt")
	def I_receive_register_receipt() {
		def response = data.getResponse()
		WebUI.callTestCase(findTestCase('Test Cases/pages/authentication/register/assert_register'), [('response'):response], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I receive duplicate error message")
	def I_receive_dup() {
		def response = data.getResponse()
		WebUI.callTestCase(findTestCase('Test Cases/pages/authentication/register/assert_register_invalid'), [('response'):response], FailureHandling.STOP_ON_FAILURE)
	}
}