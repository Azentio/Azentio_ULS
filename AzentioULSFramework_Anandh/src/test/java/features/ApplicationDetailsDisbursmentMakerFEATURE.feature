Feature: To test the disbursment maker screen
@AT_ADM_002
Scenario: To verify application details disbursent maker screen
Given navigate to uls application 
And login with transaction maker credentials
And click on mail box
And get the test data for application details disbursment maker test data
And search for disbursment maker record
And and select the disbursment maker record
And click on application details screeen

And verify classification field should be non editable in disbursment maker
And verify product field should be non editable in disbursment maker
And verify total finance amunt requested field should be non editable in disbursment maker
And verify declared Net monthly income field should bee non editable in disbursment maker
And verify declared current obligation field should be non editable in disbursment maker
And verify special promotion Campaign field should be non editable in disbursment maker
And verify sourcing channel field should be non editable in disbursment maker
And verify business center code field should be non editable in disbursment maker
And verify servicing type field should be non editable in disbursment maker
And veirfy region field should be non editable and readonly on disbursment maker
And verify servcing Branch should be non editable and read only on disbursment maker
And verify spoke location should be non editable and readonly on disbursment maker
And verify closing staff or servicing staf Or RM should be non editable and read only in disbursment maker
And verify Topup Type should be non editable and read only in disbursment maker
And verify Topup Application number should be non editable and read only in disbursment maker