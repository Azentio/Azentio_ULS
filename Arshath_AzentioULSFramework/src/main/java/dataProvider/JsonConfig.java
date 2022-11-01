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

import testDataType.AllocationMasterTestData;
import testDataType.Beneficiary_Details_Testdata;
import testDataType.Charge_Master_Testdata;
import testDataType.CustomerEntityReferanceListTestdata;
import testDataType.Customer_Empolyment_Testdata;
import testDataType.Customer_address_Testdata;
import testDataType.KULS_AllocationMasterTestdata;
import testDataType.KULS_CollateralSubType;
import testDataType.KULS_CustomerEntityLayout_CustomerDebt_Testdata;
import testDataType.KULS_DueMaster_Creation;
import testDataType.KULS_Login_TestDataType;
import testDataType.LivExp_Testdata;
import testDataType.MDM_BounceMasterTestdata;
import testDataType.PersonalaDetailsDataEntryTestdata;
import testDataType.ProjectMaster_UnitDetailsTestdata;
import testDataType.PropertyDetails_TestData;
import testDataType.PropetyDetails_TestDataType;
import testDataType.SubProductRetailParameterTestDataType;
import testDataType.SubproductMasterRetail_Testdata;
import testDataType.TransactionScreenTestDataType;
import testDataType.ULS_AllocationMasterTestData;
import testDataType.ULS_CustomerDeptDetailsTestData;
import testDataType.ULS_LoModuleWaiverTestData;
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

	private final String uls_PropertyDetailsJsonfilepath = configFileReader.getJsonPath() + "PropertyDetailsJSON.json";
	private List<PropetyDetails_TestDataType> uls_PropertyDetailsTestData;
	
	private final String Employepath = configFileReader.getJsonPath() + "Customer_EmployementJson.json";
	private List<Customer_Empolyment_Testdata> EmployeDetail;
	
	private final String CustAddresspath = configFileReader.getJsonPath() + "Customer_addressJson.json";
	private List<Customer_address_Testdata> CustAddressinfo;
	
	private final String TransactionScreenDataPath = configFileReader.getJsonPath() + "TransactionScreenJSON.json";
	private List<TransactionScreenTestDataType> TransactionScreen;
	
	private final String BenefiniaryPath = configFileReader.getJsonPath() + "Beneficiary_DetailsJson.json";
	private List<Beneficiary_Details_Testdata> Benefiniary;
	
	
	private final String ulsCustomerDeptDetailsJSONFilePath = configFileReader.getJsonPath() + "ULS_CustomerDeptDetailsJSON.json";
	private List<ULS_CustomerDeptDetailsTestData> ulsCustomerDeptDetailsTestData;
	//  CustomerDebt--Arul
	private final String CustomerDebtDataPath = configFileReader.getJsonPath() + "CustomerEntityLayout_CustomerDebtJson.json";
	private List<KULS_CustomerEntityLayout_CustomerDebt_Testdata> CustomerDebt;	
	// Due Master--Arul
	private final String DueMasterDataPath = configFileReader.getJsonPath() + "DueMasterJson.json";
	private List<KULS_DueMaster_Creation> DueMaster;
	
	private final String CustomerReferancePath = configFileReader.getJsonPath() + "CustomerEntity_ReferanceListJson.json";
	private List<CustomerEntityReferanceListTestdata> CustomerRef;	
	
	private final String BounceMstPath = configFileReader.getJsonPath() + "MDM_BounceMaster.json";
	private List<MDM_BounceMasterTestdata> BounceMst;	
	
	//allocation Master-->Kamalapriya
	private final String AllocationMasterDataPath = configFileReader.getJsonPath() + "AllocationMasterJson.json";
	private List<AllocationMasterTestData> AllocationMaster;
	
	private final String uls_LoModuleWaiverJsonFile = configFileReader.getJsonPath() + "ULS_LOModuleWaiverJSON.json";
	private List<ULS_LoModuleWaiverTestData> loModuleWaiverTestData;
	
	private final String allocationMasterTestDataJSONPath = configFileReader.getJsonPath() + "ULS_AllocationMasterJSON.json";
	private List<ULS_AllocationMasterTestData> allocationMasterTestData;
	
	private final String AllocationMasterpath = configFileReader.getJsonPath() + "KULS_AllocationMasterjson.json";
	private List<KULS_AllocationMasterTestdata> AllocationMaster1List;
	// Collateral Subtype Master--Arul
	private final String CollateralSubtypeDataPath = configFileReader.getJsonPath() + "CollateralSubTypeJson.json";
	private List<KULS_CollateralSubType> CollateralSubtypeMaster;
	
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
		TransactionScreen = getTransactionScreenList();
		Benefiniary = getBenefiniary();
		ulsCustomerDeptDetailsTestData=getCustomerDeptDetailsTestData();
		//CustomerDebt Maseter-Arul
		CustomerDebt = getCustomerDebtList();
		CustomerRef = getCustomerRef();
		BounceMst=getBounceMst();
		//allocation  Master-->Kamalapriya
		AllocationMaster = getAllocationMasterList();
		loModuleWaiverTestData = getLoModuleWaiverTestData();
		allocationMasterTestData=getAllocationMasterTestData();
		AllocationMaster1List=getAllocationMaster1List();
		//Collateral SubType Master-Arul
		CollateralSubtypeMaster = getCollateralSubTypeList();
		//Due Master-Arul
		DueMaster = getDueMasterList();
	}
	
	//Due Master--Arul
	private List<KULS_DueMaster_Creation> getDueMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(DueMasterDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(DueMasterDataPath));
			KULS_DueMaster_Creation[] due = gson.fromJson(bufferReader, KULS_DueMaster_Creation[].class);
			return Arrays.asList(due);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + DueMasterDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	private List<KULS_AllocationMasterTestdata> getAllocationMaster1List() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(AllocationMasterpath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(AllocationMasterpath));
			KULS_AllocationMasterTestdata[] reportMasterData = gson.fromJson(bufferReader,
					KULS_AllocationMasterTestdata[].class);
			return Arrays.asList(reportMasterData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + AllocationMasterpath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	//Collateral Subtype master
	private List<KULS_CollateralSubType> getCollateralSubTypeList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CollateralSubtypeDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CollateralSubtypeDataPath));
			KULS_CollateralSubType[] collateral = gson.fromJson(bufferReader, KULS_CollateralSubType[].class);
			return Arrays.asList(collateral);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CollateralSubtypeDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	private List<ULS_AllocationMasterTestData> getAllocationMasterTestData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(allocationMasterTestDataJSONPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(allocationMasterTestDataJSONPath));
			ULS_AllocationMasterTestData[] ulsAllocationMasterTestData = gson.fromJson(bufferReader,
					ULS_AllocationMasterTestData[].class);
			return Arrays.asList(ulsAllocationMasterTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + allocationMasterTestDataJSONPath);
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
			ULS_LoModuleWaiverTestData[] loModuleWaiverTestData = gson.fromJson(bufferReader,
					ULS_LoModuleWaiverTestData[].class);
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
	
	//Allocation Master-->Kamalapriya
	
	private List<AllocationMasterTestData> getAllocationMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(AllocationMasterDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(AllocationMasterDataPath));
			AllocationMasterTestData[] Allocation = gson.fromJson(bufferReader, AllocationMasterTestData[].class);
			return Arrays.asList(Allocation);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + AllocationMasterDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	private List<MDM_BounceMasterTestdata> getBounceMst() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(BounceMstPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(BounceMstPath));
			MDM_BounceMasterTestdata[] bounce = gson.fromJson(bufferReader, MDM_BounceMasterTestdata[].class);
			return Arrays.asList(bounce);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + BounceMstPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	private List<CustomerEntityReferanceListTestdata> getCustomerRef() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CustomerReferancePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CustomerReferancePath));
			CustomerEntityReferanceListTestdata[] Referance = gson.fromJson(bufferReader, CustomerEntityReferanceListTestdata[].class);
			return Arrays.asList(Referance);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CustomerReferancePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	//CustomerDebt--Arul
	private List<KULS_CustomerEntityLayout_CustomerDebt_Testdata> getCustomerDebtList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CustomerDebtDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CustomerDebtDataPath));
			KULS_CustomerEntityLayout_CustomerDebt_Testdata[] Identification = gson.fromJson(bufferReader, KULS_CustomerEntityLayout_CustomerDebt_Testdata[].class);
			return Arrays.asList(Identification);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CustomerDebtDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	private List<ULS_CustomerDeptDetailsTestData> getCustomerDeptDetailsTestData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ulsCustomerDeptDetailsJSONFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ulsCustomerDeptDetailsJSONFilePath));
			ULS_CustomerDeptDetailsTestData[] ulsCustomerDeptDetailsTestData = gson.fromJson(bufferReader, ULS_CustomerDeptDetailsTestData[].class);
			return Arrays.asList(ulsCustomerDeptDetailsTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ulsCustomerDeptDetailsJSONFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	private List<Beneficiary_Details_Testdata> getBenefiniary()
	{
		Gson gson = new Gson();
	JsonReader reader = new JsonReader(new StringReader(BenefiniaryPath));
	reader.setLenient(true);
	BufferedReader bufferReader = null;
	try {
		bufferReader = new BufferedReader(new FileReader(BenefiniaryPath));
		Beneficiary_Details_Testdata[] Benefiniary = gson.fromJson(bufferReader, Beneficiary_Details_Testdata[].class);
		return Arrays.asList(Benefiniary);
	} catch (FileNotFoundException e) {
		throw new RuntimeException("Json file not found at path : " + BenefiniaryPath);
	} finally {
		try {
			if (bufferReader != null)
				bufferReader.close();
		} catch (IOException ignore) {
		}
	}
		
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
	//Transaction Screen
	
	private List<TransactionScreenTestDataType> getTransactionScreenList() {
		Gson gson2 = new Gson();
		JsonReader reader2 = new JsonReader(new StringReader(TransactionScreenDataPath));
		reader2.setLenient(true);
		BufferedReader bufferReader1 = null;
		try {
			bufferReader1 = new BufferedReader(new FileReader(TransactionScreenDataPath));
			TransactionScreenTestDataType[] TransactionScreen = gson2.fromJson(bufferReader1, TransactionScreenTestDataType[].class);
			return Arrays.asList(TransactionScreen);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + TransactionScreenDataPath);
		} finally {
			try {
				if (bufferReader1 != null)
					bufferReader1.close();
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
	//TransactionScreen
	
	public final TransactionScreenTestDataType getTransactionScreenListByName(String Username) {
		return TransactionScreen.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final Beneficiary_Details_Testdata getBenificiaryListByName(String Username) {
		return Benefiniary.stream().filter(x -> x.Users.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final ULS_CustomerDeptDetailsTestData getCustomerDeptDetailsTestDataByName(String User) {
		return ulsCustomerDeptDetailsTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny().get();
	}
	//CustomerDebt--Arul

	public final KULS_CustomerEntityLayout_CustomerDebt_Testdata getCustomerDebtByName(String Username) {
		return CustomerDebt.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final CustomerEntityReferanceListTestdata getCustomerRefByName(String Username) {
		return CustomerRef.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	//Allocation Master-->Kamalapriya
	public final AllocationMasterTestData getAllocationMasterByName(String Username) {
		return AllocationMaster.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final MDM_BounceMasterTestdata getBounceMstByName(String Username) {
		return BounceMst.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	// ULS_LoModuleWaiverTestData> loModuleWaiverTestData
	public final ULS_LoModuleWaiverTestData getLoModuleWaiverTestDataByName(String Username) {
		return loModuleWaiverTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	public final ULS_AllocationMasterTestData getAllocationTestDataByName(String Username) {
		return allocationMasterTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	public final KULS_AllocationMasterTestdata getAllocationMaster1ListByName(String Username) {
		return AllocationMaster1List.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//Collateral Subtype Master--Arul

	public final KULS_CollateralSubType getCollateralSubTypeByName(String Username) {
		return CollateralSubtypeMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//Due Master--Arul

	public final KULS_DueMaster_Creation getDueMasterByName(String Username) {
		return DueMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
}