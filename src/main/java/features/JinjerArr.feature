Feature: Jinjer Array

  Scenario Outline: Check record page
    Given User goes to Jinjer page
    When User input companyID as "<companyID>"
    And User input staffID as "<staffID>"
    And User input password as "<password>"
    And User click Login button
    Then Go to the staff page
    Then User click record-request
    Then User check list record

    Examples:
      |companyID|staffID|password|
      |9999911118|1|12345678|
