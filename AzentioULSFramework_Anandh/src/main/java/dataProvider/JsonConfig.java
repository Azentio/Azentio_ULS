package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import testDataType.KULS_Login_TestDataType;
import testDataType.KULS_UnderWriterOffSetControlTestData;
import testDataType.KULS_WareHouseMasterTestData;
import testDataType.ULS_AssetCollateralTypeTestData;
import testDataType.ULS_CheckerTestData;
import testDataType.ULS_LoModuleWaiverTestData;
import testDataType.ULS_ProjectMasterTestData;
import testDataType.ULS_ReportMasterTestData;
import testDataType.ULS_SchemeMasterTestDataType;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	// ULS Login
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;
	private final String KULS_SchemeMasterFilePath = configFileReader.getJsonPath() + "ULS_SchemeMasterTestData.json";
	private List<ULS_SchemeMasterTestDataType> schemeMasterTestData;
	
	private final String KULS_ProjectMasterFilePath = configFileReader.getJsonPath() + "ULS_ProjectMasterJSON.json";
	private List<ULS_ProjectMasterTestData> projectMasterTestData;

	private final String KULS_UnderWriterOffSetControl = configFileReader.getJsonPath() + "KULS_UnderWriterOffSetControlJSON.json";
	private List<KULS_UnderWriterOffSetControlTestData> underWriterOffSetControlTestData;
	
	private final String KULS_WareHouseFilePath = configFileReader.getJsonPath() + "ULS_WareHouseJSON.json";
	private List<KULS_WareHouseMasterTestData> wareHouseTestData;
	
	private final String ULS_AssetCollateralJSONFilePath = configFileReader.getJsonPath() + "ULS_AssetCollateralTypeJSON.json";
	private List<ULS_AssetCollateralTypeTestData> assetCollateratTypeTestdata;
	
	private final String uls_LoModuleWaiverJsonFile = configFileReader.getJsonPath() + "ULS_LOModuleWaiverJSON.json";
	private List<ULS_LoModuleWaiverTestData> loModuleWaiverTestData;
	private final String uls_CheckerUserTestDataPath = configFileReader.getJsonPath() + "ULS_CheckerDataJSON.json";
	private List<ULS_CheckerTestData> uls_CheckerUserTestData;
	
	private final String uls_ReportMasterTestDataPath = configFileReader.getJsonPath() + "ULS_ReportMasterTestDataJSON.json";
	private List<ULS_ReportMasterTestData> uls_ReportMasterTestData;
	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */

		loginCredentials = getKULSCredentialsList();
		schemeMasterTestData=getUlsSchemeMasterTestData();
		projectMasterTestData=getUlsProjectMasterTestData();
		underWriterOffSetControlTestData=getUnderWriterOffSetControlTestData();
		wareHouseTestData= getWareHouseTestData();
		assetCollateratTypeTestdata=getAssetCollateralTypeTestData();
		loModuleWaiverTestData=getLoModuleWaiverTestData();
		uls_CheckerUserTestData=getCheckerUserTestData();
		uls_ReportMasterTestData=getReportMasterTestData();
	}

	

	private List<ULS_ReportMasterTestData> getReportMasterTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(uls_ReportMasterTestDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(uls_ReportMasterTestDataPath));
			ULS_ReportMasterTestData[] uls_ReportMasterTestData = gson.fromJson(bufferReader, ULS_ReportMasterTestData[].class);
			return Arrays.asList(uls_ReportMasterTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + uls_ReportMasterTestDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}



	private List<ULS_CheckerTestData> getCheckerUserTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(uls_CheckerUserTestDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(uls_CheckerUserTestDataPath));
			ULS_CheckerTestData[] ulsCheckerTestData = gson.fromJson(bufferReader, ULS_CheckerTestData[].class);
			return Arrays.asList(ulsCheckerTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + uls_CheckerUserTestDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}



	private List<ULS_LoModuleWaiverTestData> getLoModuleWaiverTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(uls_LoModuleWaiverJsonFile));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(uls_LoModuleWaiverJsonFile));
			ULS_LoModuleWaiverTestData[] loModuleWaiverTestData = gson.fromJson(bufferReader, ULS_LoModuleWaiverTestData[].class);
			return Arrays.asList(loModuleWaiverTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + uls_LoModuleWaiverJsonFile);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}



	private List<ULS_AssetCollateralTypeTestData> getAssetCollateralTypeTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ULS_AssetCollateralJSONFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ULS_AssetCollateralJSONFilePath));
			ULS_AssetCollateralTypeTestData[] assetCollateralTypeTestData = gson.fromJson(bufferReader, ULS_AssetCollateralTypeTestData[].class);
			return Arrays.asList(assetCollateralTypeTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ULS_AssetCollateralJSONFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}



	private List<KULS_WareHouseMasterTestData> getWareHouseTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(KULS_WareHouseFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(KULS_WareHouseFilePath));
			KULS_WareHouseMasterTestData[] wareHouseTestData = gson.fromJson(bufferReader, KULS_WareHouseMasterTestData[].class);
			return Arrays.asList(wareHouseTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + KULS_WareHouseFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}



	private List<KULS_UnderWriterOffSetControlTestData> getUnderWriterOffSetControlTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(KULS_UnderWriterOffSetControl));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(KULS_UnderWriterOffSetControl));
			KULS_UnderWriterOffSetControlTestData[] underWriterOffSetControlTestData = gson.fromJson(bufferReader, KULS_UnderWriterOffSetControlTestData[].class);
			return Arrays.asList(underWriterOffSetControlTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + KULS_UnderWriterOffSetControl);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}	
	}



	private List<ULS_ProjectMasterTestData> getUlsProjectMasterTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(KULS_ProjectMasterFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(KULS_ProjectMasterFilePath));
			ULS_ProjectMasterTestData[] projectMasterTestData = gson.fromJson(bufferReader, ULS_ProjectMasterTestData[].class);
			return Arrays.asList(projectMasterTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + KULS_ProjectMasterFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}	
	}



	private List<KULS_Login_TestDataType> getKULSCredentialsList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(KULSLoginDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(KULSLoginDataPath));
			KULS_Login_TestDataType[] credentials = gson.fromJson(bufferReader, KULS_Login_TestDataType[].class);
			return Arrays.asList(credentials);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + KULSLoginDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	private List<ULS_SchemeMasterTestDataType> getUlsSchemeMasterTestData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(KULS_SchemeMasterFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(KULS_SchemeMasterFilePath));
			ULS_SchemeMasterTestDataType[] schemeMasterTestData = gson.fromJson(bufferReader, ULS_SchemeMasterTestDataType[].class);
			return Arrays.asList(schemeMasterTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + KULS_SchemeMasterFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}	
	}

	public final KULS_Login_TestDataType getKULSLoginCredentialsByName(String Username) {
		return loginCredentials.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	public final ULS_SchemeMasterTestDataType getUlsSchemeMasterTestDataByName(String Username) {
		return schemeMasterTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	public final ULS_ProjectMasterTestData getUlsProjectMasterTestDataByName(String Username) {
		return projectMasterTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//KULS_UnderWriterOffSetControlTestData> underWriterOffSetControlTestData
	public final KULS_UnderWriterOffSetControlTestData getUlsUnderWriterOffSetControlTestDataByName(String Username) {
		return underWriterOffSetControlTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//KULS_WareHouseMasterTestData> wareHouseTestData
	public final KULS_WareHouseMasterTestData getUlsWareHouseTestDataByName(String Username) {
		return wareHouseTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//ULS_AssetCollateralTypeTestData> assetCollateratTypeTestdata
	public final ULS_AssetCollateralTypeTestData getAssetCollateralTypeTestDataByName(String Username) {
		return assetCollateratTypeTestdata.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//ULS_LoModuleWaiverTestData> loModuleWaiverTestData
	public final ULS_LoModuleWaiverTestData getLoModuleWaiverTestDataByName(String Username) {
		return loModuleWaiverTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//ULS_CheckerTestData> uls_CheckerUserTestData;
	public final ULS_CheckerTestData getLoCheckerUserTestDataByName(String Username) {
		return uls_CheckerUserTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//ULS_ReportMasterTestData> uls_ReportMasterTestData
	public final ULS_ReportMasterTestData getReportMasterTestDataByName(String Username) {
		return uls_ReportMasterTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
}