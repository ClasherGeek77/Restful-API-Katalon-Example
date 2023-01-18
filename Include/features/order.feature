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
@order
Feature: Title of your feature
  I want to use this template for my feature file

  @create_order
  Scenario: I want to see create order receipt
    Given I do login
    When I hit create order API
    Then I get create order receipt
	
	@get_order
  Scenario: I want to see get product receipt
    Given I do login
    When I hit get order API
    Then I get order receipt
    
  @get_order_by_id
  Scenario: I want to see get product receipt by id
    Given I do login
    When I hit get order by id API
    Then I get order by id receipt
    
  @get_order_by_invalid_id
  Scenario: I want to see get product receipt by id error
    Given I do login
    When I hit get order by id API with invalid id
    Then I get order by invalid id receipt