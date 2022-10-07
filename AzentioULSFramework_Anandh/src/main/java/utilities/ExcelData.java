package utilities;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.val;
import resources.ExcelReader;

public class ExcelData {
   public static void main(String[] args) {
	Map<String,String> testdata = new LinkedHashMap<String,String>();
	ExcelReader reader = new ExcelReader("C:\\Users\\inindc00076\\git\\Azentio_ULSAnandh\\AzentioULSFramework_Anandh\\Test-data\\TestDataDesignSampleNew.xlsx");
	int rowCount = reader.getRowCount("AssetAutoMasterTestData");
	int columnCount = reader.getColumnCount("AssetAutoMasterTestData");
	System.out.println(rowCount+"    "+columnCount);
	int cellRowNum = reader.getCellRowNum("AssetAutoMasterTestData","TestCaseUnique","AT_RM_10AT_RM_10_D2");
	System.out.println(cellRowNum);
	
		for (int j = 1; j <=columnCount; j++) {
			String key = reader.getCellData("AssetAutoMasterTestData",j,1);
			String value = reader.getCellData("AssetAutoMasterTestdata",j, cellRowNum);
			String value1 = null;
			if (value.contains(".0")) {
				String[] split = value.split("[.]");
				 value1 =split[0];
			}
			testdata.put(key, value1);
			if (testdata.containsValue("")) {
				testdata.remove(reader.getCellData("AssetAutoMasterTestData",j,1));
			}			
		}
		System.out.println(testdata);
	System.out.println(testdata.get("AssetModelType"));
	
	
}
   
}
