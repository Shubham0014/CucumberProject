Feature: Salesforce login
Scenario: Salesforce main page login

Given initialize chromedriver
When navigate to the url
And user eneters username and password and click on click 
Then user should be able to login
