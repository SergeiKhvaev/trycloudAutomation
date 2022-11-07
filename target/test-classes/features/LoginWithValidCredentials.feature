Feature: as a user, I should be able to log in

@lodinValidCredentials
  Scenario Outline: Verify login with valid credentials with DDT
    Given user on the login page
    When user use enter "<username>" and enter "<password>"
    And user click login button
    Then verify the user should be at dashboard page

    Examples:
      | username | password    |
      | User23   | Userpass123 |
      | User53   | Userpass123 |
      | User83   | Userpass123 |
      | User113  | Userpass123 |



  Scenario:   Verify login with valid credentials with  parameterization
    Given user on the login page
    When user use enter "User23" and enter "Userpass123"
    And user click login button
    Then verify the user should be at dashboard page


  Scenario:   Verify login with valid credentials with given username and password
    Given user on the login page
    When user use enter username and enter password
    And user click login button
    Then verify the user should be at dashboard page