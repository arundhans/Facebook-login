
Feature: Login
  I want to use this template for my feature file

  
  Scenario: User Login
    Given User should launch the browser.
    And User should enter the Facebook url in the address bar.
    When User should enter the Username and Password
    |Arun|Prasath|arundhans7@gmail.com|Anitharaj@15|
    And User should click on the Login button.
    Then User should be navigated to the FB home screen.
    

  