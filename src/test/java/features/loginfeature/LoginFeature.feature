Feature: login feature 

@CUCUMBER-12345 @smoke 
Scenario: verify user should able to login with admin credential 
	Given user launch the browser and load application url 
	When user enter "admin" as username on login page 
	And user enter "password123" as password on login page 
	And user click on login button on login page 
	Then user should be navigate to dashboard page
	And User enter username as "admin" and password as "password123" on login page
	
	
@CUCUMBER-12346 @regression 
Scenario: verify user should able to login with admin credential 
	Given user launch the browser and load application url 
	And user click on login button on login page 
	Then user should be navigate to dashboard page 
	
@CUCUMBER-12347 @smoke 
Scenario: verify user should able to login with admin credential 
	Given user launch the browser and load application url 
	And user click on login button on login page 
	
@CUCUMBER-12345 
Scenario: verify user should able to login with admin credential 
	Given user launch the browser and load application url 
	And user click on login button on login page 
	Then user should be navigate to dashboard page 
	