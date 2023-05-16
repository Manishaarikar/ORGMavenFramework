Feature: outline demo

@outline
Scenario Outline: Verify user able to login wiht valid different data set
	Given user open browser and launch url
	When user enter username as "<userName>" on login page
	And user enter password as "<password>" on login page
	And user click on login button on login page
	Then user should navigate to dashboard page

	Examples:
		|userName|password	 |
		|admin	 |admin123 	 |
		|user	 |user123	 |
		|sysadmin|sysadmin123|