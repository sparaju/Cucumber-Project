Feature: TechFios test page for background color 

#Background: 
#Given User is on the TechFios dummy page 

Scenario: 
	User should be able to change the background color to a predefined color 
	Given User is on the TechFios dummy page 
	When User enters the page 
	When User clicks on Set SkyBlue Background button 
	Then User should be able to see a new page color 
	
Scenario: User should be able to change the background color back to default 
	Given User has changed the background once  
	When User clicks on Set White Background 
	Then User should be able to see the default background 
