Feature: List of campaigns
  Scenario Outline: CL006 User clicks the arrow button to collapse the filter
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    And At the filter, user selects "<Checkbox>"
    And Clicks on the X button
    Then The filter panel will be hidden and the filter options won't be cleared

    Examples:
      |Checkbox|
      |Draft|
      |Ready to launch|
      |Active|
      |Closed|
      |Fully funded|
      |Part funded|
      |Not funded|


  Scenario Outline: (CL007-CL013) User tries to filter the Campaigns by Status "Ready to launch"
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    And At the filter, user selects "<Checkbox>"
    And Clicks on 'Apply filter' button
    And Clicks on the X button
    Then The list of campaigns will be filtered and just displays the campaigns which on "<Checkbox>" status

    Examples:
      |Checkbox|
      |Draft|
      |Ready to launch|
      |Active|
      |Closed|
      |Fully funded|
      |Part funded|
      |Not funded|


  Scenario Outline: (CL015) User tries to filter the Campaigns by one Country
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    And At the filter, user selects "<Checkbox>"
    And Clicks on 'Apply filter' button
    And Clicks on the X button
    Then The list of campaigns will be filtered and just displays the campaigns which belong to the selected "<Checkbox>" option

    Examples:
      |Checkbox|
      |Chile|
      |Costa Rica|
      |Ghana|
      |Ivory Coast|
      |Kenya|
      |Nigeria|
      |Panama|
      |Philippines|
      |Thailand|
      |Uganda|
      |Vietnam|



  Scenario: (CL017-CL020) User tries to filter the Campaigns by Finance volume while entering value
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    Then At the filter finance volume, user enters value and Clicks on 'Apply filter' button Then error message will be displayed



  Scenario: (CL021-CL024) User tries to filter the Campaigns by Investment while entering value
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    Then At the filter investment, user enters value and Clicks on 'Apply filter' button Then error message will be displayed


  Scenario Outline: (CL025) User click on the 'Reset all filters' to clear the applied filter
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    And At the filter, user selects the filter options want to apply "<Status>" "<Country>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
    And Clicks on 'Apply filter' button
    And Clicks on the X button
    And Opens the filter panel again
    And Clicks on 'Reset all filter' button
    And Clicks on the X button
    And Opens the filter panel again
    Then All previously selected filters are removed and the Campaigns list return to its original stat instantly and the filter panel is Closed
    Examples:
      |Country|Status|InvestmentTo|InvestmentFrom|FinanceFrom|FinanceTo|
      |Vietnam|Active|500000|12|12|500000|


  Scenario Outline: (CL026) User tries to filter the Campaigns list by selecting multi filter options (Country + Status + Investment + Finance volume)
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    And At the filter, user selects the filter options want to apply "<Status>" "<Country>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
    And Clicks on 'Apply filter' button
    And Clicks on the X button
    Then The list of campaigns will be filtered and just displays the campaigns which mapping with the filter condition "<Status>" "<Country>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
    Examples:
      |Country|Status|InvestmentTo|InvestmentFrom|FinanceFrom|FinanceTo|
      |Vietnam|Active|500000|12|12|500000|


  Scenario Outline: (CL027) User tries to filter the campaigns list again
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    And At the filter, user selects the filter options want to apply "<Status>" "<Country>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
    And Clicks on 'Apply filter' button
    And Clicks on the X button
    And Clicks on the dropdown filter button
    And Clicks on 'Reset all filter' button
    And Clicks on the X button
    And Clicks on the dropdown filter button
    And At the filter, user selects the filter options want to apply "<Status1>" "<Country1>" "<InvestmentTo1>" "<InvestmentFrom1>" "<FinanceFrom1>" "<FinanceTo1>"
    And Clicks on 'Apply filter' button
    And Clicks on the X button
    Then The list of campaigns will be filtered and just displays the campaigns which mapping with the filter condition "<Status>" "<Country>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"

    Examples:
      |Status|Country|InvestmentTo|InvestmentFrom|FinanceFrom|FinanceTo|Status1|Country1|InvestmentTo1|InvestmentFrom1|FinanceFrom1|FinanceTo1|
      |Active|Vietnam|400000|12|12|400000|Closed|Ghana|300000|10|10|300000|


  Scenario Outline: (CL028) Check the counter of the applied filters
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on the dropdown filter button
    And At the filter, user selects the filter options want to apply "<Status>" "<Country>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
    And Clicks on 'Apply filter' button
    And Clicks on the X button
    Then The Filter button displays a counter of the number of filters applied
    Examples:
    |Status|Country|InvestmentTo|InvestmentFrom|FinanceFrom|FinanceTo|
    |Active|Vietnam|500000|12|12|500000|


  Scenario Outline: (CL029) Check the initialized data at the search textbox
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Check the initialized data of the search textbox
    Then The textbox is displayed as blank and the placeholder should be "<Text_Placeholder>"
  Examples:
  |Text_Placeholder|
  |Search by name|


  Scenario Outline: (CL030) User tries to search the campaign by name
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    Then The campaigns list will be filtered and shows the campaign which named contains the entered characters Query %LIKE%

    Examples:
      |SearchByName|
      |Test|


#  Scenario Outline: (CL031) User tries to search the campaign by name
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Enters the name of campaign into the "<SearchByName>" field
#    Then The filter function will be automatically triggred right after user entered key
#
#    Examples:
#      |SearchByName|
#      |Test|


  Scenario Outline: (CL032) Check the display of the filtered campaign list
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    Then The results are displayed following the same rules as the Campaign list view, 30 results per page, most recently created at the top

    Examples:
      |SearchByName|
      |test|


  Scenario Outline: (CL033) Check the display of the filtered campaign list when there are no search results
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    Then The 'no search results' screen will show

    Examples:
      |SearchByName|
      |2TBD|


  Scenario Outline: (CL034) User clears the 'Search by name' data
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    And Click X button at the textbox
    Then The result list will be cleared and return the list to its original state

    Examples:
      |SearchByName|
      |Te|


  Scenario Outline: (CL035) Check the result counter
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    Then The result counter will displays exactly how many result there are in the list

    Examples:
      |SearchByName|
      |a|


  Scenario Outline: (CL036) Check the pagination component when there are 30 rows in the list
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    And Click X button at the textbox
    Then The pagination won't be displayed

    Examples:
      |SearchByName|
      |a23|


  Scenario Outline: (CL037) Check the pagination component when there are 31 rows in the list
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    Then The pagination will be displayed with two pages

    Examples:
      |SearchByName|
      |Te|


  Scenario Outline: (CL038) Check the pagination component when there are 60 rows in the list
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    Then The pagination will be displayed with three pages

    Examples:
      |SearchByName|
      |Te|


  Scenario Outline: (CL039) Search in combination with filters
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Enters the name of campaign into the "<SearchByName>" field
    And Clicks on the dropdown filter button
    And At the filter, user selects the filter options want to apply "<Status>" "<Country>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"
    And Clicks on 'Apply filter' button
    And Clicks on the X button
    Then Any search will be applied on top of selected filter options, and any filter options applied on top of any search results "<SearchByName>" "<Status>" "<Country>" "<InvestmentTo>" "<InvestmentFrom>" "<FinanceFrom>" "<FinanceTo>"

    Examples:
      |SearchByName|Country|Status|InvestmentTo|InvestmentFrom|FinanceFrom|FinanceTo|
      |Te|Vietnam|Active|500000|12|12|500000|


