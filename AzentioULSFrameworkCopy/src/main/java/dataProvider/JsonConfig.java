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
import testDataType.ProductMaster_RetailTestDataType;
import testDataType.Product_RetailMasterTestData;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	
	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */
		
		loginCredentials = getKULSCredentialsList();
		ProductMasterRetailList = getProductMasterRetailList();
		productRetailData=getProductMasterRetail();
		
	}
	
// 	ULS Login
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;
	
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
	
	public final KULS_Login_TestDataType getKULSLoginCredentialsByName(String Username) {
		return loginCredentials.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	ProductMaster_Retail
	private final String ProductMasterRetailPath = configFileReader.getJsonPath() + "ProductMaster_RetailJSON.json";
	private List<ProductMaster_RetailTestDataType> ProductMasterRetailList;

	private List<ProductMaster_RetailTestDataType> getProductMasterRetailList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ProductMasterRetailPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ProductMasterRetailPath));
			ProductMaster_RetailTestDataType[] ProductMasterRetail = gson.fromJson(bufferReader, ProductMaster_RetailTestDataType[].class);
			return Arrays.asList(ProductMasterRetail);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ProductMasterRetailPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	
	public final ProductMaster_RetailTestDataType getProductMasterRetailByName(String Username) {
		return ProductMasterRetailList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
//	ProductRetail_Master
	private final String ProductRetailPath = configFileReader.getJsonPath() + "Product_MasterRetail.json";
	private List<Product_RetailMasterTestData> productRetailData;
	
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
	//product retail
	public final Product_RetailMasterTestData getProductMasterRetailByName1(String Username) {
		return productRetailData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
}