Feature: Login in Nhaccuatui

Scenario Outline: User logged in successfully
Given User goes to the NCT page
When User click 'Loginform' button
And User input email as "<Username>"
And User input password as "<Password>"
And User click 'Login' button
Then User logged in successfully
Examples:
  | Username  | Password   |
  | quyabc123 | Quy@abc123 |
  | quybcd456 | Quy@bcd456 |

  Scenario Outline: User login failed
   Given User goes to the NCT page
   When User click 'Loginform' button
   And User input email as "<Username>"
   And User input password as "<Password>"
   And User click 'Login' button
   Then the error message will be displayed and User login failed
   Examples:
      |Username        |Password     |
      |quyabc123       |Quy@abccccccc|
      |quybcd999       |Quy@bcd456   |
      |quybcd999       |             |
