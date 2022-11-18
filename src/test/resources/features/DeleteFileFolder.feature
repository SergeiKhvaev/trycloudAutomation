Feature: As a user, I should be able to delete a file/folder.
  @deleteFile
  Scenario Outline: Verify users delete a file/folder
    Given user logins with valid "<username>" and "<password>"
    When the user clicks the "Files" module
    And user click action-icon  from any file on the page
    And user choose the "Delete f" option
    When the user clicks the "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page.

    Examples:
      | username | password    |
      | User23   | Userpass123 |
      | User52   | Userpass123 |
      | User83   | Userpass123 |
      | User113  | Userpass123 |