Feature: Login in Instagram

Scenario Outline: User logged in successfully
Given User goes to the INS page
When User input email as "<Username>"
And User input password as "<Password>"
And User click 'Login' button
Then User logged in successfully
Examples:
  | Username               | Password        |
  | tvsamsung321@gmail.com | tv321ss19081983 |

Scenario Outline: User login failed
Given User goes to the INS page
When User input email as "<Username>"
And User input password as "<Password>"
And User click 'Login' button
Then the error message will be displayed and User login failed
Examples:
  | Username               | Password        |
  | tvsamsung321@gmail.com | tv321ss1908198  |
  | tvsamsung456@gmail.com | tv321ss19081983 |
