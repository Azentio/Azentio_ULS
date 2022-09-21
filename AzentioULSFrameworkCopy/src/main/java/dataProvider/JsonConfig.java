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

import testDataType.ApplicationDetailsOfferingTestDataType;
import testDataType.AssetCollateralTypeTestDataType;
import testDataType.CovenantMasterTestDataType;
import testDataType.CustomerAddressDetailsTestDataType;
import testDataType.CustomerDocumentDetailsTestDataType;
import testDataType.CustomerEmploymentTestDataType;
import testDataType.CustomerPersonalDetailDisbursementCheckerTestDataType;
import testDataType.CustomerPersonalDetailOfferingTestDataType;
import testDataType.KULS_Login_TestDataType;
import testDataType.LivingExpenseLocationTestDataType;
import testDataType.ProductMaster_RetailTestDataType;
import testDataType.Product_RetailMasterTestData;
import testDataType.ProjectMasterTestDataType;
import testDataType.PropertyDetailsTestDataType;
import testDataType.ReportMasterTestDataType;
import testDataType.ULS_AssetCollateralTypeTestData;

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
		ProjectMasterList = getProjectMasterList();
		AssetCollateralTypeList = getAssetCollateralTypeList();
		CovenantMasterList = getCovenantMasterList();
		ReportMasterList = getReportMasterList();
		LivingExpenseLocationList = getLivingExpenseLocationList();
		CustomerPersonalDetailOfferingList = getCustomerPersonalDetailOfferingList();
		ApplicationDetailsOfferingList = getApplicationDetailsOfferingList();
		CustomerPersonalDetailDisbursementCheckerList = getCustomerPersonalDetailDisbursementCheckerList();
		CustomerAddressDetailsList = getCustomerAddressDetailsList();
		PropertyDetailsList = getPropertyDetailsList();
		CustomerEmploymentList = getCustomerEmploymentList();
		CustomerDocumentDetailsList = getCustomerDocumentDetailsList();
		
		assetCollateratTypeTestdata=getAssetCollateralTypeTestData();
		
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
	public final Product_RetailMasterTestData getProductMasterRetailByName1(String Username) {
		return productRetailData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	ProjectMaster
	private final String ProjectMasterPath = configFileReader.getJsonPath() + "ProjectMasterJSON.json";
	private List<ProjectMasterTestDataType> ProjectMasterList;

	private List<ProjectMasterTestDataType> getProjectMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ProjectMasterPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ProjectMasterPath));
			ProjectMasterTestDataType[] ProjectMaster = gson.fromJson(bufferReader, ProjectMasterTestDataType[].class);
			return Arrays.asList(ProjectMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ProjectMasterPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final ProjectMasterTestDataType getProjectMasterByName(String Username) {
		return ProjectMasterList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	AssetCollateralType
	private final String AssetCollateralTypePath = configFileReader.getJsonPath() + "AssetCollateralTypeJSON.json";
	private List<AssetCollateralTypeTestDataType> AssetCollateralTypeList;

	private List<AssetCollateralTypeTestDataType> getAssetCollateralTypeList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(AssetCollateralTypePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(AssetCollateralTypePath));
			AssetCollateralTypeTestDataType[] AssetCollateralType = gson.fromJson(bufferReader, AssetCollateralTypeTestDataType[].class);
			return Arrays.asList(AssetCollateralType);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + AssetCollateralTypePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final AssetCollateralTypeTestDataType getAssetCollateralTypeByName(String Username) {
		return AssetCollateralTypeList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	AssetCollateralType_ANANDH
	private final String ULS_AssetCollateralJSONFilePath = configFileReader.getJsonPath() + "ULS_AssetCollateralTypeJSON.json";
	private List<ULS_AssetCollateralTypeTestData> assetCollateratTypeTestdata;

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
	// ULS_AssetCollateralTypeTestData> assetCollateratTypeTestdata
	public final ULS_AssetCollateralTypeTestData getAssetCollateralTypeTestDataByName(String Username) {
		return assetCollateratTypeTestdata.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	CovenantMaster
	private final String CovenantMasterPath = configFileReader.getJsonPath() + "CovenantMasterJSON.json";
	private List<CovenantMasterTestDataType> CovenantMasterList;

	private List<CovenantMasterTestDataType> getCovenantMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CovenantMasterPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CovenantMasterPath));
			CovenantMasterTestDataType[] CovenantMaster = gson.fromJson(bufferReader, CovenantMasterTestDataType[].class);
			return Arrays.asList(CovenantMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CovenantMasterPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final CovenantMasterTestDataType getCovenantMasterByName(String Username) {
		return CovenantMasterList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	ReportMaster
	private final String ReportMasterPath = configFileReader.getJsonPath() + "ReportMasterJSON.json";
	private List<ReportMasterTestDataType> ReportMasterList;
	
	private List<ReportMasterTestDataType> getReportMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ReportMasterPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ReportMasterPath));
			ReportMasterTestDataType[] ReportMaster = gson.fromJson(bufferReader, ReportMasterTestDataType[].class);
			return Arrays.asList(ReportMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ReportMasterPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final ReportMasterTestDataType getReportMasterByName(String Username) {
		return ReportMasterList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	LivingExpense
	private final String LivingExpenseLocationPath = configFileReader.getJsonPath() + "LivingExpenseLocationJSON.json";
	private List<LivingExpenseLocationTestDataType> LivingExpenseLocationList;
	
	private List<LivingExpenseLocationTestDataType> getLivingExpenseLocationList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(LivingExpenseLocationPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(LivingExpenseLocationPath));
			LivingExpenseLocationTestDataType[] LivingExpenseLocation = gson.fromJson(bufferReader, LivingExpenseLocationTestDataType[].class);
			return Arrays.asList(LivingExpenseLocation);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + LivingExpenseLocationPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final LivingExpenseLocationTestDataType getLivingExpenseLocationByName(String Username) {
		return LivingExpenseLocationList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	CustomerPersonalDetailOffering
	private final String CustomerPersonalDetailOfferingPath = configFileReader.getJsonPath() + "CustomerPersonalDetailOfferingJSON.json";
	private List<CustomerPersonalDetailOfferingTestDataType> CustomerPersonalDetailOfferingList;
	
	private List<CustomerPersonalDetailOfferingTestDataType> getCustomerPersonalDetailOfferingList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CustomerPersonalDetailOfferingPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CustomerPersonalDetailOfferingPath));
			CustomerPersonalDetailOfferingTestDataType[] CustomerPersonalDetailOffering = gson.fromJson(bufferReader, CustomerPersonalDetailOfferingTestDataType[].class);
			return Arrays.asList(CustomerPersonalDetailOffering);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CustomerPersonalDetailOfferingPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final CustomerPersonalDetailOfferingTestDataType getCustomerPersonalDetailOfferingByName(String Username) {
		return CustomerPersonalDetailOfferingList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	ApplicationDetailsOffering
	private final String ApplicationDetailsOfferingPath = configFileReader.getJsonPath() + "ApplicationDetailsOfferingJSON.json";
	private List<ApplicationDetailsOfferingTestDataType> ApplicationDetailsOfferingList;
	
	private List<ApplicationDetailsOfferingTestDataType> getApplicationDetailsOfferingList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ApplicationDetailsOfferingPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ApplicationDetailsOfferingPath));
			ApplicationDetailsOfferingTestDataType[] ApplicationDetailsOffering = gson.fromJson(bufferReader, ApplicationDetailsOfferingTestDataType[].class);
			return Arrays.asList(ApplicationDetailsOffering);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ApplicationDetailsOfferingPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final ApplicationDetailsOfferingTestDataType getApplicationDetailsOfferingByName(String Username) {
		return ApplicationDetailsOfferingList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	CustomerPersonalDetailDisbursementChecker
	private final String CustomerPersonalDetailDisbursementCheckerPath = configFileReader.getJsonPath() + "CustomerPersonalDetailDisbursementCheckerJSON.json";
	private List<CustomerPersonalDetailDisbursementCheckerTestDataType> CustomerPersonalDetailDisbursementCheckerList;
	
	private List<CustomerPersonalDetailDisbursementCheckerTestDataType> getCustomerPersonalDetailDisbursementCheckerList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CustomerPersonalDetailDisbursementCheckerPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CustomerPersonalDetailDisbursementCheckerPath));
			CustomerPersonalDetailDisbursementCheckerTestDataType[] CustomerPersonalDetailDisbursementChecker = gson.fromJson(bufferReader, CustomerPersonalDetailDisbursementCheckerTestDataType[].class);
			return Arrays.asList(CustomerPersonalDetailDisbursementChecker);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CustomerPersonalDetailDisbursementCheckerPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final CustomerPersonalDetailDisbursementCheckerTestDataType getCustomerPersonalDetailDisbursementCheckerByName(String Username) {
		return CustomerPersonalDetailDisbursementCheckerList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	CustomerAddressDetails
	private final String CustomerAddressDetailsPath = configFileReader.getJsonPath() + "CustomerAddressDetailsJSON.json";
	private List<CustomerAddressDetailsTestDataType> CustomerAddressDetailsList;
	
	private List<CustomerAddressDetailsTestDataType> getCustomerAddressDetailsList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CustomerAddressDetailsPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CustomerAddressDetailsPath));
			CustomerAddressDetailsTestDataType[] CustomerAddressDetails = gson.fromJson(bufferReader, CustomerAddressDetailsTestDataType[].class);
			return Arrays.asList(CustomerAddressDetails);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CustomerAddressDetailsPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final CustomerAddressDetailsTestDataType getCustomerAddressDetailsByName(String Username) {
		return CustomerAddressDetailsList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	PropertyDetailsDetails
	private final String PropertyDetailsPath = configFileReader.getJsonPath() + "PropertyDetailsJSON.json";
	private List<PropertyDetailsTestDataType> PropertyDetailsList;
	
	private List<PropertyDetailsTestDataType> getPropertyDetailsList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(PropertyDetailsPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(PropertyDetailsPath));
			PropertyDetailsTestDataType[] PropertyDetails = gson.fromJson(bufferReader, PropertyDetailsTestDataType[].class);
			return Arrays.asList(PropertyDetails);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + PropertyDetailsPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final PropertyDetailsTestDataType getPropertyDetailsByName(String Username) {
		return PropertyDetailsList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
// 	CustomerEmploymentDetails
	private final String CustomerEmploymentPath = configFileReader.getJsonPath() + "CustomerEmploymentJSON.json";
	private List<CustomerEmploymentTestDataType> CustomerEmploymentList;
	
	private List<CustomerEmploymentTestDataType> getCustomerEmploymentList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CustomerEmploymentPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CustomerEmploymentPath));
			CustomerEmploymentTestDataType[] CustomerEmployment = gson.fromJson(bufferReader, CustomerEmploymentTestDataType[].class);
			return Arrays.asList(CustomerEmployment);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CustomerEmploymentPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final CustomerEmploymentTestDataType getCustomerEmploymentByName(String Username) {
		return CustomerEmploymentList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
	// 	CustomerDocumentDetails
	private final String CustomerDocumentDetailsPath = configFileReader.getJsonPath() + "CustomerDocumentDetailsJSON.json";
	private List<CustomerDocumentDetailsTestDataType> CustomerDocumentDetailsList;
	
	private List<CustomerDocumentDetailsTestDataType> getCustomerDocumentDetailsList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CustomerDocumentDetailsPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CustomerDocumentDetailsPath));
			CustomerDocumentDetailsTestDataType[] CustomerDocumentDetails = gson.fromJson(bufferReader, CustomerDocumentDetailsTestDataType[].class);
			return Arrays.asList(CustomerDocumentDetails);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CustomerDocumentDetailsPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final CustomerDocumentDetailsTestDataType getCustomerDocumentDetailsByName(String Username) {
		return CustomerDocumentDetailsList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
}