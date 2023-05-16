Feature: Assign Leave Feature

@CUCUMBER-1
Scenario: Verify user able to login 
	When user enter username as "Admin" login page
	And user enter password as "U@h10IOYrn" login page
	And user click on login button on login page
	Then user should navigate to dashboard page

	@Cucumber-2
 Scenario: Validate Assign Leave Scenario
 
 
  Given User is  on Dashboard Page
  And user clicks on Assign Leave widget
  Then Verify that user is on Assign Leave Page
  When User enters/select Employee as "Aaliyah Haq"
  Then Validate that user able to select the Leave Type
  When user select Today from clender
  Then user should be able to write comment as "Not Feeling Well"
  Then Validate that user able to submit leave by clicking on Assign
 
 @Cucumber-3
 Scenario: Assign Leave Leave Balance Scenario
 
  Given User is  on Dashboard Page
  And user clicks on Assign Leave widget
  When User enters/select Employee as "Aaliyah Haq"
  Then Validate that user able to select the Leave Type
  When User clicks on check leave Balance link
  Then Validate that user able to see Available Sick Leave Balance
  
  @Cucumber-4
  Scenario: LogOut scenario
  
  Given User is  on Dashboard Page
  When User click on user dropdown
  And User clicks on LogOut link
  Then verify that user able to logged out