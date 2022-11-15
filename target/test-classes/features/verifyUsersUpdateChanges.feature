
Feature: As a user, I should be able to update settings.
  Background: login to page



Scenario Outline: Verify users update settings
  Given user on the login page
  When user use enter "<username>" and enter "<password>"
Given user on the dashboard page
When the user clicks the "Files" module
And user clicks Settings on the left bottom corner
Then the user should be able to click any buttons

  Examples:
    | username | password    |
    | User23   | Userpass123 |
    | User53   | Userpass123 |
    | User83   | Userpass123 |
    | User113  | Userpass123 |
