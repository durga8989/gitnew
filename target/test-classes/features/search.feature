Feature: Search for Vegetables

@SeleniumTest
Scenario: Login and search for vegetables
Given user is on GreenKart landing page
When user search for "Cucumber" vegetable
Then "Cucumber" result is displayed


@SeleniumTest
Scenario: Login and search for vegetables
Given user is on GreenKart landing page
When user search for "Brinjal" vegetable
And Added more of the same item to cart
And proceeds to checkout
Then verify if "Brinjal" result is displayed
