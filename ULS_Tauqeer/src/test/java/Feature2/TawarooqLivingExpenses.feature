@tag
Feature: Title of your feature

  @AT_LEA_01
  Scenario: Living Expense at App data entry stage 
  
  Given navigate the IJARA URL
  And login with valid credentials3
  And User get the test data for test case AT_LEA_01
  #And user click on the module name dropdown under uls application
  And user click on the inbox under uls application
  And User click the Search button under inbox in uls application
  And user search the ref id under inbox in uls application
  And user click the entitle button under inbox in uls application
  And user click on the living expenses under app data entry stage
  And user click on the add button under living expenses tab at app data entry stage
  And user verify the field are present under living expenses tab at app data entry stage
  
  
  And user give input in customer name field under living expenses at app data entry stage
  And user give input in is house employed field under living expense tab at app data entry stage
  And user give input in spouse salary under living expense tab at app data entry stage
  And user give input in living expense under living expense tab at app data entry stage
  And user give input in expense type under living expense tab at app data entry stage
  And user choose one option under expense type under living expense tab at app data entry stage
  And user give input in amount type under living expense tab at app data entry stage
  And user click on the save button under living expense tab at app data entry stage
  And user capture the post save confirmation message