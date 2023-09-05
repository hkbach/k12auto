Feature: User action on the list of campaigns
#  Scenario Outline: CL006 User clicks the arrow button to collapse the filter
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on the X button
#    Then The filter panel will be hidden and the filter options won't be cleared
#
#  Examples:
#    |Checkbox|
#    |Ready to launch|

#  Scenario Outline: (CL007) User tries to filter the Campaigns by Status "Ready to launch"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status
#
#  Examples:
#  |Checkbox|
#  |Ready to launch|
#
#  Scenario Outline: (CL008) User tries to filter the Campaigns by Status "Draft"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status
#
#    Examples:
#      |Checkbox|
#      |Draft|
#
#  Scenario Outline: (CL009) User tries to filter the Campaigns by Status "Active"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status
#
#    Examples:
#      |Checkbox|
#      |Active|

#  Scenario Outline: (CL010) User tries to filter the Campaigns by Status "Closed"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status
#
#    Examples:
#      |Checkbox|
#      |Closed|

#  Scenario Outline: (CL011) User tries to filter the Campaigns by Status "Fully funded"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status
#
#    Examples:
#      |Checkbox|
#      |Fully funded|
#
#  Scenario Outline: (CL012) User tries to filter the Campaigns by Status "Part funded"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status
#
#    Examples:
#      |Checkbox|
#      |Part funded|
#
#  Scenario Outline: (CL013) User tries to filter the Campaigns by Status "Not funded"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status
#
#    Examples:
#      |Checkbox|
#      |Not funded|
#
#
#  Scenario Outline: (CL015) User tries to filter the Campaigns by one Country
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which belong to the selected "<Checkbox>" option
#
#  Examples:
#  |Checkbox|
#  |Chile|
#
#
##    #Finance
#

#  Scenario Outline: (CL017) User tries to filter the Campaigns by Finance volume while entering characters into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters characters into the Finance volume fields From and To "<From>" and "<To>"
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as user should enters number only
#    Examples:
#      | From | To |
#      |abc   |xyz |

#  Scenario Outline: (CL018) User tries to filter the Campaigns by Finance volume while entering value of "To" field smaller than "From" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "<To>" field
#    And Enters number into the "<From>" field
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as the value of 'To' can't be smaller than 'From' field
#    Examples:
#      | To |From|
#      | 100|10  |

#  Scenario Outline: (CL019) User tries to filter the Campaigns by Finance volume while entering negative number into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "<To>" field
#    And Enters number into the "<From>" field
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as user can enter positive number only
#    Examples:
#      | To | From |
#      |-12 |-100  |
#
#
#  Scenario Outline: (CL020) User tries to filter the Campaigns by Finance volume while entering valid number into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "<To>" field
#    And Enters number into the "<From>" field
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter
#    Examples:
#      | To | From |
#      |50  |100   |




  # Invesment

#  Scenario Outline: (CL021) User tries to filter the Campaigns by Investment while entering characters into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the Investment filter, user enters characters into the Investment fields "<From>" and "<to>"
#    And Clicks on 'Apply filter' button
#    Then At Investment field the error message will be displayed as user should enters number only
#    Examples:
#      | From | to |
#      |abc   |xyz   |
#
#  Scenario Outline: (CL022) User tries to filter the Campaigns by Investment while entering value of "To" field smaller than "From" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the Investment filter, user enters number into the "<To>" field
#    And Enters number into the "<From>" field at investment
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as the value of "To" can't be smaller than "From" field
#    Examples:
#      | To | From |
#
#  Scenario: (CL023) User tries to filter the Campaigns by Investment while entering negative number into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "To" field
#    And Enters number into the "From" field
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as user can enter positive number only
#
#  Scenario: (CL024) User tries to filter the Campaigns by Investment while entering valid number into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "To" field
#    And Enters number into the "From" field
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which contain the Investment in the range of the filter
#
#
##   Reset all filters
#  Scenario Outline: (CL025) User click on the 'Reset all filters' to clear the applied filter
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    And Opens the filter panel again
#    And Clicks on 'Reset all filter' button
#    Then All previously selected filters "<Checkbox>" are removed and the Campaigns list return to its original stat instantly and the filter panel is Closed
#  Examples:
#  |Checkbox|
#  |Chile|
#
#  Scenario Outline: (CL026) User tries to filter the Campaigns list by selecting multi filter options (Country + Status + Investment + Finance volume)
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects the filter options want to apply "<Country>" "<Status>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which mapping with the filter condition "<Country>" "<Status>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
#  Examples:
#  |Country|Status|InvestmentTo|InvestmentFrom|FinanceFrom|FinanceTo|
#  |Vietnam|Active|500000|12|12|500000|
#
#
#  Scenario Outline: (CL027) User tries to filter the campaigns list again
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects the filter options want to apply "<Country>" "<Status>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
#    And Clicks on 'Apply filter' button
#    And Clicks on the X button again
#    And Clicks on the dropdown filter button
#    And At the filter, user selects the filter options want to apply "<Country>" "<Status>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
#    Then The list of campaigns will be filtered and just displays the campaigns which mapping with the filter condition "<Country>" "<Status>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
#
#    Examples:
#      |Country|Status|InvestmentTo|InvestmentFrom|FinanceFrom|FinanceTo|
#      |Vietnam|Active|500000|12|12|500000|
#
#  Scenario Outline: (CL028) Check the counter of the applied filters
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects the filter options want to apply "<Country>" "<Status>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
#    And Clicks on 'Apply filter' button
#    Then The Filter button displays a counter of the number of filters applied
#    Examples:
#      |Country|Status|InvestmentTo|InvestmentFrom|FinanceFrom|FinanceTo|
#      |Vietnam|Active|500000|12|12|500000|
#
#  Scenario: (CL029) Check the initialized data at the search textbox
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Check the initialized data of the search textbox
#    Then The text box is displayed as blank and the placeholder should be 'Search by name'
#
#  Scenario: (CL030) User tries to search the campaign by name
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    Then The campaigns list will be filtered and shows the campaign which named contains the entered characters Query %LIKE%
#
#  Scenario: (CL031) User tries to search the campaign by name
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    Then The filter function will be automatically triggred right after user entered key
#
#  Scenario: (CL032) Check the display of the filtered campaign list
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    Then The results are displayed following the same rules as the Campaign list view (30 results per page, most recently created at the top)
#
#  Scenario: (CL033) Check the display of the filtered campaign list when there are no search results
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    Then The 'no search results' screen will show
#
#  Scenario: (CL034) User clears the 'Search by name' data
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    And Click X button at the textbox
#    Then The result list will be cleared and return the list to its original state
#
#  Scenario: (CL035) Check the result counter
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    Then The  result counter will displays exactly how many result there are in the list
#
#  Scenario: (CL036) Check the pagination component when there are 30 rows in the list
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    And Click X button at the text box
#    Then The pagination won't be displayed
#
#  Scenario: (CL037) Check the pagination component when there are 31 rows in the list
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    Then The pagination will be displayed with 2 pages
#
#  Scenario: (CL038) Check the pagination component when there are 60 rows in the list
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    Then The pagination will be displayed with 3 pages
#
#  Scenario: (CL039) Search in combination with filters
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Click X button at the text box
#    And Enters the name of campaign into the "Search by name" field
#    Then Any search will be applied on top of selected filter options, and any filter options applied on top of any search results