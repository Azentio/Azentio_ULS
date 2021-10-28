Feature: Registratio Tests
Background:
Given User navigates to Registration page
@register
Scenario: Register an account with valid details
When User provies the following details into the input fields
		|firstName|arun											|
		|lastName |motoori									|
		|email		|arun.motoori@yahoo.co.in	|
		|phone		|12345678									|
		|password	|SeleniumTester$					|
	And Selects the privacy policy option
	And Clicks on Continue button
	Then User should get successfully registered