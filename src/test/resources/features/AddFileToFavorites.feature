Feature: As a user, I should be able to access to Files module - Favorites button


  @favoritesbtn
  Scenario Outline: Verify users to add files to Favorites
    Given user logins with valid "<username>" and "<password>"
    When the user clicks the "Files" module
    When the user clicks action-icon from any file on te page
    And user click the Favorites sub-module on the left side
    Then Verify the chosen file is listed on the table

    Examples:
      | username | password    |
      | User23   | Userpass123 |
      | User53   | Userpass123 |
      | User83   | Userpass123 |
      | User113  | Userpass123 |