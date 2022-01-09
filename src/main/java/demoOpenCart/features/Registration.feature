Feature: Registration of a new user

  @tag
  Scenario Outline: Visitor user can create an account

    Given user is on store front page
    When user click the My Account button
    And clicks the Register button
    And enters <firstname> in the First Name field
    And enters <lastname> in the Last Name field
    And enters <email> in the Email address field
    And enters <telephone> in the Telephone field
    And enters <password> in the Password field
    And enters <password> in the Password Confirm field
    And checks the Privacy Policy checkbox
    And clicks Continue
    Then new account will be created

    Examples:
      | firstname | lastname | email                | telephone | password |
      | John      | Doe      | 1johndoe@example.com | 123456    | qwe123   |
      | Jane      | Doe      | 1janedoe@example.com | 654321    | 123qwe   |
      | Nomen     | Nescio   | 1nomen@example.com   | 111222    | 1pw2pw   |