package resources;

import java.util.HashMap;
import java.util.Map;

public class CheckerUserPicker {
	public String filePath;
	public 
	static ExcelReader reader;
	public CheckerUserPicker(String filePath)
	{
		this.filePath=filePath;
	}

	public Map<String, String> checkerUserID() {
		reader= new ExcelReader(filePath);
		Map<String, String> checkerTestData = new HashMap<>();
		//int rowCount = reader.getRowCount("CheckerUserCredentials");
		int coulumnCount = reader.getColumnCount("CheckerUserCredentials");
		
		//System.out.println(rowCount);
		//System.out.println(coulumnCount);
		for (int i = 0; i < coulumnCount; i++) {
			String cellData = reader.getCellData("CheckerUserCredentials", i, 1);			
			String columnCellData = reader.getCellData("CheckerUserCredentials", i, 2);
			checkerTestData.put(cellData, columnCellData);
		}
		return checkerTestData;
	}
	public String checkerUserGetter()
	{
		reader = new ExcelReader(filePath);
		String checkerUserName = reader.getCellData("CheckerUserCredentials", 0, 4);
		return checkerUserName;
	}

}
