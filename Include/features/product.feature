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
@product
Feature: Title of your feature
  I want to use this template for my feature file

  @get_all_product
  Scenario: I want to see all product recipt
  	Given I do login
    When I hit all product API
    Then I get all product recipt

	@get_product_by_id
  Scenario: I want to see product by id recipt
  	Given I do login
    When I hit product by id API
    Then I get product by id recipt
    
  @get_product_by_invalid_id
  Scenario: I want to see product by invalid id recipt
  	Given I do login
    When I hit product by id API with invalid id
    Then I get product by invalid id recipt
    
 	@get_product_comment
  Scenario: I want to see product comment recipt
  	Given I do login
    When I hit product comment API
    Then I get product comment recipt
    
  @get_product_rating
  Scenario: I want to see product rating recipt
  	Given I do login
    When I hit product rating API
    Then I get product rating recipt
   
  @delete_product
  Scenario: I want to delete product
  	Given I do login
    When I hit delete product API
    Then I get delete product recipt
    
  @create_product
  Scenario: I want to create product
  	Given I do login
    When I hit create product API
    Then I get create product recipt
    
  @create_product_comment
  Scenario: I want to create product comment
  	Given I do login
    When I hit post product comment API
    Then I get post product comment recipt
    
  @create_product_rating
  Scenario: I want to create product rating
  	Given I do login
    When I hit post product rating API
    Then I get post product rating recipt