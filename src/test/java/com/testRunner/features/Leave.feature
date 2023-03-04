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

  Scenario: view the Apply for the leave
		Given User is in leave list section
		When User is Click on the Apply section
		Then User is successfully Redirected to Apply page
		
	Scenario: View my leave 
  	Given User is in leave list section
    When User click on the My Leave button
   	And User Reset the existing input fields
   	And User enter the input in required fileds
    Then User can click on the search button
   
  Scenario: View my leave entitlements
   	Given User is in leave list section
    When User click on the Entitlements dropdown
    
  Scenario: Add leave entitlements for an employee
  	Given User is in leave list section
    When User click on the Entitlements dropdown
    And User click on the Add Entitlements section
    And User select the all the mandatory fields 
    And User  click on the Save button
    

  Scenario: View leave entitlements for an employeee
   	Given User is in leave list section
    When User click on the Entitlements dropdown
    And User select Employee Entitlements section
    And User select The all the mandatory fields
    And User can click on the search button
 
  Scenario: Assign leave to an employee
  	Given User is in leave list section
    When User click on the Assign Leave button
    And User select the employee name and leave type
    Then User click on the Assign button
 