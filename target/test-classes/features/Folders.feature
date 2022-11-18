Feature: files managing verification

  @wip
  Scenario Outline: As user, I should be able to manage folders
    Given user on the login page
    When user use enter <username> and enter <password>
    When user clicks files
    Then user  creates  a new folder
    Examples:
      | username | password      |
      | "User23" | "Userpass123" |
      |"User53"  |"Userpass123"  |
      |"User83"  |"Userpass123"  |
      |"User113" |"Userpass123"   |


