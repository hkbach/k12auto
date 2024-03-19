Feature: Articles Searching

Scenario Outline: User search "cong dan"
Given User goes to the DVC page
When User input keyword as "<keyword>"
And User click 'Search' button
Then The expected articles will be displayed screen
Then check articles specific
Examples:
  | keyword  |
  | cong dan |
