Feature: Verify LoginPage

Scenario: Veriy User Logged In

Given user launch the Application
When User enter CorporateIDText, Username and password
And User Click on Auth button
Then user enter VascoToken
And User Click on Login button

