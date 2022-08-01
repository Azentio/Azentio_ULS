Feature: To verify the ULS master screen 
#@M1
#Scenario: To verify maker user can able to create and submit the scheme master record
#Given Navigate to ULS application URL
#Then login with valid maker credentials
#And click on product defenition main module
#Then choose scheme master view button
#And click on add button to create the scheme master record
#SM_01_01
#Then verify back and save buttons are visible
#And verify user can able to fill the details and save the scheme master record
#And verify description field should be mendatory and user can able to pass the data in it
#And verify product type should be mendatory field and user can able to choose the product type
#And verify product sub type should be mendatory field and user can able to choose the product sub type dropdown
#And verify loan currency drop down shoudl be mendatory and user can able to select the data from the drop down
#And verify Indexation Currency field should be mendatory and user can able to select the drop down
#And verify valid from calendar field field should be mendatory and user can able to slecet the date
#And verify valid to date calendar field should be mendatory and user can able to slecet the to date
#And verify min finance amount text box field should me mendatory and user can able to pass the data in it
#And verify max finance amount text box field should be mendatory and user can able to pass the data in it
#And verify Min Tenor In months text box field should be mendatory user can able to pass the data in it
#And verify Max Tenor In months Text box field should be mendatory user can able to pass the data in it
#And Verify Repayment Type field should be mendatory user can able to choose the data
#And verify flat reducing drop down field should be mendatory user can able to slecet the data 
#And verify int Amortization method field should be mendatory and user can able to select the data
#And verify compute installment on field should be mendatory and user can able to slecet the data from the dropdown
#And verify inst due method field should be mendatory user can able to slect the data in drop down
#And verify verify LPC grace period field should be mendatory and user can able to fill the data in it
#And verify principal Repayment Frequency field should be mendatory user can able to select the data from the drop down
#And verify intereset repayment frequency field should be mendatory user can able to select the data from drop down
#And verify inst rounding logic field should be mendatory and user can able pass the data in it
#And verify Loan Eligibility Calc field should be mendatory and user can able to select the data from the drop down
#And verify Reamrk field should be mendatory user can able to enter the reamrk in it
#And verify include co applicant INC field should be mendatory user can able to select the data from the drop down
#And verify include GuarantorInc field should be mendatory and user can able to select the data from drop down
#And verify due period required field should be mendatory and user can able to select the data from drop down
#And verify max co applicans field should be mendatory and user can able to pass the data in it
#And verify max guarantors field should be mendatory user can able pass the data in it
#And verify inst commence field should be mendatory user can able to slecet the data from the drop down
#And verify days in year field should be mendatory user can able to select the data from dropdown
#And verify multiple disburs tranch allowed field should be non mendatory and user can able to slecet the data from the dropdown
#And verify incluse income Dedu dept field should be mendatory and user can able to select the data from dropdown
#And verify Round off field should be mendatory user can able to select the data from the drop down
#And verify round off value field should be mendatory user can able to pass the data in the text box
#And verfy offer validity field should be mendatory user can able to pass the data in the text box
#And verify appropriation code field should be mendatory user can able to slecet the data from the drop down
#And verify baloon allowed field should be mendatory user can able to select the data from drop down
#And verify maximum Baloon percentage field should be mendatory user can able to pass the data in it
#And verify min IRR field should be mendatory user can able to pass the dta in it
#And verify Max Irr field should be mendatory and user can able to pass the data in it
#And verify pre owned asset should be mendatory user can able to select the data from the drop down
#And verify Day count for Bpi field should be mendatory and user can able to select the data from drop down
#And verify discount factor Rounding field should be mendatory and user can able to pass the data in it
#And verify interest charging starts from field should be mendatory user can able to select the data from the drop down
#And verify MI Recovery field should be mendatory user can able to select the data from the dropdown
#And verify BPI Recovery field should be mendatory user can able to select the data from the drop down
#And verify installment recovery type field should be mendatiry user can able to select the data from the drop down
#And verify rate type field should be mendatory user can able to select the dta from drop down
#And verify initiate disc factory field should be mendatory user can able to select the data from drop down
#And verify resch lockin text box should not be mendatory user can able to pass the data in text box
#And verify Max Resch In a year text box should be mendatory user can able to pass the data in it
#And verify total resch Allowed text box should be non mendatory user can able to pass the data in it
#And verify Reschedulement Lock in starts field should be non mendatory user can able to slect the data from the drop down
#And verify bulk payment field should be mendatory user can able to select the data from the drop down
#And verify No of Bulk payment in Year field should be mendatory user can able to pass the data
#And verify bulk payment Lockin period field should be mendatory user can able to enter the data in it
#And verify bulk payment Lockin Period field should be non mendatory user can able to pass the data in it
#And verify bulk payment time interval field should be non mendatory user can able to enter the data
#And verify bulk payment Lock in starts from field should be non mendatory user can able to select the data teh data from drop down
#And verify max bulk payment value field should be mendatory user can able to enter the data in it
#And verify immediate due date field should be mendatory user can able to select the data from the drop down
#And verify Min Bulk Payment Parameter field should be mendatory user can able to select the data from the drop down
#And verify max bulk payment parameter field should be mendatory user can able to select the data from the drop down
#And verify Fore closure Lockin field should be non mendatory user can able to enter the data in it
#And verify ForeClosure Lock in starts from field should be non mendatory user can able to select the data from the drop down
#And verify min Rebate Parameter field should be non mendatory user can able to select the data from the drop down
#And verify min Rebate Value field should be non mendatory user can able to fill the data in the text box
#And verify max Rebate parameter should be non mendatory user can able to select the data from drop down
#And verify max rebate value field should be non mendatory user can able to enter the data in it
#And verify interest holiday field should be non mendatory user can able to pass the data in it
#And verify principal holiday field should be non mendatory user can able to pass the data in it
#And verify Recomputation of profit field should be non mendatory user can able to select the data from the drop down
#And verify Is Set up allowed field should be non mendatory user can able to select the data from the drop down
#And verify max step up field should be non mendatory and user can able to fill the data in it
#And verify eligibility type field should be non mendatory user can able to select the data in it
#And verify PreEmi field should be mendatory user can able to select the data from the drop down
#And verify no of Pre EMI Installment should be mendatory user can able to enter the data in it
#And verify is loan Transfer Allower field should be non mendatory user can able to select the data from the drop down
#Then verify user can able to save the scheme master record
#Then click on temp view of scheme master 
#And select the first record
#And click on charge scheme sub screen
#Then click on add button in charge scheme sub menu
#And verify master charge drop down should be mendatory user can able to select the data from the drop down
#And verify charge dropdown should be non mendatory user can able to select the dta from the drop down
#And verify calculation type field should be mendatory user can able to select the data from the drop down
#And verify falt amount field should be non mendatory user can able to enter the data in it
#And verify percentage text box should be non mendatory user can able to enter the data in it
#And verify calculated on field should be non mendatory user can able to select the data from the drop down
#And verify RecPay field should be non mendatory user can able to select the data from the drop down
#And verify Recfrom PayTo field should be non mendatory user can able to select the data from the drop down
#And verify include in cust IRR field should be non mendatory user can able to select the data from the drop down
#And verify inc in bank IRR field should be non mendatory user can able to select the data from the drop down
#And verify level drop down should be non mendatory user can able to slect the data from the drop down
#And verify currency field should be non mendatory user can able to select the data from the drop down
#And verify event field should be non mendatory user can able to select the data from the drop down
#And verify data unit dropdown should be non mendatory user can able to select the data from the drop down
#And verify date value field should be non mendatory user can able to pass the data in it
#And verify charge count field should be non mendatory user can able to pass the data in it
#And verify accounting type field should be mendatory field should be mendaory user can able to select the data from the drop down
#And verify stage dropdown field should be non mendatroy user can able to select the data from the drop down
#And verify module dropdown field should be non mendatroy user can able to select the data from the drop down
#And verify remarks field should be non mendatory user can able to pass the data in it
#And save the charge scheme record
#Then click on temp view of scheme master 
#And select the first record
#Then goto basic eligibility screen
#Then click on add button in basic eligibility 
#And verify Eligibility type field should be non mendatory user can able to fill the data in it
#And verify Eligibility field should be mendatory user can able to fill the data in it
#And verify Base field should be mendatory and user can able to fill the data inside the text box
#And verify Income To be Used field should be mendatory user can able to select the data from drop down
#And verify Rule drop down field should be non mendatory user can able to slect the datafrom the drop down
#Then save the eligibility record
#Then click on temp view of scheme master 
#And select the first record
#Then goto verification screen
#And click on add button to create the verification record
#And veirfy verification stage field should be mendatory user can able to select the data from the drop down
#And verify rule field should be non mendatory user can able to select the data from the drop down
#Then save the verification Record
#Then click on temp view of scheme master 
#And select the first record
#Then goto valuation screen to add the data
#Then click on add button to add the valuation data
#And verify asset type field should be mendatory user can able to select the data from the drop down
#And verify valuation rule field should be non mendatory user can able to select the data from the drop down
#And verifynumber of valuation field should be mendatory user can able to fill the data inside the text box
#And save the valuation record
#Then click on notification in schemeMaster module
#And select the record from the notification list
#Then submit the record from the maker stage
#Then verify record is submitted from the maker end
#
#@M2
#Scenario: Checker approve the scheme master record
#Given Navigate to ULS application URL
#Then login with checker user
#And click on menu bar the click on inbox 
#Then select the scheme record which is submitted by maker
#And verify the checker user can able to see the same record which is submited by maker
#Then click on approve button
#And give the checker remark in alert and approve it
#Then verify checker user can able to see the successfull pop up after approving the record from checker end


@deactivate
Scenario: Verify user can able to deactivate the scheme charge basic Eligibility and verification valuation screen record
Given Navigate to ULS application URL
Then login with valid maker credentials
And click on product defenition main module
Then click on temp view of scheme master
And select the first record
And click on charge scheme sub screen
Then select the active data from the scheme master
Then Deactivate the schemeCharge Record
And save the charge scheme record
Then goto basic eligibility screen
Then select the active data from the eligibility screen
Then change the staus to inactive
Then save the eligibility record
Then goto verification screen
Then select the active record from the list of verification record
And change the record status active to inactive
Then save the verification Record
Then goto valuation screen to add the data
And Select the active data from the valuation screen
And change the record status active to inactive
And save the valuation record

