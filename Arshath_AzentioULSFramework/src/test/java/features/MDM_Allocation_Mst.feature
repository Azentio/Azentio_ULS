Feature: Check the functionality of the Allocation Masater
@AT_ALM_014
Scenario: List view of Allocation master - Approved records
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And user click on Allocation Master List view Icon
And User verify the Values in List view should be non editable in Allocation Master 
And user verify the Add button of Allocation Master
And user click on back button in Master
And user click on search box
And user Enter the Mismatch data in search text box
And user click on search box
And user Enter the matching data in search text box
And user click on Export button and Download the PDF file
And user click on Export button and Download the Excel file





















