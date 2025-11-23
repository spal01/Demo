Feature: Login to website
  I want to use this template for my feature file

  @SmokeTest
  Scenario: Login with valid user credential
    Given I am on Login Page
    When I enter valid username and password
    Then I am able to login successfully
    
  @SmokeTest
  Scenario: Login with invalid user credential
    Given I am on Login Page
    When I enter invalid username and password
    Then I am not able to login successfully
  
    