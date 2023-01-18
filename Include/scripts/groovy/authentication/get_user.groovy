package authentication
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class get_user {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	def data = new constructor.Data()

	@When("I hit user data API")
	def I_want_to_see_data() {
		def response = WebUI.callTestCase(findTestCase('Test Cases/pages/authentication/get_user_data/get_user_data'), [:], FailureHandling.STOP_ON_FAILURE)
		data.setResponse(response)
	}

	@Then("I receive user data recipt")
	def I_receive_data() {
		def response = data.getResponse()
		WebUI.callTestCase(findTestCase('Test Cases/pages/authentication/get_user_data/assert_get_user_data'), [('response'):response], FailureHandling.STOP_ON_FAILURE)
	}
}