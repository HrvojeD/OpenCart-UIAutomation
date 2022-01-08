Feature: Registration of a new user

  Scenario: Visitor user can create an account
    Given user is on store front page
    When user click the My Account button
    And clicks the Register button
    And provides valid credentials
    And clicks Continue
    Then new account will be created