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

import testDataType.BeneficiaryDetailTestData;
import testDataType.BeneficiaryDetailsTestData;
import testDataType.Beneficiary_Details_Testdata;
import testDataType.CustomerPerssonalDetailsTestData;
import testDataType.KULS_ApplicationDetails_AppDataEntry_Testdata;
import testDataType.KULS_Login_TestDataType;
import testDataType.KULS_UnderWriterOffSetControlTestData;
import testDataType.KULS_WareHouseMasterTestData;
import testDataType.PersonalaDetailsDataEntryTestdata;
import testDataType.PropertyDetails_TestData;
import testDataType.PropetyDetails_TestDataType;
import testDataType.TransactionScreenTestDataType;
import testDataType.ULS_AssetCollateralTypeTestData;
import testDataType.ULS_BeneficiaryDetailsTestData;
import testDataType.ULS_CheckerTestData;
import testDataType.ULS_CustomerAddressDetailsTestDataType;
import testDataType.ULS_CustomerDeptDetailsTestData;
import testDataType.ULS_CustomerEmploymentDetailsTestdataType;
import testDataType.ULS_DrawDownBreakupDetailsTestData;
import testDataType.ULS_LivingExpenseTestData;
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

	private final String KULS_UnderWriterOffSetControl = configFileReader.getJsonPath()
			+ "KULS_UnderWriterOffSetControlJSON.json";
	private List<KULS_UnderWriterOffSetControlTestData> underWriterOffSetControlTestData;

	private final String KULS_WareHouseFilePath = configFileReader.getJsonPath() + "ULS_WareHouseJSON.json";
	private List<KULS_WareHouseMasterTestData> wareHouseTestData;

	private final String ULS_AssetCollateralJSONFilePath = configFileReader.getJsonPath()
			+ "ULS_AssetCollateralTypeJSON.json";
	private List<ULS_AssetCollateralTypeTestData> assetCollateratTypeTestdata;

	private final String uls_LoModuleWaiverJsonFile = configFileReader.getJsonPath() + "ULS_LOModuleWaiverJSON.json";
	private List<ULS_LoModuleWaiverTestData> loModuleWaiverTestData;
	private final String uls_CheckerUserTestDataPath = configFileReader.getJsonPath() + "ULS_CheckerDataJSON.json";
	private List<ULS_CheckerTestData> uls_CheckerUserTestData;

	private final String uls_ReportMasterTestDataPath = configFileReader.getJsonPath()
			+ "ULS_ReportMasterTestDataJSON.json";
	private List<ULS_ReportMasterTestData> uls_ReportMasterTestData;

	private final String uls_LivingExpenseTestDataPath = configFileReader.getJsonPath() + "ULS_LivingExpenseJSON.json";
	private List<ULS_LivingExpenseTestData> uls_LivingExpenseTestData;

	private final String uls_CustomerPersonalDetailsestDataPath = configFileReader.getJsonPath()
			+ "ULS_CustomerPersonalDetailsJSON.json";
	private List<CustomerPerssonalDetailsTestData> uls_CustomerPersonalDetailsTestData;

	private final String uls_PropertyDetailsJsonfilepath = configFileReader.getJsonPath() + "PropertyDetailsJSON.json";
	private List<PropetyDetails_TestDataType> uls_PropertyDetailsTestData;
	private final String ApplicationDetailsDataPath = configFileReader.getJsonPath()
			+ "ApplicationDetails_AppDataEntryJson.json";
	private List<KULS_ApplicationDetails_AppDataEntry_Testdata> ApplicationDetails;
	private final String Propertypath = configFileReader.getJsonPath() + "Property_DetailsJSON.json";
	private List<PropertyDetails_TestData> PropertyDetail;
	private final String PerDetailpath = configFileReader.getJsonPath() + "PersonalDetailsAppDataEntry.json";
	private List<PersonalaDetailsDataEntryTestdata> PerDetailEntry;

	private final String customerAddressDetails = configFileReader.getJsonPath() + "ULS_CustomerAddressDetailsSON.json";
	private List<ULS_CustomerAddressDetailsTestDataType> csutomerAddressDetails;

	private final String customerEmploymentDetailsFilePath = configFileReader.getJsonPath()
			+ "ULS_CustomerEmploymentDetailsJSON.json";
	private List<ULS_CustomerEmploymentDetailsTestdataType> customerEmploymentDetailsTestdata;

	private final String ulsBeneficiaryDetailsFilePath = configFileReader.getJsonPath()
			+ "ULS_BeneficiaryDetailsJSON.json";
	private List<ULS_BeneficiaryDetailsTestData> ulsBeneficiaryDetailsTestData;

	private final String ulsCustomerDeptDetailsJSONFilePath = configFileReader.getJsonPath()
			+ "ULS_CustomerDeptDetailsJSON.json";
	private List<ULS_CustomerDeptDetailsTestData> ulsCustomerDeptDetailsTestData;
	private final String BeneficaiaryDetailPath = configFileReader.getJsonPath() + "BeneficiaryDetailsJson.json";
	private List<BeneficiaryDetailTestData> BeneficiaryDetail;

	private final String TransactionScreenDataPath = configFileReader.getJsonPath() + "TransactionScreenJSON.json";
	private List<TransactionScreenTestDataType> TransactionScreen;
	private final String BenefiniaryPath = configFileReader.getJsonPath() + "Beneficiary_DetailsJson.json";
	private List<Beneficiary_Details_Testdata> Benefiniary;
	private final String BeneficiaryDetailsPath = configFileReader.getJsonPath() + "BeneficiaryDetails.json";
	private List<BeneficiaryDetailsTestData> DocumentDetailsTestData;
	
	private final String ulsDrawdownDetailsTestData = configFileReader.getJsonPath() + "ULS_DrawdownDetailsJson.json";
	private List<ULS_DrawDownBreakupDetailsTestData> drawDownDetailsTestData;

	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */
		drawDownDetailsTestData= getdrawDownDetailsTestData();
		TransactionScreen = getTransactionScreenList();
		BeneficiaryDetail = getBeneficiaryDetail();
		customerEmploymentDetailsTestdata = getCustomerEmploymentDetailsDetailsTestData();
		loginCredentials = getKULSCredentialsList();
		schemeMasterTestData = getUlsSchemeMasterTestData();
		projectMasterTestData = getUlsProjectMasterTestData();
		underWriterOffSetControlTestData = getUnderWriterOffSetControlTestData();
		wareHouseTestData = getWareHouseTestData();
		assetCollateratTypeTestdata = getAssetCollateralTypeTestData();
		loModuleWaiverTestData = getLoModuleWaiverTestData();
		uls_CheckerUserTestData = getCheckerUserTestData();
		uls_ReportMasterTestData = getReportMasterTestData();
		uls_LivingExpenseTestData = getLivingExpenseTestData();
		PropertyDetail = getPropertyDetail();
		uls_CustomerPersonalDetailsTestData = getCustomerPersonalDetailsTestData();
		uls_PropertyDetailsTestData = getPropertyDetailsTestdata();
		ApplicationDetails = getApplicationDetailsList();
		PerDetailEntry = getPerDetailEntry();
		csutomerAddressDetails = getCustomerAddressDetailsList();
		ulsBeneficiaryDetailsTestData = getBeneficiaryDetailsTestData();
		ulsCustomerDeptDetailsTestData = getCustomerDeptDetailsTestData();
		Benefiniary = getBenefiniary();
		DocumentDetailsTestData = getDocumentDetailsData();
	}

	private List<ULS_DrawDownBreakupDetailsTestData> getdrawDownDetailsTestData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ulsDrawdownDetailsTestData));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ulsDrawdownDetailsTestData));
			ULS_DrawDownBreakupDetailsTestData[] drawDoownDetailsTestdata = gson.fromJson(bufferReader,
					ULS_DrawDownBreakupDetailsTestData[].class);
			return Arrays.asList(drawDoownDetailsTestdata);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ulsDrawdownDetailsTestData);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	public final ULS_DrawDownBreakupDetailsTestData getDrawDownDetailsTestdataByName(String Username) {
		return drawDownDetailsTestData.stream().filter(x -> x.userType.equalsIgnoreCase(Username)).findAny().get();
	}

	private List<BeneficiaryDetailsTestData> getDocumentDetailsData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(BeneficiaryDetailsPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(BeneficiaryDetailsPath));
			BeneficiaryDetailsTestData[] beneficiaryDetailsData = gson.fromJson(bufferReader,
					BeneficiaryDetailsTestData[].class);
			return Arrays.asList(beneficiaryDetailsData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + BeneficiaryDetailsPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<Beneficiary_Details_Testdata> getBenefiniary() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(BenefiniaryPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(BenefiniaryPath));
			Beneficiary_Details_Testdata[] Benefiniary = gson.fromJson(bufferReader,
					Beneficiary_Details_Testdata[].class);
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

	public final Beneficiary_Details_Testdata getBenificiaryListByName(String Username) {
		return Benefiniary.stream().filter(x -> x.Users.equalsIgnoreCase(Username)).findAny().get();
	}

	private List<TransactionScreenTestDataType> getTransactionScreenList() {
		Gson gson2 = new Gson();
		JsonReader reader2 = new JsonReader(new StringReader(TransactionScreenDataPath));
		reader2.setLenient(true);
		BufferedReader bufferReader1 = null;
		try {
			bufferReader1 = new BufferedReader(new FileReader(TransactionScreenDataPath));
			TransactionScreenTestDataType[] TransactionScreen = gson2.fromJson(bufferReader1,
					TransactionScreenTestDataType[].class);
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

	private List<ULS_CustomerDeptDetailsTestData> getCustomerDeptDetailsTestData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ulsCustomerDeptDetailsJSONFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ulsCustomerDeptDetailsJSONFilePath));
			ULS_CustomerDeptDetailsTestData[] ulsCustomerDeptDetailsTestData = gson.fromJson(bufferReader,
					ULS_CustomerDeptDetailsTestData[].class);
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

	private List<ULS_BeneficiaryDetailsTestData> getBeneficiaryDetailsTestData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ulsBeneficiaryDetailsFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ulsBeneficiaryDetailsFilePath));
			ULS_BeneficiaryDetailsTestData[] ulsBeneficiaryDetailsTestdata = gson.fromJson(bufferReader,
					ULS_BeneficiaryDetailsTestData[].class);
			return Arrays.asList(ulsBeneficiaryDetailsTestdata);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ulsBeneficiaryDetailsFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<BeneficiaryDetailTestData> getBeneficiaryDetail() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(BeneficaiaryDetailPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(BeneficaiaryDetailPath));
			BeneficiaryDetailTestData[] beneficiarydetail = gson.fromJson(bufferReader,
					BeneficiaryDetailTestData[].class);
			return Arrays.asList(beneficiarydetail);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + BeneficaiaryDetailPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public final testDataType.BeneficiaryDetailTestData getBeneficiaryDetailListByName(String Username) {
		return BeneficiaryDetail.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}

	private List<ULS_CustomerEmploymentDetailsTestdataType> getCustomerEmploymentDetailsDetailsTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(customerEmploymentDetailsFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(customerEmploymentDetailsFilePath));
			ULS_CustomerEmploymentDetailsTestdataType[] customerEmployementDetailsTestData = gson.fromJson(bufferReader,
					ULS_CustomerEmploymentDetailsTestdataType[].class);
			return Arrays.asList(customerEmployementDetailsTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + customerEmploymentDetailsFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<ULS_CustomerAddressDetailsTestDataType> getCustomerAddressDetailsList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(customerAddressDetails));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(customerAddressDetails));
			ULS_CustomerAddressDetailsTestDataType[] customerAddressDetails = gson.fromJson(bufferReader,
					ULS_CustomerAddressDetailsTestDataType[].class);
			return Arrays.asList(customerAddressDetails);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + customerAddressDetails);
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
			PersonalaDetailsDataEntryTestdata[] PerDetailpath = gson.fromJson(bufferReader,
					PersonalaDetailsDataEntryTestdata[].class);
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

	private List<KULS_ApplicationDetails_AppDataEntry_Testdata> getApplicationDetailsList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ApplicationDetailsDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ApplicationDetailsDataPath));
			KULS_ApplicationDetails_AppDataEntry_Testdata[] livingexpense = gson.fromJson(bufferReader,
					KULS_ApplicationDetails_AppDataEntry_Testdata[].class);
			return Arrays.asList(livingexpense);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ApplicationDetailsDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<PropetyDetails_TestDataType> getPropertyDetailsTestdata() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(uls_PropertyDetailsJsonfilepath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(uls_PropertyDetailsJsonfilepath));
			PropetyDetails_TestDataType[] getPropertyDetailsTestData = gson.fromJson(bufferReader,
					PropetyDetails_TestDataType[].class);
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

	private List<CustomerPerssonalDetailsTestData> getCustomerPersonalDetailsTestData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(uls_CustomerPersonalDetailsestDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(uls_CustomerPersonalDetailsestDataPath));
			CustomerPerssonalDetailsTestData[] uls_CustomerPersonalDetailsTestData = gson.fromJson(bufferReader,
					CustomerPerssonalDetailsTestData[].class);
			return Arrays.asList(uls_CustomerPersonalDetailsTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + uls_CustomerPersonalDetailsestDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<ULS_LivingExpenseTestData> getLivingExpenseTestData() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(uls_LivingExpenseTestDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(uls_LivingExpenseTestDataPath));
			ULS_LivingExpenseTestData[] uls_LivingExpenseTestData = gson.fromJson(bufferReader,
					ULS_LivingExpenseTestData[].class);
			return Arrays.asList(uls_LivingExpenseTestData);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + uls_LivingExpenseTestDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	private List<ULS_ReportMasterTestData> getReportMasterTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(uls_ReportMasterTestDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(uls_ReportMasterTestDataPath));
			ULS_ReportMasterTestData[] uls_ReportMasterTestData = gson.fromJson(bufferReader,
					ULS_ReportMasterTestData[].class);
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

	private List<ULS_AssetCollateralTypeTestData> getAssetCollateralTypeTestData() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ULS_AssetCollateralJSONFilePath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ULS_AssetCollateralJSONFilePath));
			ULS_AssetCollateralTypeTestData[] assetCollateralTypeTestData = gson.fromJson(bufferReader,
					ULS_AssetCollateralTypeTestData[].class);
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
			KULS_WareHouseMasterTestData[] wareHouseTestData = gson.fromJson(bufferReader,
					KULS_WareHouseMasterTestData[].class);
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
			KULS_UnderWriterOffSetControlTestData[] underWriterOffSetControlTestData = gson.fromJson(bufferReader,
					KULS_UnderWriterOffSetControlTestData[].class);
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
			ULS_ProjectMasterTestData[] projectMasterTestData = gson.fromJson(bufferReader,
					ULS_ProjectMasterTestData[].class);
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
			ULS_SchemeMasterTestDataType[] schemeMasterTestData = gson.fromJson(bufferReader,
					ULS_SchemeMasterTestDataType[].class);
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

	// KULS_UnderWriterOffSetControlTestData> underWriterOffSetControlTestData
	public final KULS_UnderWriterOffSetControlTestData getUlsUnderWriterOffSetControlTestDataByName(String Username) {
		return underWriterOffSetControlTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny()
				.get();
	}

	// KULS_WareHouseMasterTestData> wareHouseTestData
	public final KULS_WareHouseMasterTestData getUlsWareHouseTestDataByName(String Username) {
		return wareHouseTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	public final PersonalaDetailsDataEntryTestdata getPerDetailDataByName(String User) {
		return PerDetailEntry.stream().filter(x -> x.Users.equalsIgnoreCase(User)).findAny().get();
	}

	// ULS_AssetCollateralTypeTestData> assetCollateratTypeTestdata
	public final ULS_AssetCollateralTypeTestData getAssetCollateralTypeTestDataByName(String Username) {
		return assetCollateratTypeTestdata.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// ULS_LoModuleWaiverTestData> loModuleWaiverTestData
	public final ULS_LoModuleWaiverTestData getLoModuleWaiverTestDataByName(String Username) {
		return loModuleWaiverTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// ULS_CheckerTestData> uls_CheckerUserTestData;
	public final ULS_CheckerTestData getLoCheckerUserTestDataByName(String Username) {
		return uls_CheckerUserTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// ULS_ReportMasterTestData> uls_ReportMasterTestData
	public final ULS_ReportMasterTestData getReportMasterTestDataByName(String Username) {
		return uls_ReportMasterTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// ULS_LivingExpenseTestData> uls_LivingExpenseTestData
	public final ULS_LivingExpenseTestData getLivingExpenseTestDataByName(String Username) {
		return uls_LivingExpenseTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// CustomerPerssonalDetailsTestData> uls_CustomerPersonalDetailsTestData
	public final CustomerPerssonalDetailsTestData getCustomerPersonalDetailsTestDataByName(String Username) {
		return uls_CustomerPersonalDetailsTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny()
				.get();
	}

	// PropetyDetails_TestDataType> uls_PropertyDetailsTestData
	public final PropetyDetails_TestDataType getPropertyDetailsTestDataByName(String Username) {
		return uls_PropertyDetailsTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	// Application Details App Data Entry
	public final KULS_ApplicationDetails_AppDataEntry_Testdata getApplicationDetailsByName(String Username) {
		return ApplicationDetails.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	public final PropertyDetails_TestData getPropertyDetailByName(String User) {
		return PropertyDetail.stream().filter(x -> x.user.equalsIgnoreCase(User)).findAny().get();
	}

	// ULS_CustomerAddressDetailsTestDataType> csutomerAddressDetails
	public final ULS_CustomerAddressDetailsTestDataType getCustomerAddressDetailsTestdataByName(String User) {
		return csutomerAddressDetails.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny().get();
	}

	// ULS_CustomerEmploymentDetailsTestdataType> customerEmploymentDetailsTestdata
	public final ULS_CustomerEmploymentDetailsTestdataType getCustomerEmploymentDetailsTestdataByName(String User) {
		return customerEmploymentDetailsTestdata.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny()
				.get();
	}

	// ULS_BeneficiaryDetailsTestData> ulsBeneficiaryDetailsTestData
	public final ULS_BeneficiaryDetailsTestData getBeneficiaryDetailsTestDataByName(String User) {
		return ulsBeneficiaryDetailsTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny().get();
	}

	// ULS_CustomerDeptDetailsTestData> ulsCustomerDeptDetailsTestData
	public final ULS_CustomerDeptDetailsTestData getCustomerDeptDetailsTestDataByName(String User) {
		return ulsCustomerDeptDetailsTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny().get();
	}

	public final TransactionScreenTestDataType getTransactionScreenListByName(String Username) {
		return TransactionScreen.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	public final BeneficiaryDetailsTestData getBeneficiaryDetailsDataListByName(String Username) {
		return DocumentDetailsTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
}