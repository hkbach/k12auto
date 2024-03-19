Feature: User login and action on page list request
  Scenario Outline: TC001 User login and action on page list request successfully
    Given User goes to pro page
    When At textbox company, User input as "<companyID>"
    And At textbox staffID, User input as "<staffID>"
    And At textbox password, User input as "<password>"
    Then User click on button login
    Then Go to the staff page
    Then User click on list request
    Then User check total pages and rows of list request

    Examples:
  |companyID|staffID|password|
  |9999911118|1|12345678|