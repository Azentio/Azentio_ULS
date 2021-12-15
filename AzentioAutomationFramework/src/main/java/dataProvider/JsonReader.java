package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import testDataType.BUDGET_BudgetCreationTestDataType;
import testDataType.BUDGET_RequestAndAllocationTestDataType;
import testDataType.KUBS_LoginTestDataType;
import testDataType.Logindata;
import testDataType.RegisterData;


public class JsonReader {
	ConfigFileReader configFileReader = new ConfigFileReader();
	private final String RegisterFilePath = configFileReader.getJsonPath() + "RegisterJson.json";
	private List<RegisterData> RegisterList;
	
	private final String LoginFilePath = configFileReader.getJsonPath() + "LoginJson.json";
	private List<Logindata> LoginList;
	
	
	private final String AllocationFilepath = configFileReader.getJsonPath() + "Budgetreqandallocation.json";
	private List<BUDGET_RequestAndAllocationTestDataType> allocationList;

	private final String BudtypeFilepath = configFileReader.getJsonPath() + "Budtype.json";
	private List<BUDGET_RequestAndAllocationTestDataType> BudtypeList;
	
	private final String BudgetCreationPath = configFileReader.getJsonPath() + "LoginJson.json";
	private List<BUDGET_BudgetCreationTestDataType> BudgetList;
	
	private final String AzentioLoginDataPath = configFileReader.getJsonPath() + "AzentioCredentials.json";
	private List<KUBS_LoginTestDataType> credentialslist;


	public JsonReader(){
		RegisterList = getRegisterData();
		LoginList=getLoginList();

		allocationList = getAllocationList();
		BudtypeList = getBudtypeList();
		
		BudgetList =getBudgetList();
		credentialslist=getAzentioCredentialsList();


	}
	
	private List<RegisterData> getRegisterData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(RegisterFilePath));
			RegisterData[] registers = gson.fromJson(bufferReader, RegisterData[].class);
			return Arrays.asList(registers);
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + RegisterFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}
	private List<Logindata>getLoginList(){
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(LoginFilePath));
			Logindata[] login = gson.fromJson(bufferReader, Logindata[].class);
			return Arrays.asList(login);
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + RegisterFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}
		
	
	private List<BUDGET_RequestAndAllocationTestDataType> getAllocationList() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(AllocationFilepath));
			BUDGET_RequestAndAllocationTestDataType[] allow = gson.fromJson(bufferReader, BUDGET_RequestAndAllocationTestDataType[].class);
			return Arrays.asList(allow);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + AllocationFilepath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
private List<BUDGET_RequestAndAllocationTestDataType> getBudtypeList() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(BudtypeFilepath));
			BUDGET_RequestAndAllocationTestDataType[] type = gson.fromJson(bufferReader, BUDGET_RequestAndAllocationTestDataType[].class);
			return Arrays.asList(type);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + BudtypeFilepath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

private List<BUDGET_BudgetCreationTestDataType>getBudgetList(){
	Gson gson = new Gson();
	BufferedReader bufferReader = null;
	try {
		bufferReader = new BufferedReader(new FileReader(BudgetCreationPath));
		BUDGET_BudgetCreationTestDataType[] budget = gson.fromJson(bufferReader, BUDGET_BudgetCreationTestDataType[].class);
		return Arrays.asList(budget);
	}catch(FileNotFoundException e) {
		throw new RuntimeException("Json file not found at path : " + BudgetCreationPath);
	}finally {
		try { if(bufferReader != null) bufferReader.close();}
		catch (IOException ignore) {}
	}
}
private List<KUBS_LoginTestDataType>getAzentioCredentialsList(){
	Gson gson = new Gson();
	BufferedReader bufferReader = null;
	try {
		bufferReader = new BufferedReader(new FileReader(AzentioLoginDataPath));
		KUBS_LoginTestDataType[] credentials = gson.fromJson(bufferReader, KUBS_LoginTestDataType[].class);
		return Arrays.asList(credentials);
	}catch(FileNotFoundException e) {
		throw new RuntimeException("Json file not found at path : " + AzentioLoginDataPath);
	}finally {
		try { if(bufferReader != null) bufferReader.close();}
		catch (IOException ignore) {}
	}
}

	
	public final RegisterData getRegisterByName(String customerName){
			 return RegisterList.stream().filter(x -> x.FirstName.equalsIgnoreCase(customerName)).findAny().get();
	}
	
	
	public final Logindata getLoginByName(String UserName){
			 return LoginList.stream().filter(x -> x.User.equalsIgnoreCase(UserName)).findAny().get();
	}
	
	
	public final BUDGET_RequestAndAllocationTestDataType getAllowcationByName(String Budgetallow) {
		return allocationList.stream().filter(x -> x.Budgetcode.equalsIgnoreCase(Budgetallow)).findAny().get();
	}

	public final BUDGET_RequestAndAllocationTestDataType getBudtypeByName(String Budtype) {
		return BudtypeList.stream().filter(x -> x.Yearly.equalsIgnoreCase(Budtype)).findAny().get();
	}
	
	public final BUDGET_BudgetCreationTestDataType getBudgetdataByName(String UName){
		return BudgetList.stream().filter(x ->x.UserName.equalsIgnoreCase(UName)).findAny().get();
		//return RegisterList.stream().filter(x -> x.FirstName.equalsIgnoreCase(customerName)).findAny().get();
}
	public final KUBS_LoginTestDataType getLoginCredentialsByName(String Username){		 
		return credentialslist.stream().filter(x ->x.UserName.equalsIgnoreCase(Username)).findAny().get();
}


}





