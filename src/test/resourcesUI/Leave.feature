Feature: Leave module functionality

  Background: Login and navigate to Leave module
    Given User on the OrangeHRM login page
    When User enter valid credentials and click Login
    Then User should be logged in successfully
    And User should see the dashboard
    When User click on the Leave module in the left navigation menu
    Then User should be redirected to the Leave module page
    And User should see Apply, My Leave, Entitlements, Reports, configure, Leave List and Assign Leave
    
  Scenario: Search leave list with correct input
  	Given User is in leave list section
  	When User reset the existing input fields
    And User Update the existing input fields
    And User clicks on the search button
    Then the leave list should be submitted successfully
    And User can click on Approve button to approve the leave
    And User can click on Reject button to reject the leave

  Scenario: view the Apply for the leave
		Given user is in Leave Section
		When User is Click on the Apply section
		Then User is successfully Redirected to Apply page
		
	Scenario: View my leave 
  	Given User is in Leave Section
    When User click on the My Leave button
   	And User Reset the existing input fields
   	And User enter the input in required fileds
    And User can click on the Search button
    Then the my leave details should be updated successfully
    
  Scenario: View my leave entitlements
   	Given User is in Leave Section
    When User click on the Entitlements dropdown
    Then User should see Add Entitlements, Employee Entitlements, and My Entitlements
    
  Scenario: Add leave entitlements for an employee
  	Given User is in Leave Section
    When User click on the Entitlements dropdown
    And User click on the Add Entitlements section
    And User select the all the mandatory fields 
    And User  click on the Save button
    And User  can click on the cancel button
    Then the add entitlements should be added for the employee successfully

  Scenario: View leave entitlements for an employeee
   	Given User is in Leave Section
    When User click on the Entitlements dropdown
    And User select Employee Entitlements section
    And User select The all the mandatory fields
    And User can click on the search button
    Then User can successfully search the entitlements
    
  Scenario: View my leave entitlements
   	Given User is in Leave Section
    When User click on the Entitlements dropdown
    And User select all mandatory fields
    And User can click on the serch button
    Then User can successfully view the leave entitlements
    When User can on the click Add button
		Then user redirected to Add leave entitlements page
		And User enter the all the mandatory fields 
		And user can click on the Save button
		Then user can successfully search the leave entitlements
		
	Scenario: View Configure
   	Given User is in Leave Section
    When User click on Configure 
    Then User should see Add Entitlements, Employee Entitlements, and My Entitlements

   Scenario: view Leave Period 
   	Given User is in Leave Section
    When User click on the Configure dropdown
    And User select Leave Period
    And User click on the reset button to reset the input field
    And User set the leave period start and end dates
    And I click on the Save button
    Then the leave period should be updated successfully
    
  Scenario: view Leave Types
   	Given User is in Leave Section
    When User click on the Configure dropdown
    And User select Leave Types
    When User click on the Add 
    And User enter the all mandatory input fileds
    When User can click on the cancel button
    Then User successfully redirect to Leave Types page
    And User click on the Save button 
    Then the leave period should be updated successfully
    When user click on the delete icon the to delete the record
    And user click on Yes,Delete button
    Then the record is successfully deleted
    When user click on the edit icon 
    Then user is redirected to  Add Leave types page
    
  Scenario: view Work Weak 
   	Given User is in Leave Section
    When User click on the Configure dropdown
    And User select Work Weak
    And user enter the  value in all mandatory field
    And I click on the Save button
    Then the Work Weak should be updated successfully
    
  Scenario: Assign leave to an employee
  	Given User is in Leave Section
    When User click on the Assign Leave button
    And User select the employee name and leave type
    And User set the leave period and duration
    And User provide a reason for the leave
    And User click on the Assign button
    Then the leave should be assigned to the employee successfully
    And the employees leave balance should be updated accordingly
 