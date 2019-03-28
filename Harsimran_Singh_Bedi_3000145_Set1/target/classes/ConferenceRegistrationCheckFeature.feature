Feature: Conference Registration Check Feature
Scenario: User is trying to register using invalid set of details
Given User is on the Conference Registartion Page on Browser

	When  user is trying submit data without entering 'First Name'
 	 Then  'Please fill the First Name' alert message should display
 	 
 	 	When  User is trying to submit request without entering 'Last Name'
 	 Then  'Please fill the Last Name' alert message should display
 	 
 	 When  User is trying to submit request without entering 'Email'
 	 Then  'Please fill the Email' alert message should display
 	 
 	When  User is trying to submit request without entering valid 'Contact No'
 	 Then  'Please fill the Contact No' alert message should display
 	 
 	 	When  User is trying to submit request without selecting 'No of people attending'
 	 Then  'Please fill the Number of people attending' alert message should display
 	 
 	 	When  User is trying to submit request without entering 'Building Name and Room no'
 	 Then  'Please fill the Building & Room No' alert message should display
 	 
 	 
 	 	When  User is trying to submit request without entering 'Area Name'
 	 Then  'Please fill the Area name' alert message should display
 	 
 	 When  User is trying to submit request without selecting 'city'
 	 Then  'Please select city' alert message should display
 	 
 	 When  User is trying to submit request without selecting 'state'
 	 Then  'Please select state' alert message should display
 	 
 	  When  User is trying to submit request without selecting 'Membership Status'
 	 Then  'Please Select MemeberShip status' alert message should display
 	 
 	 
 	 Scenario: User is trying to register using valid set of details
 	  Given User is accessing the Conference Registartion Page on Browser
 	  When  User is trying to submit request after entring valid set of information 
 	  Then 'Personal details are validated.' alert message should display
 	  
 	 
 	 
 	 