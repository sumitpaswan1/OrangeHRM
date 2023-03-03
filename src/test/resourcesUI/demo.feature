
Feature: OrangeHRM Personal Information
    User can see and update Personal Information         
	Background: user is logged in to OrangeHRM
        Given User opens OrangeHRM URL
        And User enters username as Admin and password as admin123
        And Click on login
        And User clicks on the My Info link
        Then User should see my info section
    Scenario: Update personal information with correct input
        Given user is in Personal Information section
        When user clear the existing input fields
        And user update the fields with new input
        And user clicks on the PI Save button
        Then my personal information should get updated
    Scenario: Giving invalid input spaces in required field of Personal Information section
        Given user is in Personal Information section
        When user clear the existing input fields
        And user update the required fields with spaces
        And user clicks on the PI Save button
        But it should show me error message
    Scenario: Giving invalid input numbers in required field of Personal Information section
        Given user is in Personal Information section
        When user clear the existing input fields
        And user update the required fields with numbers
        And user clicks on the PI Save button
        But it should show me error message


Feature: Manage Contact Details
     Background: user is logged in to OrangeHRM
        Given User opens OrangeHRM URL
        And User enters username as Admin and password as admin123
        And Click on login
    And User clicks on the My Info link
    Then User should see my info section
   Scenario: View employee contact details
    Given user is in Contact Details section
    Then user should see the employees contact details
   Scenario: Edit employee contact details
    Given user is in Contact Details section
    When user updates the employees contact details
    And user click on the Contact details Save button
    Then the employees contact details should be updated successfully
   Scenario: Add emergency contact
    Given user is in Emergency Contact section
    When user clicks on the Emergency Contact Add button
    And user fill in the emergency contact details
    And user click on the Emergency Contact Save button
    Then the emergency contact should be added successfully
   Scenario: Edit emergency contact
    Given user is in Emergency Contact section
    When user click on the Emergency Contact Edit button for an emergency contact
    And user update the emergency contact details
    And user click on the Emergency Contact Save button
    Then the emergency contact should be updated successfully
   Scenario: Delete emergency contact details
    Given user is in Emergency Contact section
    When user click on the Delete button for emergency contact details
    Then the emergency contact details should be deleted successfully


Feature: Add new dependent
   Background: user is logged in to OrangeHRM
    Given User opens OrangeHRM URL
    And User enters username as Admin and password as admin123
    And Click on login
    And User clicks on the My Info link
    Then User should see my info section
   Scenario Outline: Add a new dependent
    Given user is in Dependents section
    And user click on the Add button
    And user fill in the required fields "<name>" "<relation>" "<others>" "dob" for the new dependent
    And user click on the Dependents Save button
    Then user should see a success message indicating that the new dependent has been added
    Examples:
        |  name | relation | others  |     dob    |
        | Suraj | Others   | Brother | 1999-01-01 |
        | Saket | Child    | null    | 2014-10-02 |
   Scenario: Edit existing dependent
    Given user is in Dependents section
    When user search for an existing dependent
    And user click on the dependent Edit button
    And user update the details for the dependent
    And user click on the Dependents Save button
    Then user should see a success message indicating that the dependent details have been updated   Scenario: Delete existing dependent
    Given user is in Dependents section
    When user search for an existing dependent
    And user click on the Dependents Delete button
    And user confirm the deletion
    Then user should see a success message indicating that the dependent has been deleted


