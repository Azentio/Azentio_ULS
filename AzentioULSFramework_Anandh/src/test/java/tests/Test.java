package tests;

import resources.ExcelData;

public class Test {
	public static void main(String args[])
	{
		
		String path = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
		ExcelData excelDataForAssetImpairment = new ExcelData(path, "BeneficiaryDetails", "Data Set ID");
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D1", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D2", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D3", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D4", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D5", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D6", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D7", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D8", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D9", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D10", "Beneficiary eMail", "warrentbeffet@gmail.com");	
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D11", "Beneficiary eMail", "warrentbeffet@gmail.com");
		excelDataForAssetImpairment.updateTestData("AT-BD-001_D12", "Beneficiary eMail", "warrentbeffet@gmail.com");
	}

}
