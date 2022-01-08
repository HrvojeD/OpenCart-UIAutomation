Feature: Visitor user can search for products

  @tag
  Scenario Outline: Visitor can use the search functionality to search for items

    Given user is on store front page
    When user types <item> in the search bar
    And clicks the Search button
    Then results will appear

    Examples:
      |  item  |
      |  Mac   |
      |  Nikon |


  Scenario Outline: Authenticated user can use the search functionality to search for items

    Given user is on store front page
    And user is logged in to the store
    When user types <item> in the search bar
    And clicks the Search button
    Then results will appear

    Examples:
      |  item  |
      |  iPhone   |
      |  Galaxy |