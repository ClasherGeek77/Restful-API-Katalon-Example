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
@authentication
Feature: Title of your feature
  I want to use this template for my feature file

  @login
  Scenario: I login with valid account
    When I hit login API
    Then I receive login recipt
    
  @register
  Scenario: I register with valid account
    When I hit register API 1 times
    Then I receive register recipt
    
  @registerFailed
  Scenario: I register with duplicate account
    When I hit register API 2 times
    Then I receive duplicate error message
    
  @get_user
  Scenario: I want to see user datas
  	Given I do login
    When I hit user data API
    Then I receive user data recipt
