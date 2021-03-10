Feature: launch automation practice
	Scenario: launch the application
	    Given user launch the browser
	    When user enter valid userame "dhivyasathan1212@gmail.com" as username
	    And user enter valid password "divsathan123" as password
	    And user click the login button 
	    Then application goes to the home page