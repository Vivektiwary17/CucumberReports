Feature: Facebook login3
As a fb user, I want to enter username and pwd as a parameter

Scenario: validate fb login Scenario4
Given the user is on facebook login Page
When he enters "Vivek" as user name
And he enters "pwd" as password
Then check username is present in textbox