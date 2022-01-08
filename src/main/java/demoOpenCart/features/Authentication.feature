Feature: Registered user can login and logout

  Background: User has registered an account

  Scenario: Registered user can login
    Given user is on store front page
    When user click the My Account button
    And clicks the Login button
    And enters valid credentials
    And clicks the Login button
    Then user will be logged in

  Scenario: Authenticated user can logout
    Given user is logged in to the store
    When user click the My Account button
    And click the Logout button
    Then user will be logged out