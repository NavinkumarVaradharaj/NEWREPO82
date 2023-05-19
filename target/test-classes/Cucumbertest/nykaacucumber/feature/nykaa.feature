#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Testing to buy the product functionality in Nykaa application

  @tag1
  Scenario: user search for the product
    Given User launch the application
    When search the baby powder product
    Then user navigates to product page
  @tag2  
  Scenario: user select the product
  Given user selects the powder
  Then user navigates to the product page
  And user changes the size of the product
  And user add the product to the bag
  And user changes the quantity of the product in bag
  And user confirm the product
  
  @tag3
  Scenario: user signin for the payment process
  Given user login the account by mobilenumber
  And  user veriy the mobile number by otp
  And user navigates to payment method options
  And user gives the payment details to proceed
  
 