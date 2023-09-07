Feature: Create new Campaign
  Scenario: CP005 User clicks on the "Tranches" link on the right hand navigation to scroll to the Tranches zone
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Clicks on Tranches link at the right hand navigation
    Then The UI will be scrolled to the Tranches zone

  Scenario: CP006 User clicks on the "Campaign details" link on the right hand naviagtion to scroll to the Campaign zone
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Clicks on Tranches link at the right hand navigation
    And Clicks on Campaign details link at the right hand navigation
    Then The UI will be scrolled to the Campaign detail zone

  Scenario: CP008 User tries to save the campaign as draft while missing many mandatory fields
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enters the data at fields but missing many madantory fields
    And Clicks Save as Draft button
    Then The campaign will be successfully saved as Draft without any validation messages are shown up

  Scenario: CP020 User tries to add more projects
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enters new data at the General Information tile
    And Clicks on Add another project button
    Then A new Project field will be shown and it works in the same way with the first project field

  Scenario: CP021-CP024 User tries to enter characters into the Maximum finance volume field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enters characters into the Maximum finance volume field, Tenure field, Minimum finance volume field
    Then An error message will be shown as required user should enter numbers only at finance vol zone

  Scenario Outline: CP025-CP027&CP032-CP033 User tries to enter a number into the Maximum finance volume field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enters a "<Number>" into the Maximum finance volume field
    Then The 'KIB' or 'VIB' option will be selected with right "<Number>" value

    Examples:
      |Number|
      |99999|
      |100000|
      |100001|

  Scenario: CP028 User tries to change the option at the KIB/VIB radio button
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    Then The 'KIB/VIB' is read only field and user can't change the option

  Scenario: CP029-CP037 User tries to enter characters into the amount field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enters the new data at Minimum amount field, Maximum amount field, Divisible amount field
    Then Check validity data the fields at Individual investment zone

#  Scenario: CP038-CP039 User Selects Annuity and Bullet field and doesn't enter the madantory fields
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on Add campaign button
#    And Selects Annuity and Bullet field or Constant field
#    And Doesn't enter the madantory fields
#    Then An error message will be shown as required field

  Scenario: CP040-CP042 User tries to enter characters into the Annuity field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enters the characters into the Annuity field and Bullet field, Constant field
    Then An error message will be shown as required user should enter numbers only at Repayment zone

  Scenario Outline: CP043-CP044 User tries to enter a number into the Annuity field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enter a "<number>" into the Annuity field
    Then Check validity data the Annuity field when enter a "<number>"

  Examples:
  |number|
  |101|
  |-100|

  Scenario Outline: CP045-CP046 User tries to enter a number into the Bullet field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enter a "<number>" into the Bullet field
    Then Check validity data the Bullet field when enter a "<number>"

    Examples:
      |number|
      |101|
      |-100|


  Scenario Outline: CP047 User tries to enter numbers into the Annuity and Bullet which added together will be greater than 100
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enter "<number1>" into the Annuity field and "<number2>" into the Bullet field
    Then An error message will be shown as the total of the values entered in the Annuity field and the Bullet field must equal 100

  Examples:
  |number1|number2|
  |45|55|

    Scenario Outline: CP048-CP049 User tries to enter a number into the Constant field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enter a "<number>" into the Constant field
    Then Check validity data the Constant field when enter a "<number>"

    Examples:
      |number|
      |101|
      |-100|

  Scenario: CP053-CP055 User tries to enter the past date into the fields at Repayment dates zone
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Clicks on the date fields and enter a past date into fields
    Then An error message will be displayed as cannot enter a past date into this field

  Scenario Outline: CP065 Check the validation of KIB campaign
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enters a "<Number>" into the Maximum finance volume field
    Then The front-end review has been completed passed and The plausibility check has been completed and passed

  Examples:
  |Number|
  |99999|

  Scenario Outline: CP066 Check the validation of VIB campaign
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Enters a "<Number>" into the Maximum finance volume field
    Then The VIB document has been approved, The front-end review has been completed passed and The plausibility check has been completed and passed

  Examples:
    |Number|
    |100001|

#  Scenario: CT008 User tries to submit form without entering data at the Tranche name filed
#    Given User Logged in as Admin
#    When User goes to the Campaign List View
#    And Clicks on Add campaign button
#    And Clicks on Tranches link at the right hand navigation
#    And Click Add a tranche button
#    And Doesn't enter the data at the Tranche name
#    And Click submit button
#    Then The error message will be shown as required field please enter

  Scenario: CT017-CT018 User selectes the option at the Platform field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Clicks on Tranches link at the right hand navigation
    And Click Add a tranche button
    And Selectes the option at the Platform field
    Then There are 2 options as: Ecoligo and CrowdForClimate Austria


  Scenario Outline: CT019-CT022 User tries to enter data into the Interest rate field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Clicks on Tranches link at the right hand navigation
    And Click Add a tranche button
    And Enters "<data>" into the Interest rate field
    Then Check the validation of Interest rate field with "<data>"

    Examples:
    |data|
    |TEST|
    |0|
    |100000|
    ||

  Scenario Outline: CT023-CT025 User tries to enter data into the Bonus amount field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Clicks on Tranches link at the right hand navigation
    And Click Add a tranche button
    And Enters "<data>" into the Bonus amount field
    Then Check the validation of Bonus amount field with "<data>"

    Examples:
    |data|
    |TEST|
    |0|
    |100000|

  Scenario Outline: CT026-CT028 User tries to enter data into the Annuity factor field
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Clicks on Tranches link at the right hand navigation
    And Click Add a tranche button
    And Enters "<data>" into the Annuity factor field
    Then Check the validation of Annuity factor field "<data>"

    Examples:
      |data|
      |TEST|
      |0|
      |100000|

  Scenario: CT029 User click on "Add a tranche" button to add more tranches' information
    Given User Logged in as Admin
    When User goes to the Campaign List View
    And Clicks on Add campaign button
    And Clicks on Tranches link at the right hand navigation
    And Click Add a tranche button
    Then The new rows for add more tranche information will be shown and they work in the same way with the first project field