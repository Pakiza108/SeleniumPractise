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
Feature: Test Guroo 99 Bank Home Page

  @tag1
  Scenario Outline: Test Login with valid credentials
    Given Open firefox and start application
    When I enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully
    Then application should be closed

    Examples: 
      | username        | password |       |
      | mgr123 |          | mgr!23 |
      | abc2@gmail.com  |          |  1234 |
