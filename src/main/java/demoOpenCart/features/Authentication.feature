Feature: Registered user can login and logout

  Scenario: Registered user can login

    Given user is already registered
    And user is on store front page
    When user click the My Account button
    And clicks the Login header button
    And enters valid credentials
    And clicks the Login button
    Then user will be logged in


  Scenario: Authenticated user can logout

    Given user is already registered
    And user is logged in
    And user is on store front page
    When user click the My Account button
    And click the Logout button
    Then user will be logged out