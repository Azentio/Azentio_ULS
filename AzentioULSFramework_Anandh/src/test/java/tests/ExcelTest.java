package tests;

import java.util.HashMap;
import java.util.Map;

import resources.CheckerUserPicker;
import resources.ExcelData;

public class ExcelTest {
public static void main(String args[])
{
	
	String filePath=System.getProperty("user.dir")+"\\Test-data\\ULSTestData.xlsx";
	System.out.println("File Path "+filePath);
	Map<String,String> loginTestData= new HashMap<>();
	ExcelData excelData= new ExcelData(filePath,"UnderWriterOffSetTestData","Data Set ID");
	loginTestData=excelData.getTestdata("AT_UOC_T001_2_D1");
	System.out.println(loginTestData.get("Checker id"));
//	CheckerUserPicker checkerUserPicker= new CheckerUserPicker(filePath);
//	
//	loginTestData=checkerUserPicker.checkerUserID();
//	
//	System.out.println("Checker User from program "+checkerUserPicker.checkerUserGetter());
////	loginTestData.get("CheckerUserName1");
////	loginTestData.get("CheckerUserPassword1")
//	System.out.println("Checker User User Name "+loginTestData.get("CheckerUserName1"));
//	System.out.println("Checker User User Name "+loginTestData.get("CheckerUserPassword1l"));
	
	
}
}
