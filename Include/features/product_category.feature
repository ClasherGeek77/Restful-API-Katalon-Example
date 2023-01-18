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
Feature: Title of your feature
  I want to use this template for my feature file

  @create_a_category
  Scenario: I want to see create category receipt
    Given I do login
    When I hit create category API
    Then I get create category receipt
    
  @get_a_category
  Scenario: I want to see category receipt
    Given I do login
    When I hit get category API
    Then I get category receipt
    
  @get_a_category_by_id
  Scenario: I want to see category by id receipt
    Given I do login
    When I hit get category by id API
    Then I get category by id receipt