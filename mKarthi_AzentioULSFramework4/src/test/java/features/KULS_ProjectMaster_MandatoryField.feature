Feature: To verify the impact when user keep any mandatory field blank and click on save button
@AT-PM-T019
Scenario: To verify the impact when user keep any mandatory field blank and click on save button
Given User login into maker in project master for validation
Then Click the project setup in project master for validation
And Click the project setup edit icon in project master for validation
And Click the action edit icon project master for mandatoryField validation
And Click the building details add icon in project master
And Verify the impact when user enters only special characters value in any field
And Verify the impact when user enter numeric value in character field
And Verify the impact when user enter characters  value in numeric field
Then Click the save button in project master
And Verify the impact when user keep any mandatory field blank


 