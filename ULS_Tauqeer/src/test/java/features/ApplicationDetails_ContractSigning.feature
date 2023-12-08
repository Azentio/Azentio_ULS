Feature: To verify user is able to view Application Details tab at Contract signing

@AT_DOC_01
Scenario: To verify the availability of Application Details tab  under Contract signing stage
Given navigate the IJARA URL2
And login with valid credentials2
And User get the test data for test case AT_DOC_01
And User click the module name dropdown in ULS application for Application Details at Contract Signing Stage
#And User click the module name dropdown in ULS application for document details at contract signing stage
#And User select the module name as LOS in ULS application
And User select the module name as LOS1 in ULS application for Application Details at Contract Signing Stage
And User click the Mail box in ULS application for Application Details at Contract Signing Stage
And User click the Search button under inbox for Application Details at Contract Signing Stage
And User search the Ref id under inbox for Application Details at Contract Signing Stage
And User click the Entitle button under inbox for Application Details at Contract Signing Stage
#And User verify the buttons present on the Application Details page
And user click on the next button
And user click on doc details under contract signing stage
And user click on the view button under document details at contract signing stage
And user verify the fields under document details tab at contract signing stage