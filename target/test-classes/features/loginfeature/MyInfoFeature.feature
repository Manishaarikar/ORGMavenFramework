Feature: My Info Employement Details Feature

@CUCUMBER-11
Scenario: Verify user able to login 
	When user enter username as "Admin" login page
	And user enter password as "U@h10IOYrn" login page
	And user click on login button on login page
	Then user should navigate to dashboard page

@Cucumber-12
Scenario: Validate the My info-Employement details Feature
Given User landing on dashboard page
When User clicks on My Info link
Then Validate that user redirects to My Info Page
And Validate profile pic
And Validate the Employee Name 
And Validate Job Title
When User click on Job link
Then User should view employement details

 @Cucumber-13
  Scenario: LogOut scenario
  
  Given User is  on Dashboard Page
  When User click on user dropdown
  And User clicks on LogOut link
  Then verify that user able to logged out