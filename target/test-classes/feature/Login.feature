Feature: Login
  I want to use this template for my feature file

  Scenario: User Login
    Given User should launch the browser.
    And User should enter the Facebook url in the address bar.
    When User should enter the Username and Password
      | Email@gmail.com      | Password     |
      | mail@gmail.com       | Anitharaj@15 |
      | arundhans7@gmail.com | Password     |
    And User should click on the Login button.
    Then User should be navigated to the FB home screen.
