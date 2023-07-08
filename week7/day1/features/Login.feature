@Login
Feature: Funtionality of Login Module

#common feature steps
#Background:
#Given Launch the browser
#Given Load the url

@Smoke
Scenario Outline: Login with Positive Credentials
Given Enter the username as <username> and password as <password>
When  Click the login
Then  HomePage is displayed

Examples:
|username|password|
|'demoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

 @Regression@Funtionality
Scenario Outline: Login with Negative Credentials

Given Enter the username as <username> and password as <password>
When  Click the login
But   Error messaged is dispalyed
Examples:
|username|password|
|'demoSalesManager'|'crmsfa'|


@Smoke@Regression
Scenario Outline: Login with invalid Credentials

Given Enter the username as <username> and password as <password>
When  Click the login
But   Error messaged is dispalyed
Examples:
|username|password|
|'demoSalesManager'|'crmsfa'|



