
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @AT_QIA_01
  Scenario: To verify post clicking on Add button, the Quotation Info screen is getting open with all valid fields

   Given navigate the IJARA URL
   And login with valid credentials
   And User get the test data for test case AT_QIA_01
   And User click the module name dropdown in ULS application for quotation info
   And User select the module name as LOS in ULS application for quotation info
   And User click the Mail box in ULS application for quotation info
   And User click the Search button under inbox quotation info
   And User search the Ref id under inbox for quotation info
   And User click the Entitle button under inbox for quotation info
   And user click the next button
   And user click the quotation info tab
   And user click the add new button
   And user verify back button is present
   And user verify all the details under quotation info tab

  
  
  @AT_QIA_03
  Scenario: To verify post clicking on Add button, the Quotation Info screen is getting open with all valid fields
  
   Given navigate the IJARA URL
   And login with valid credentials
   And User get the test data for test case AT_QIA_02
   And User click the module name dropdown in ULS application for quotation info
   And User select the module name as LOS in ULS application for quotation info
   And User click the Mail box in ULS application for quotation info
   And User click the Search button under inbox quotation info
   And User search the Ref id under inbox for quotation info
   And User click the Entitle button under inbox for quotation info
   And user click the next button
   And user click the quotation info tab
   And user click the add new button
   And user click the back button
   And user verify it is navigating to previous screen