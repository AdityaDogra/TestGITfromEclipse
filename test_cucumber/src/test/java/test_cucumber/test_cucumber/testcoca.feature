Feature: how is cucumber.


Background: java is what we should know.
When This is from Background


Scenario: what we need to start learning cucumber

Given we know what jars we need and how to create a runner class
When all the dependencies are imported
Then start writing the feature file
And verify if you have learned something or not

Scenario: learn hooks

Given read hooks online
When hooks we know
Then impliment hooks
And verify hooks

Scenario Outline: learn examples

Given test data "<Test_Data>" we know
When test data is loaded
Then impliment examples
And verify inputs

Examples:
|Test_Data|
|Test Data 1|
|Test Data 2|
|Test Data 3|

Scenario: learn how to tackle failures

Given Sceanrio fails
When this is where sceanrio fails
Then the failure exception
And verify tackle

Scenario: test datatables using Raw method
Given enter the username and the password
|Aditya|Pass@123|
|Hello|Pass@154|
|Pakoda|Pass@784|
Then the result should be fine
@sanity
Scenario: testing datatables using asMaps method
Given enter the username and the password to login
|UN|Pass|
|Aditya|Pass@123|
|Hello|Pass@154|
|Pakoda|Pass@784|
Then the result are there

@Regression
Scenario: testing datatables while iterating the list 
Given enter the name and the pass to login1
|UN|Pass|
|dsadssd|Pass@123|
|fdhghg|Pass@154|
|adsf csf|Pass@784|
Then the result 