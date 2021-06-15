Feature: Application Login

@SmokeTest
Scenario: Home page default login
Given user is on login page
When user is login into Username as "john" & Password as "Cenner"
Then home page is populated
And Cards populated are "true"