Feature: Login Module
  I want to use this for automate all login test cases

  @regressionTest
  Scenario: TC1 Verify user is able to login valid user credentials
    Given Open Browser and Launch the URL
    When Enter the username and password and click on Login
    Then Validate the LoginPage
    
 