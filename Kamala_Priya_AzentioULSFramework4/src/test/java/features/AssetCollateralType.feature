Feature: To verify the functionality of Asset Collateral Type
@AssetCollateralType_M12
Scenario: To verify the Asset Collateral Type List view of Approved records
Given Get the URL and login as maker
And Click the configuration in collateral type
Then click the Asset colllaral config
And Click the temp view button in collateral type
Then To verify the Asset Collateral Type List view in collateral type
Then To verify the functionality of Search box with matching data in collateraltype master
Then To verify the functionality of Search box with unmatching data in collateraltype master
And To verify the functionality of Export to PDF button in collateraltype master
Then To verify the functionality of Export to Excel button in collateraltype master
And To verify the field asset collateral category description

@AssetCollateralType_M13
Scenario: To verify the Asset Collateral Type List view of Approved records
Given Get the URL and login as maker
And Click the configuration in collateral type
Then click the Asset colllaral config
And Click the temp view button in collateral type
Then Click the inbox in collateral type master
Then Search the record in collateral type master
And Click the action icon in the collateral type master
Then Click the view summary button in collateral type master
Then To verify the view workflow in the collateral type master
