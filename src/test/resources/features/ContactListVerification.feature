Feature: contact list verification
  Story: As a user, I should be able to view the contact list.
  Pre-condition created, two contact added

  Background:
    Given user on the login page

  @wip
  Scenario: verify users can see all the contact names on the contact list
    When user use enter "User23" and enter "Userpass123"
    And user on the dashboard page
    When the user clicks the contacts module
    Then verify the contact names are in the list
      | Dory Semal |
      | Sea        |

  @wip
  Scenario: verify users can see all the contact names on the contact list
    When user use enter "User53" and enter "Userpass123"
    And user on the dashboard page
    When the user clicks the contacts module
    Then verify the contact names are in the list
      | Ama            |
      | Hermoine Solly |


  @wip
  Scenario: verify users can see all the contact names on the contact list
    When user use enter "User83" and enter "Userpass123"
    And user on the dashboard page
    When the user clicks the contacts module
    Then verify the contact names are in the list
      | Ekaterina |
      | Eva       |

  @wip
  Scenario: verify users can see all the contact names on the contact list
    When user use enter "User113" and enter "Userpass123"
    And user on the dashboard page
    When the user clicks the contacts module
    Then verify the contact names are in the list
      | Anatoly |
      | Ethel   |


  #(Pre-condition: there should be at least 2 contact names are displayed
  #On the contact list so that view list function can be tested)