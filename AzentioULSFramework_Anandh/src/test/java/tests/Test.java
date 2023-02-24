package tests;

import resources.ExcelData;

public class Test {
	public static void main(String args[])
	{
		String filePath = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
		ExcelData excelDataForReportMaster = new ExcelData(filePath, "ReportMaster", "Data Set ID");
		excelDataForReportMaster.updateTestData("AT-RM-T001-D1", "ReportName3", "Report");
	}

}
