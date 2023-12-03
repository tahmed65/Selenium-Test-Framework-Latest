Feature: As Customer I should be able to verify Customer Functionality


@test
Scenario: Verify Deposit Functionality
Given User Navigate to XYZ Bank Home Page 
When User Click On Customer Login Button
Then Customer Verify the XYZ text
And Select First User form the Your Name Drop Down
Then User Click On Login Button
Then User Verify the Default Account Numnber 
And User Click on Deposite button


Scenario: Verify Withdrawl Functionality
Given User Navigate to XYZ Bank Home Page 
When User Click On Customer Login Button
Then Customer Verify the XYZ text
And Select First User form the Your Name Drop Down
Then User Click On Login Button
Then User Verify the Default Account Numnber 
And User Click on Withdrawl button


Scenario: Verify Transction Functionality
Given User Navigate to XYZ Bank Home Page 
When User Click On Customer Login Button
Then Customer Verify the XYZ text
And Select First User form the Your Name Drop Down
Then User Click On Login Button
Then User Verify the Default Account Numnber 
And User Click on Transction button