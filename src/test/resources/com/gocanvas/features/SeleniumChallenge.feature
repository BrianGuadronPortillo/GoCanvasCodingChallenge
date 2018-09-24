Feature: Automating gocanvas webpage

@challenge  
Scenario:  User should be able to create and publish an App                    
	Given user logs in using valid username and password 
	And the user clicks on Create App
	And the user selects the template "Blank"
	And fills all required field information 
	When the user saves the changes to template
	Then the user should be able to publish the template
	