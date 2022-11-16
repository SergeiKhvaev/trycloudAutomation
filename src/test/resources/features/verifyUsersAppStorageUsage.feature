Feature: Verify users to see the app storage usage
Background: login to page

@us10
Scenario Outline: Verify users to see the app storage usage
  Given user on the login page
  When user use enter "<username>" and enter "<password>"
Given user on the dashboard page
When the user clicks the "Files" module
And user checks the current storage usage
And user  uploads file with the upload file option
And user refresh the page
Then the user should be able to see storage usage is increased

  Examples:
    | username | password    |
    | User53   | Userpass123 |

