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
import testDataType.ULS_ProjectMasterTestData;
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
	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */

		loginCredentials = getKULSCredentialsList();
		schemeMasterTestData=getUlsSchemeMasterTestData();
		projectMasterTestData=getUlsProjectMasterTestData();
		underWriterOffSetControlTestData=getUnderWriterOffSetControlTestData();

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
}