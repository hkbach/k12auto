Feature: Verify total pages & value table the first page
#  Scenario: Count pages, count rows & print table the first page
#    Given  User opens browser
#    When User logs in by valid user
#    And Count rows all page
#    And Print table the first page
#    Then Count total pages

  Scenario: Print the list as 2 ways array
    Given  User opens browser
    When User logs in by valid user
    And Go to the investment List
    Then Count total pages
