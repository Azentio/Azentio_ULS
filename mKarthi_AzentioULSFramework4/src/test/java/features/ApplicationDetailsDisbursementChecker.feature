Feature: To verify user is able to view Application Details tab at Disbursement Checker stage
#ADC_01_01, ADC_01_02, ADC_01_03, ADC_01_04, ADC_01_05, ADC_01_06, ADC_01_07, ADC_01_08, ADC_01_09, ADC_01_10, ADC_01_11, ADC_01_12, ADC_01_13, ADC_01_14, ADC_01_15, ADC_01_16, ADC_01_17, ADC_01_18, ADC_01_19, ADC_01_20, ADC_01_21, ADC_01_22
@AT-ADC-001
Scenario: To verify the availability of Application Details tab under Disbursement Checker stage
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in application detail disbursement checker
And User verify the primary product field in application detail disbursement checker
And User verify the primary sub product field in application detail disbursement checker
And User verify the total finanace amount requested field in application detail disbursement checker
And User verify the declared net income field in application detail disbursement checker
And User verify the declared current obligations field in application detail disbursement checker
And User verify the special promotion campaign field in application detail disbursement checker
And User verify the sourcing channel field in application detail disbursement checker
And User verify the business center code field in application detail disbursement checker
And User verify the servicing type field in application detail disbursement checker
And User verify the servicing entity field in application detail disbursement checker
And User verify the servicing branch field in application detail disbursement checker
And User verify the closing staff or servicing staff or RM field in application detail disbursement checker
And User verify the sourcing type field in application detail disbursement checker
And User verify the sourcing staff field in application detail disbursement checker
And User verify the sourcing entity field in application detail disbursement checker
And User verify the sourcing office field in application detail disbursement checker
And User verify the reference type field in application detail disbursement checker
And User verify the reference entity field in application detail disbursement checker
And User verify the reference code field in application detail disbursement checker
And User click the work flow icon in application detail disbursement checker

#ADC_01_26, ADC_01_23, ADC_01_24, ADC_01_25
@AT-ADC-002
Scenario: To verify user is able to modify  existing record of Application Details under Disbursement Checker screen
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in application detail disbursement checker
And User verify the availability of Add button on Application Detail offering
And User Verify the Values in List view should be non editable in application detail disbursement checker
And User verify the back button functionality in application detail disbursement checker
