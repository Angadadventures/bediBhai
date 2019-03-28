Feature: Payment Details Feature
checks payment details are entered valid or not

Scenario: User is trying to enter invalid set of details
Given User is on the Payment Details Page on Browser

	When  user is trying submit data without entering 'Card holder name'
 	 Then  'Please fill the Card holder name' alert message should display
 	 
 	 	When  User is trying to submit request without entering 'Debit card Number'
 	 Then  'Please fill the Debit card Number' alert message should display
 	 
 	 When  User is trying to submit request without entering 'CVV'
 	 Then  'Please fill the CVV' alert message should display
 	 
 	When  User is trying to submit request without entering valid 'expiration month'
 	 Then  'Please fill expiration month' alert message should display
 	 
 	 	When  User is trying to submit request without selecting 'expiration year'
 	 Then  'Please fill the expiration year' alert message should display
 	 
 	 Scenario: User is trying to enter valid set of details
 	  Given User is accessing the Payment Details Page on Browser
 	  When  User is trying to submit request after entring valid set of information 
 	  Then 'Conference Room Booking successfully done!!!' alert message should display
 	  
 	 
 	 
 	 