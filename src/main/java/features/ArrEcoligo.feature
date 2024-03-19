Feature: Array ecoligo

Scenario Outline: User logged in successfully
Given User goes to the Ecoligo Loginpage
When User click 'Deny' button
And User input email as "<Email>"
And User input password as "<Password>"
And User click 'Login' button
Then check record page
Examples:
  | Email              | Password |
  | annie.do@gmail.com | annie123 |
