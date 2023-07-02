Feature: Funtionality of Login Module

Scenario Outline: Login with Positive Credentials

Given Launch the browser
Given Load the url
Given Enter the username as <username>
Given Enter the password as <password>
When  Click the login
Then  HomePage is displayed

Examples:
|username|password|
|'demoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


Scenario Outline: Login with Negative Credentials

Given Launch the browser
Given Load the url
Given Enter the username as <username>
Given Enter the password as <password>
When  Click the login
But   Error messaged is dispalyed
Examples:
|username|password|
|'demo'|'crmsfa'|
|'Demo'|'crmsfa'|

