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

import testDataType.ApplicationDetails_NEWAPPTestData;
import testDataType.AssetAutoMaster_TestData;
import testDataType.KULS_Login_TestDataType;
import testDataType.Product_RetailMasterTestData;
import testDataType.SubProductMaster_RetailTestData;
import testDataType.SubProductRetailParameterNegativeTestDataType;
import testDataType.SubProductRetailParameterTestDataType;
import testDataType.SubproductMasterRetail_Testdata;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	// ULS Login
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;
	//product retail
	private final String ProductRetailPath = configFileReader.getJsonPath() + "Product_MasterRetail.json";
	private List<Product_RetailMasterTestData> productRetailData;
	//sub product retail
	private final String SubProductRetailPath = configFileReader.getJsonPath() + "SubProductMasterRetail.json";
	private List<SubProductMaster_RetailTestData> SubProductRetailData;
	private final String SubProductRetailPath1 = configFileReader.getJsonPath() + "Subproduct_MasterRetailJson.json";
	private List<SubproductMasterRetail_Testdata> SubproductRetail;
	private final String SubProductparameterPath = configFileReader.getJsonPath()
			+ "SubProductMasterRetailParameterJSON.json";
	private List<SubProductRetailParameterTestDataType> SubproductRetailparameter;
	private final String ParameternegativeDataPath = configFileReader.getJsonPath()
			+ "SubProductRetailMasterParameterNegativeJSON.json";
	private List<SubProductRetailParameterNegativeTestDataType> SubParameternegative;

	// assetauto master
	private final String assetAutoMasterPath = configFileReader.getJsonPath() + "AssetAutoMaster.json";
	private List<AssetAutoMaster_TestData> assetAutoMasterData;
	//ApplicationDetailsNEWAPP
	private final String applicationNEWAPPPath = configFileReader.getJsonPath() + "ApplicationDetails_NEWAPP.json";
	private List<ApplicationDetails_NEWAPPTestData> applicationDetailsNEWAPData;
	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */

		loginCredentials = getKULSCredentialsList();
		productRetailData = getProductMasterRetail();
		SubProductRetailData = getSubProductMasterRetail();
		SubproductRetail = getSubproductRetail();
		SubproductRetailparameter = getSubproductRetailparameter();
		SubParameternegative = getSubParameterNegativeList();
		assetAutoMasterData =getAssetAutoMaster();
		applicationDetailsNEWAPData=getApplicationDetailsNEWAPP();
	}
	//ApplicationDetails
		private List<ApplicationDetails_NEWAPPTestData> getApplicationDetailsNEWAPP() {
			Gson gson = new Gson();
			JsonReader reader = new JsonReader(new StringReader(applicationNEWAPPPath));
			reader.setLenient(true);
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(applicationNEWAPPPath));
				ApplicationDetails_NEWAPPTestData[] applicationDetailsNEWAPP = gson.fromJson(bufferReader,
						ApplicationDetails_NEWAPPTestData[].class);
				return Arrays.asList(applicationDetailsNEWAPP);
			} catch (FileNotFoundException e) {
				throw new RuntimeException("Json file not found at path : " + applicationNEWAPPPath);
			} finally {
				try {
					if (bufferReader != null)
						bufferReader.close();
				} catch (IOException ignore) {
				}
			}
		}
	// asset auto master
	private List<AssetAutoMaster_TestData> getAssetAutoMaster() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(assetAutoMasterPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(assetAutoMasterPath));
			AssetAutoMaster_TestData[] assetAutoMaster = gson.fromJson(bufferReader,
					AssetAutoMaster_TestData[].class);
			return Arrays.asList(assetAutoMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + assetAutoMasterPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	
	// sub product retail
	private List<SubProductRetailParameterTestDataType> getSubproductRetailparameter() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(SubProductparameterPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(SubProductparameterPath));
			SubProductRetailParameterTestDataType[] credentials = gson.fromJson(bufferReader,
					SubProductRetailParameterTestDataType[].class);
			return Arrays.asList(credentials);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + SubProductparameterPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<SubproductMasterRetail_Testdata> getSubproductRetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(SubProductRetailPath1));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(SubProductRetailPath1));
			SubproductMasterRetail_Testdata[] credentials = gson.fromJson(bufferReader,
					SubproductMasterRetail_Testdata[].class);
			return Arrays.asList(credentials);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + SubProductRetailPath1);
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

	// product retail
	private List<Product_RetailMasterTestData> getProductMasterRetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ProductRetailPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ProductRetailPath));
			Product_RetailMasterTestData[] productRetailMaster = gson.fromJson(bufferReader,
					Product_RetailMasterTestData[].class);
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
			SubProductMaster_RetailTestData[] subProductRetailMaster = gson.fromJson(bufferReader,
					SubProductMaster_RetailTestData[].class);
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

	private List<SubProductRetailParameterNegativeTestDataType> getSubParameterNegativeList() {
		Gson gson2 = new Gson();
		JsonReader reader2 = new JsonReader(new StringReader(ParameternegativeDataPath));
		reader2.setLenient(true);
		BufferedReader bufferReader1 = null;
		try {
			bufferReader1 = new BufferedReader(new FileReader(ParameternegativeDataPath));
			SubProductRetailParameterNegativeTestDataType[] SubParameternegative = gson2.fromJson(bufferReader1,
					SubProductRetailParameterNegativeTestDataType[].class);
			return Arrays.asList(SubParameternegative);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ParameternegativeDataPath);
		} finally {
			try {
				if (bufferReader1 != null)
					bufferReader1.close();
			} catch (IOException ignore) {
			}
		}
	}

	public final KULS_Login_TestDataType getKULSLoginCredentialsByName(String Username) {
		return loginCredentials.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// product retail
	public final Product_RetailMasterTestData getProductMasterRetailByName(String Username) {
		return productRetailData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// sub product retail
	public final SubProductMaster_RetailTestData getSubProductMasterRetailByName(String Username) {
		return SubProductRetailData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// Subproduct Master Retail - Arshath
	public final SubproductMasterRetail_Testdata getSubproductRetailByName(String User) {
		return SubproductRetail.stream().filter(x -> x.Username.equalsIgnoreCase(User)).findAny().get();
	}

	public final SubProductRetailParameterTestDataType getSubParameterListByName(String User) {
		return SubproductRetailparameter.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny().get();
	}
	public final SubProductRetailParameterNegativeTestDataType getSubParameterNegativeListByName(String Username) {
    return SubParameternegative.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	// asset auto master
	public final AssetAutoMaster_TestData getAssetAutoMasterListByName(String Username) {
	    return assetAutoMasterData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
		}
	// applicationDetailsNEWAPP
		public final ApplicationDetails_NEWAPPTestData getApplicationDetailsNEWAPPListByName(String Username) {
		    return applicationDetailsNEWAPData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
			}
	
}