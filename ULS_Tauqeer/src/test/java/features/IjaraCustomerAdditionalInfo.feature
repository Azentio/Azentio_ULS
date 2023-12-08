Feature: To verify Customer Additional Info module


 @At_IDA_001
  Scenario: To verify user is able to add new Identification Details record in the system by entering valid data

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_IDA_07
#And User click the module name dropdown in ULS application
And User click the module name dropdown in ULS application for Additional Customer Info at New Application Stage
And User select the module name as LOS1 in ULS application for Additional Customer Info at New Application Stage
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And user click the Additional Customer Info tab
And user click on the Add button under Customer Personal Information under Additional Customer Info tab
And user click on the Add button under Customer Identification under Additional Customer Info tab

  @At_IDA_007
  Scenario: To verify user is able to add new Identification Details record in the system by entering valid data

Given navigate the IJARA URL
And login with valid credentials
And User get the test data for test case AT_IDA_07
#And User click the module name dropdown in ULS application
And User click the module name dropdown in ULS application for Additional Customer Info at New Application Stage
And User select the module name as LOS1 in ULS application for Additional Customer Info at New Application Stage
#And User select the module name as LOS in ULS application
And User click the Mail box in ULS application
And User click the Search button under inbox
And User search the Ref id under inbox
And User click the Entitle button under inbox
And user click the Additional Customer Info tab
And user click on the Add button under Customer Personal Information under Additional Customer Info tab
And user click on the Add button under Customer Identification under Additional Customer Info tab