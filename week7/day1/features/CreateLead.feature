Feature: Funtionality of CreateLead

#Background:
#Given Launch the browser
#Given Load the url

@Regression @Funtionality
Scenario: CreateLead with mandatory data

Given Enter the username as 'demoSalesManager' and password as 'crmsfa'
When  Click the login 
Then  WelcomePage is displayed
When  Click the 'CRM/SFA' link
Then  'My Home' Page is displayed
When  Click the 'Leads' link
Then  'My Leads' Page is displayed
When  Click the 'Create Lead' link
Then  'Create Lead' Page is displayed
When  Enter the CompanyName
And   Enter the FirstName
And   Enter the LastName
And   Click the createlead button
Then  ViewLead page is displayed

