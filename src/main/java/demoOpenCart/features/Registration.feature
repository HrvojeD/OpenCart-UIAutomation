Feature: Registration of a new user

  Scenario: Visitor user can create an account

    Given user is on store front page
    When user click the My Account button
    And clicks the Register button
    And enters firstname in the First Name field
    And enters lastname in the Last Name field
    And enters email in the Email address field
    And enters telephone in the Telephone field
    And enters password in the Password field
    And enters password in the Password Confirm field
    And checks the Privacy Policy checkbox
    And clicks Continue
    Then new account will be created