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
import testDataType.Customer_Empolyment_Testdata;
import testDataType.Customer_address_Testdata;
import testDataType.KULS_Login_TestDataType;
import testDataType.LivExp_Testdata;
import testDataType.PersonalaDetailsDataEntryTestdata;
import testDataType.ProjectMaster_UnitDetailsTestdata;
import testDataType.PropertyDetails_TestData;
import testDataType.PropetyDetails_TestDataType;
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
	
	private final String LivExppath = configFileReader.getJsonPath() + "Living_ExpJson.json";
	private List<LivExp_Testdata> LivExpMst;
	
	private final String PerDetailpath = configFileReader.getJsonPath() + "PersonalDetailsAppDataEntry.json";
	private List<PersonalaDetailsDataEntryTestdata> PerDetailEntry;
	
	private final String Propertypath = configFileReader.getJsonPath() + "Property_DetailsJSON.json";
	private List<PropertyDetails_TestData> PropertyDetail;
	
	//Anandh
	private final String uls_PropertyDetailsJsonfilepath = configFileReader.getJsonPath() + "PropertyDetailsJSON.json";
	private List<PropetyDetails_TestDataType> uls_PropertyDetailsTestData;
	
	private final String Employepath = configFileReader.getJsonPath() + "Customer_EmployementJson.json";
	private List<Customer_Empolyment_Testdata> EmployeDetail;
	
	private final String CustAddresspath = configFileReader.getJsonPath() + "Customer_addressJson.json";
	private List<Customer_address_Testdata> CustAddressinfo;
	
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
		LivExpMst=getLivExpMst();
		PerDetailEntry=getPerDetailEntry();
		PropertyDetail=getPropertyDetail();
		EmployeDetail=getEmployeDetail();
		CustAddressinfo=getCustAddressinfo();
		uls_PropertyDetailsTestData=getPropertyDetailsTestdata();
	}
	
	//Anandh
	private List<PropetyDetails_TestDataType> getPropertyDetailsTestdata()
	{
		Gson gson = new Gson();
	JsonReader reader = new JsonReader(new StringReader(uls_PropertyDetailsJsonfilepath));
	reader.setLenient(true);
	BufferedReader bufferReader = null;
	try {
		bufferReader = new BufferedReader(new FileReader(uls_PropertyDetailsJsonfilepath));
		PropetyDetails_TestDataType[] getPropertyDetailsTestData = gson.fromJson(bufferReader, PropetyDetails_TestDataType[].class);
		return Arrays.asList(getPropertyDetailsTestData);
	} catch (FileNotFoundException e) {
		throw new RuntimeException("Json file not found at path : " + uls_PropertyDetailsJsonfilepath);
	} finally {
		try {
			if (bufferReader != null)
				bufferReader.close();
		} catch (IOException ignore) {
		}
	}
		
	}
	
	private List<Customer_address_Testdata> getCustAddressinfo() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CustAddresspath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CustAddresspath));
			Customer_address_Testdata[] address = gson.fromJson(bufferReader, Customer_address_Testdata[].class);
			return Arrays.asList(address);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CustAddresspath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	private List<Customer_Empolyment_Testdata> getEmployeDetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(Employepath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(Employepath));
			Customer_Empolyment_Testdata[] Employee = gson.fromJson(bufferReader, Customer_Empolyment_Testdata[].class);
			return Arrays.asList(Employee);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + Employepath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	private List<PropertyDetails_TestData> getPropertyDetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(Propertypath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(Propertypath));
			PropertyDetails_TestData[] Property = gson.fromJson(bufferReader, PropertyDetails_TestData[].class);
			return Arrays.asList(Property);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + Propertypath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<PersonalaDetailsDataEntryTestdata> getPerDetailEntry() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(PerDetailpath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(PerDetailpath));
			PersonalaDetailsDataEntryTestdata[] PerDetailpath = gson.fromJson(bufferReader, PersonalaDetailsDataEntryTestdata[].class);
			return Arrays.asList(PerDetailpath);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + PerDetailpath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	

	private List<LivExp_Testdata> getLivExpMst() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(LivExppath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(LivExppath));
			LivExp_Testdata[] LivExpMst = gson.fromJson(bufferReader, LivExp_Testdata[].class);
			return Arrays.asList(LivExpMst);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + LivExppath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
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
	public final LivExp_Testdata getLivExpListByName(String User) {
		return LivExpMst.stream().filter(x -> x.USername.equalsIgnoreCase(User)).findAny().get();
	}
	public final PersonalaDetailsDataEntryTestdata getPerDetailDataByName(String User) {
		return PerDetailEntry.stream().filter(x -> x.Users.equalsIgnoreCase(User)).findAny().get();
	}
	
	public final PropertyDetails_TestData getPropertyDetailByName(String User) {
		return PropertyDetail.stream().filter(x -> x.user.equalsIgnoreCase(User)).findAny().get();
	}
	
	public final Customer_Empolyment_Testdata getCustEmployByName(String User) {
		return EmployeDetail.stream().filter(x -> x.User.equalsIgnoreCase(User)).findAny().get();
	}
	
	public final Customer_address_Testdata getCustaddressByName(String User) {
		return CustAddressinfo.stream().filter(x -> x.user.equalsIgnoreCase(User)).findAny().get();
	}
	//PropetyDetails_TestDataType> uls_PropertyDetailsTestData
	public final PropetyDetails_TestDataType getPropertyDetailsTestDataByName(String Username) {
		return uls_PropertyDetailsTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
}