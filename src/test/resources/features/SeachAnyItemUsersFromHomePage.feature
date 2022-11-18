Feature: Search function verification
  User story As a user, I should be able to search any item/ users from the homepage.

@wip
Scenario Outline: Verification of search function from home page
  Given user on the login page
  When user use enter "<username>" and enter "<password>"
  Given user on the dashboard page
  When the user clicks the magnifier icon on the right top
  And users search any existing file or folder or user name
  Then verify the app displays the expected result option


  Examples:
    | username | password    |
    | User23   | Userpass123 |
    | User53   | Userpass123 |
    | User83   | Userpass123 |
    | User113  | Userpass123 |