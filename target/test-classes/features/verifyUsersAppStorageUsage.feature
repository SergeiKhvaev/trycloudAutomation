Feature:

Scenario: Verify users to see the app storage usage
Given user on the dashboard page
When the user clicks the "Files" module
And user checks the current storage usage
And user  uploads file with the upload file option
And user refresh the page
Then the user should be able to see storage usage is increased