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

import testDataType.Charge_Master_Testdata;
import testDataType.KULS_Login_TestDataType;
import testDataType.ProjectMaster_UnitDetailsTestdata;
import testDataType.SubProductRetailParameterTestDataType;
import testDataType.SubproductMasterRetail_Testdata;
import testDataType.WarehouseTestdata;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	// ULS Login
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;

	private final String SubProductRetailPath = configFileReader.getJsonPath() + "Subproduct_MasterRetailJson.json";
	private List<SubproductMasterRetail_Testdata> SubproductRetail;

	private final String SubProductparameterPath = configFileReader.getJsonPath() + "SubProductMasterRetailParameterJSON.json";
	private List<SubProductRetailParameterTestDataType> SubproductRetailparameter;

	private final String chargemasterrPath = configFileReader.getJsonPath() + "Charge_MasterJSON.json";
	private List<Charge_Master_Testdata> chargemaster;
	
	private final String unitdetailspath = configFileReader.getJsonPath() + "ProjectMaster_UnitdetailsJSON.json";
	private List<ProjectMaster_UnitDetailsTestdata> unitdetail;
	
	private final String Warehousepath = configFileReader.getJsonPath() + "WareHouseJson.json";
	private List<WarehouseTestdata> warehouse;
	
	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */

		loginCredentials = getKULSCredentialsList();
		SubproductRetail = getSubproductRetail();
		SubproductRetailparameter = getSubproductRetailparameter();
		chargemaster = getchargemaster();
		unitdetail = getunitdetail();
		warehouse= getwarehouse();
	}

	private List<WarehouseTestdata> getwarehouse() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(Warehousepath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(Warehousepath));
			WarehouseTestdata[] warehouse = gson.fromJson(bufferReader, WarehouseTestdata[].class);
			return Arrays.asList(warehouse);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + Warehousepath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	private List<ProjectMaster_UnitDetailsTestdata> getunitdetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(unitdetailspath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(unitdetailspath));
			ProjectMaster_UnitDetailsTestdata[] unitdetail = gson.fromJson(bufferReader, ProjectMaster_UnitDetailsTestdata[].class);
			return Arrays.asList(unitdetail);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + unitdetailspath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	private List<Charge_Master_Testdata> getchargemaster() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(chargemasterrPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(chargemasterrPath));
			Charge_Master_Testdata[] charge = gson.fromJson(bufferReader, Charge_Master_Testdata[].class);
			return Arrays.asList(charge);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + chargemasterrPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<SubProductRetailParameterTestDataType> getSubproductRetailparameter() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(SubProductparameterPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(SubProductparameterPath));
			SubProductRetailParameterTestDataType[] parameter = gson.fromJson(bufferReader, SubProductRetailParameterTestDataType[].class);
			return Arrays.asList(parameter);
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

	private List<SubproductMasterRetail_Testdata> getSubproductRetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(SubProductRetailPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(SubProductRetailPath));
			SubproductMasterRetail_Testdata[] retail = gson.fromJson(bufferReader, SubproductMasterRetail_Testdata[].class);
			return Arrays.asList(retail);
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
	public final SubproductMasterRetail_Testdata getSubproductRetailByName(String User) {
		return SubproductRetail.stream().filter(x -> x.Username.equalsIgnoreCase(User)).findAny().get();
	}
	public final SubProductRetailParameterTestDataType getSubParameterListByName(String User) {
		return SubproductRetailparameter.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny().get();
	}
	public final Charge_Master_Testdata getchargemasterListByName(String User) {
		return chargemaster.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny().get();
	}
	public final ProjectMaster_UnitDetailsTestdata getunitdetailListByName(String User) {
		return unitdetail.stream().filter(x -> x.User.equalsIgnoreCase(User)).findAny().get();
	}	
	public final WarehouseTestdata getwarehouseListByName(String User) {
		return warehouse.stream().filter(x -> x.user.equalsIgnoreCase(User)).findAny().get();
	}
}