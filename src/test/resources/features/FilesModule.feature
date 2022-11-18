Feature: As a user, i should be able o access Files module.

  @files
  Scenario Outline: user is accessing files module
    Given  user is on login page
    When user will enter "<username>" and enter "<password>"
    And  user click on "Files" module element
    And user verify title of files module.

    Examples:
      | username | password    |
      | User23   | Userpass123 |
      | User52   | Userpass123 |
      | User83   | Userpass123 |
      | User113  | Userpass123 |