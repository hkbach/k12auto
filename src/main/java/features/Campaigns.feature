Feature: You make campaigns
  Scenario Outline: CL006 User clicks the arrow button to collapse the filter
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    And At the filter, user selects "<Checkbox>"
    And Clicks on the X button again
    Then The filter panel will be hidden and the filter options won't be cleared

  Examples:
    |Checkbox|
    |Ready to launch|

#  Scenario Outline: (CL007-CL013) User tries to filter the Campaigns by Status "Ready to launch"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "<Checkbox>"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status
#
#  Examples:
#  |Checkbox|Checkbox|Checkbox|Checkbox|Checkbox|Checkbox|Checkbox|
#  |Draft|Ready to launch|Active|Closed|Fully funded|Part funded|Not funded|

#  Scenario: (CL007) User tries to filter the Campaigns by Status "Ready to launch"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "Ready to launch"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "Ready to launch" status
#
#  Scenario: (CL008) User tries to filter the Campaigns by Status "Draft"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "Draft"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "Draft" status
#
#  Scenario: (CL009) User tries to filter the Campaigns by Status "Active"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "Active"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "Active" status
#
#  Scenario: (CL010) User tries to filter the Campaigns by Status "Closed"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "Closed"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "Closed" status
#
#  Scenario: (CL011) User tries to filter the Campaigns by Status "Fully funded"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "Fully funded"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "Fully funded" status
#
#  Scenario: (CL012) User tries to filter the Campaigns by Status "Part funded"
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "Part funded"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "Part funded" status
#
#  Scenario: (CL013) User tries to filter the Campaigns by Status "Not funded"
#    Given  User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user selects "Not funded"
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which on "Ready to launch to launch" status
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
##
##
##    #Finance
#  Scenario: (CL017-CL020) User tries to filter the Campaigns by Finance volume while entering value
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    Then At the filter finance volume, user enters value and Clicks on 'Apply filter' button Then error message will be displayed

#  Scenario: (CL017) User tries to filter the Campaigns by Finance volume while entering characters into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters characters into the Finance volume fields From and To
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as user should enters number only
#
#  Scenario: (CL018) User tries to filter the Campaigns by Finance volume while entering value of "To" field smaller than "From" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "To" field
#    And Enters number into the "From" field
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as the value of "To" can't be smaller than "From" field
#
#  Scenario: (CL019) User tries to filter the Campaigns by Finance volume while entering negative number into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "To" field
#    And Enters number into the "From" field
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as user can enter positive number only
#
#  Scenario: (CL020) User tries to filter the Campaigns by Finance volume while entering valid number into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "To" field
#    And Enters number into the "From" field
#    And Clicks on 'Apply filter' button
#    Then The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter
#
#


#  # Invesment
#  Scenario: (CL021-CL024) User tries to filter the Campaigns by Investment while entering value
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    Then At the filter investment, user enters value and Clicks on 'Apply filter' button Then error message will be displayed

#  Scenario: (CL021) User tries to filter the Campaigns by Investment while entering characters into "From" and "To" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters characters into the Investment fields (From - to)
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as user should enters number only
#
#  Scenario: (CL022) User tries to filter the Campaigns by Investment while entering value of "To" field smaller than "From" fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on the dropdown filter button
#    And At the filter, user enters number into the "To" field
#    And Enters number into the "From" field
#    And Clicks on 'Apply filter' button
#    Then The error message will be displayed as the value of "To" can't be smaller than "From" field
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

#   Reset all filters
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
#    Then The textbox is displayed as blank and the placeholder should be 'Search by name'
#
#  Scenario: (CL030) User tries to search the campaign by name
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "Search by name" field
#    Then The campaigns list will be filtered and shows the campaign which named contains the entered characters Query %LIKE%

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
#    And Click X button at the textbox
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
#    And Click X button at the textbox
#    And Enters the name of campaign into the "Search by name" field
#    Then Any search will be applied on top of selected filter options, and any filter options applied on top of any search results