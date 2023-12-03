Feature: As user I should be able verify the sign in and sing up functionality


@smoke
@regression
Scenario: Verify Sign Up Functionality With Male Geneder Option
Given User Navigate to Facebook Home Page
When User Click on Create New Account Button
Then User Enter Their First Name
And User Enter their Last Name
Then User Enter Their valid Email address
Then User Re-Enter Their valid Email address
And User Enter Stong Password as Per requirement
Then User Select Birth Month from the drop down
Then User Select Birth Day from the drop Down
And User Select Birth Year from the drop Down
When User Click on Male Gender Option 

@regression
Scenario: Verify Sign Up Functionality With Femal Geneder Option
Given User Navigate to Facebook Home Page
When User Click on Create New Account Button
Then User Enter Their First Name
And User Enter their Last Name
Then User Enter Their valid Email address
Then User Re-Enter Their valid Email address
And User Enter Stong Password as Per requirement
Then User Select Birth Month from the drop down
Then User Select Birth Day from the drop Down
And User Select Birth Year from the drop Down
When User Click on Femal Gender Option 

@regression
Scenario: Verify Sign Up Functionality With Custom Geneder Option
Given User Navigate to Facebook Home Page
When User Click on Create New Account Button
Then User Enter Their First Name
And User Enter their Last Name
Then User Enter Their valid Email address
Then User Re-Enter Their valid Email address
And User Enter Stong Password as Per requirement
Then User Select Birth Month from the drop down
Then User Select Birth Day from the drop Down
And User Select Birth Year from the drop Down
When User Click on Custom Gender Option 

