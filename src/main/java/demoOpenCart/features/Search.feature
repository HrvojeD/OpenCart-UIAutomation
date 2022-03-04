Feature: Visitor user can search for products

  Scenario Outline: Visitor can use the search functionality to search for items

    Given user is on store front page
    When user types <item> in the search bar
    And clicks the Search button
    Then results will appear

    Examples:
      |  item  |
      |  iMac  |
      |  Nikon |


  Scenario Outline: Authenticated user can use the search functionality to search for items

    Given user is already registered
    And user is logged in
    And user is on store front page
    When user types <item> in the search bar
    And clicks the Search button
    Then results will appear

    Examples:
      |  item   |
      |  iPhone |
      |  Galaxy |