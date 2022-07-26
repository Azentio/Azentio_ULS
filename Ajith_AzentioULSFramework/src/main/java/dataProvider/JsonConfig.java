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
import testDataType.Product_RetailMasterTestData;
import testDataType.SubProductMaster_RetailTestData;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	// ULS Login
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;
	private final String ProductRetailPath = configFileReader.getJsonPath() + "Product_MasterRetail.json";
	private List<Product_RetailMasterTestData> productRetailData;
	private final String SubProductRetailPath = configFileReader.getJsonPath() + "SubProductMasterRetail.json";
	private List<SubProductMaster_RetailTestData> SubProductRetailData;

	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */

		loginCredentials = getKULSCredentialsList();
		productRetailData=getProductMasterRetail();
		SubProductRetailData=getSubProductMasterRetail();
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
	//product retail
	private List<Product_RetailMasterTestData> getProductMasterRetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ProductRetailPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ProductRetailPath));
			Product_RetailMasterTestData[] productRetailMaster = gson.fromJson(bufferReader, Product_RetailMasterTestData[].class);
			return Arrays.asList(productRetailMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ProductRetailPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	// sub product retail
	private List<SubProductMaster_RetailTestData> getSubProductMasterRetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(SubProductRetailPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(SubProductRetailPath));
			SubProductMaster_RetailTestData[] subProductRetailMaster = gson.fromJson(bufferReader, SubProductMaster_RetailTestData[].class);
			return Arrays.asList(subProductRetailMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + SubProductRetailPath);
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
	//product retail
	public final Product_RetailMasterTestData getProductMasterRetailByName(String Username) {
		return productRetailData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	// sub product retail
	public final SubProductMaster_RetailTestData getSubProductMasterRetailByName(String Username) {
		return SubProductRetailData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

}