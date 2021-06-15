Feature: Application Login


@MobileTest
Scenario: Home page default login
Given user is on login page
When user is login into Username as "john" & Password as "Cenner"
Then home page is populated
And Cards populated are "true"

@RegTest
Scenario: Home page default login
Given user is on login page
When user is login into Username as "jin" & Password as "Sinner"
Then home page is populated
And Cards populated are "false"
 
@SmokeTest
Scenario Outline: Home page default login
Given user is on login page
When user is login with <username> & <password>
Then home page is populated
And Cards populated are "false"

Examples:
|username |password |
|user1 |pass@123 |
|user2 |pass@123 |
|user3 |pass@123 |
|user4 |pass@123 |
