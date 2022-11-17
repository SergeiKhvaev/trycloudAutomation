Feature: As a user, I should be able to access to Contacts module.

 Background:
  Given user is already login to the page

 @contactsModule
  Scenario Outline:  verify user access to Contacts module
   When When user use enter "<username>" and enter "<password>"
   When the user clicks the "Contacts" module
    Then verify the page title is "Contacts - Trycloud QA"

  Examples:
   | username | password    |
   | User23   | Userpass123 |
   | User53   | Userpass123 |
   | User83   | Userpass123 |
   | User113  | Userpass123 |