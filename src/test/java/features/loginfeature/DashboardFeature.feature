Feature: Dashboard page scenarios

@CUCUMBER-123
Scenario: Verify user able to login and check widget list is display
	When user enter username as "Admin" login page
	And user enter password as "U@h10IOYrn" login page
	And user click on login button on login page
	Then user should navigate to dashboard page
	#Then user should see "12" widget list on dashboard

	
@CUCUMBER-124
Scenario: Verify user able to login and check widget list is display Jenkins
	When user enter username as "admin" login page
	And user enter password as "0OGYrZ8kw@" login page
	And user click on login button on login page
	Then user should navigate to dashboard page
	Then user should see "13" widget list on dashboard
