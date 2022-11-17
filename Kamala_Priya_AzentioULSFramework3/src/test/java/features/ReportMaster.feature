Feature: To verify the functionalities of report master
#parameter List view validation
@ReportMaster_M11
Scenario: To verify the Report Parameter DetailList view of Approved records in report master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then choose the data set id for for list view validation
And Click the Eye icon of report master
Then Click the first icon in the list view in the report master
And To verify the functionality of Add button in report master
Then To verify the functionality of Search box with matching data in report master
And To verify the functionality of Search box with mismatch data in report master
Then To verify the functionality of Export to PDF button in report master
And To verify the functionality of Export to Excel button in report master
Then To verify the functionality of Sequence number field in report master
And To verify the functionality of Description field in report master
Then To verify the functionality of Status field in report master

#Creation
@ReportMaster_M1
Scenario: To verify user is able to add new Report Master record in the system by entering valid data in report master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the Eye icon of report master
Then Choose the data set id for report master creation
Then Click the add button in the report master
And Enter the report name in report master
Then Fill the report name2 in report master
And Enter the report name3 in report master
Then Fill the report description in report master
And Choose the report type in report master
Then Fill the report URL in report master
And Enter the report catogory in report master
Then Save the record in report master
And Click the inbox in report master
Then Search the record in search field in report master
And Get the reference id in report master
Then Click the first action icon in report master
And Submit the record in report master
Then Get the checker id in report master
#Checker approval
@ReportMaster_M2
Scenario: To verify Checker user is able to Approve the record in report Master
Then Choose the data set id for checker approval in report master
Given Get the URL and login as Checker in report master
Then Click the inbox in the report master
And Search the reference id and click the respective action icon in report master
Then Click the approve button in the report master
And Enter the alert remark in the report master
Then Give the final approve in the report master
And Verify the record get approved in report master
#List View verification 
@ReportMaster_M2.1
Scenario: To verify Approved record is view in the maker list view in report Master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the Eye icon of report master
Then Verify that approved record is present in the list view
@ReportMaster_M1.1
Scenario: To verify user is able to add new Report Master record in the system by entering valid data in report master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then choose the data set id for creation of report master for rejection
And Click the Eye icon of report master
Then Click the add button in the report master
And Enter the report name in report master
Then Fill the report name2 in report master
And Enter the report name3 in report master
Then Fill the report description in report master
And Choose the report type in report master
Then Fill the report URL in report master
And Enter the report catogory in report master
Then Save the record in report master
And Click the inbox in report master
Then Search the record in search field in report master
And Get the reference id in report master for reject
Then Click the first action icon in report master
And Submit the record in report master
Then Get the checker id in report master for rejection flow
#Checker Reject
@ReportMaster_M3
Scenario: To verify Checker user is able to Reject the record in report Master
Then choose the data set id for creation of report master for rejection
Given Get the URL and login as Checker in report master
Then Click the inbox in the report master
And Search the reference id and click the respective action icon in report master for rejection
Then Click the reject button in the report master
And Enter the reject alert remark in the report master
Then Give the final reject in the report master
And Verify the record get rejected in report master
#List View verification 
@ReportMaster_M3.1
Scenario: To verify Reject record is view in the maker list view in report Master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the Eye icon of report master
Then Verify that rejected record is not present in the list view
@ReportMaster_M1.2
Scenario: To verify user is able to add new Report Master record in the system by entering valid data in report master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Choose the data set id for return the records in report master
And Click the Eye icon of report master
Then Click the add button in the report master
And Enter the report name in report master
Then Fill the report name2 in report master
And Enter the report name3 in report master
Then Fill the report description in report master
And Choose the report type in report master
Then Fill the report URL in report master
And Enter the report catogory in report master
Then Save the record in report master
And Click the inbox in report master
Then Search the record in search field in report master
And Get the reference id in report master for return
Then Click the first action icon in report master
And Submit the record in report master
Then Get the checker id in report master for return
#Checker Return
@ReportMaster_M4
Scenario: To verify Checker user is able to Return the record in report Master
And Choose the data set id for return the records in report master
Given Get the URL and login as Checker in report master
Then Click the inbox in the report master
And Search the reference id and click the respective action icon in report master for return
Then Click the return button in the report master
And Enter the return alert remark in the report master
Then Give the final return in the report master
And Verify the record get returned in report master
#List View verification 
@ReportMaster_M4.1
Scenario: To verify Returned record is view in the maker list view in report Master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the temp view in the report master
Then Verify that returned record is present in the temp view



