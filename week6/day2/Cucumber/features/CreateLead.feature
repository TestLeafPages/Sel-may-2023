Feature: Funtionality of CreateLead

Scenario: Login with Positive Credentials

Given Launch the browser
Given Load the url
Given Enter the username
Given Enter the password
When  Click the login
Then  HomePage is displayed
When  Click on CRMSFApage
Then  Leads Page is dispalyed
