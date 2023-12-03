Feature: As a Bank manager I should be able to perform bank manager login activity


Scenario: Verify Add Customer Functionality
Given User Navigate to XYZ Bank Home Page
When User click on Bank Manager Login Button
Then Click on Add Customer Button
And User Fillup Customer Infomation
Then User Click on Add Customer Button
And User verify that Customer was added Successfully


Scenario: Verify Open Account Functionality
Given User Navigate to XYZ Bank Home Page
When User click on Bank Manager Login Button
Then user Click on Open Account Button
And User Choose Customer Name From the Drop Down
Then User Choose Dollar as Currency from the Drop Down
Then User CLick on Proceed Button
And User verify the Comfirmation Button


