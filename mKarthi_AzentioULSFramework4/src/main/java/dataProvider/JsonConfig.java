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
import testDataType.ApplicationDetailsOfferingTestDataType;
import testDataType.ApplicationDetails_NEWAPPTestData;
import testDataType.ApplicationDisbursementMakerTestData;
import testDataType.AppropriationMasterTestDataType;
import testDataType.AssetAutoMaster_TestData;
import testDataType.Asset_CD_MasterTestDataType;
import testDataType.BounceMasterTestDataType;
import testDataType.CustomerPersonalDetailDisbursementCheckerTestDataType;
import testDataType.CustomerPersonalDetailOfferingTestDataType;
import testDataType.KULS_AllocationMasterTestdata;
import testDataType.KULS_ApplicationDetails_AppDataEntry_Testdata;
import testDataType.KULS_Login_TestDataType;
import testDataType.PersonalDetails_DisbursementMakerTestDataType;
import testDataType.PersonalaDetailsDataEntryTestdata;
import testDataType.ProjectMasterTestDataType;
import testDataType.ReportMasterTestDataType;
import testDataType.SubProductRetailParameterNegativeTestDataType;
import testDataType.SubProductRetailParameterTestDataType;
import testDataType.TransactionScreenTestDataType;
import testDataType.ULS_AllocationMasterTestData;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	// ULS Login
	
	//Batch
	
	// assetauto master
		private final String assetAutoMasterPath = configFileReader.getJsonPath() + "AssetAutoMaster.json";
		private List<AssetAutoMaster_TestData> assetAutoMasterData;
	
	private final String AllocationMasterpath = configFileReader.getJsonPath() + "KULS_AllocationMasterjson.json";
	private List<KULS_AllocationMasterTestdata> AllocationMaster1List;
	
	private final String allocationMasterTestDataJSONPath = configFileReader.getJsonPath() + "ULS_AllocationMasterJSON.json";
	private List<ULS_AllocationMasterTestData> allocationMasterTestData;

	private final String AllocationMasterDataPath = configFileReader.getJsonPath() + "AllocationMasterJson.json";
	private List<AllocationMasterTestData> AllocationMaster;
	
	private final String PerDetailpath = configFileReader.getJsonPath() + "PersonalDetailsAppDataEntry.json";
	private List<PersonalaDetailsDataEntryTestdata> PerDetailEntry;
	
	private final String applicationNEWAPPPath = configFileReader.getJsonPath() + "ApplicationDetails_NEWAPP.json";
	private List<ApplicationDetails_NEWAPPTestData> applicationDetailsNEWAPData;
	
	private final String ApplicationDetailsDataPath = configFileReader.getJsonPath() + "ApplicationDetails_AppDataEntryJson.json";
	private List<KULS_ApplicationDetails_AppDataEntry_Testdata> ApplicationDetails;
	
	private final String DisbursementMakerPath = configFileReader.getJsonPath() + "Application_DisbursementMakerJSON.json";
	private List<ApplicationDisbursementMakerTestData> disbursementMaker;
	
	private final String CustomerPersonalDetailOfferingPath = configFileReader.getJsonPath() + "CustomerPersonalDetailOfferingJSON.json";
	private List<CustomerPersonalDetailOfferingTestDataType> CustomerPersonalDetailOfferingList;
	
	private final String ApplicationDetailsOfferingPath = configFileReader.getJsonPath() + "ApplicationDetailsOfferingJSON.json";
	private List<ApplicationDetailsOfferingTestDataType> ApplicationDetailsOfferingList;
	
	private final String CustomerPersonalDetailDisbursementCheckerPath = configFileReader.getJsonPath() + "CustomerPersonalDetailDisbursementCheckerJSON.json";
	private List<CustomerPersonalDetailDisbursementCheckerTestDataType> CustomerPersonalDetailDisbursementCheckerList;
	
	private final String PersonalDetails_DisbursementMakerPath = configFileReader.getJsonPath() + "PersonalDetails_DisbursementMakerJSON.json";
	private List<PersonalDetails_DisbursementMakerTestDataType> PersonalDetails_DisbursementMakerList;

	
	

	
	
	//Transaction Screen
	
	private final String TransactionScreenDataPath = configFileReader.getJsonPath() + "TransactionScreenJSON.json";
	private List<TransactionScreenTestDataType> TransactionScreen;
	
	
	//Report Master
	
	private final String ReportMasterDataPath = configFileReader.getJsonPath() + "ReportMasterJSON.json";
	private List<ReportMasterTestDataType> ReportMaster;
	
	//AppropriationMaster
	
	private final String AppropriationMasterDataPath = configFileReader.getJsonPath() + "AppropriationMasterJSON.json";
	private List<AppropriationMasterTestDataType> AppropriationMaster;
	
	
	
	// Karthi SubProductRetailParameter
	
	private final String ParameternegativeDataPath = configFileReader.getJsonPath() + "SubProductRetailMasterParameterNegativeJSON.json";
	private List<SubProductRetailParameterNegativeTestDataType> SubParameternegative;
	
	private final String ParameterDataPath = configFileReader.getJsonPath() + "SubProductMasterRetailparameterJSON.json";
	private List<SubProductRetailParameterTestDataType> SubParameter;
	
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;
	
	// project master
	
	private final String ProjectMasterDataPath = configFileReader.getJsonPath() + "ProjectMasterJSON.json";
	private List<ProjectMasterTestDataType> ProjectMaster;
	
	// Asset_CD_Master
	
	private final String AssetCDMasterDataPath = configFileReader.getJsonPath() + "Asset_CD_MasterJSON.json";
	private List<Asset_CD_MasterTestDataType> AssetCDMaster;
	
	private final String BounceMasterDataPath = configFileReader.getJsonPath() + "BounceMasterJSON.json";
	private List<BounceMasterTestDataType> BounceMaster;

	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */
		SubParameternegative = getSubParameterNegativeList();
		SubParameter = getSubParameterList();
		loginCredentials = getKULSCredentialsList();
		ProjectMaster = getProjectMasterList();
		AssetCDMaster =getAssetCDMasterList();
		AppropriationMaster =getAppropriationMasterList();
		ReportMaster = getReportMasterList();
		TransactionScreen = getTransactionScreenList();
		PerDetailEntry=getPerDetailEntry();
		applicationDetailsNEWAPData=getApplicationDetailsNEWAPP();
		ApplicationDetails = getApplicationDetailsList();
		disbursementMaker = getdisbursementMaker();
		CustomerPersonalDetailOfferingList = getCustomerPersonalDetailOfferingList();
		ApplicationDetailsOfferingList = getApplicationDetailsOfferingList();
		CustomerPersonalDetailDisbursementCheckerList = getCustomerPersonalDetailDisbursementCheckerList();
		PersonalDetails_DisbursementMakerList = getPersonalDetails_DisbursementMakerList();
		BounceMaster=getBounceMasterList();
		AllocationMaster = getAllocationMasterList();
		allocationMasterTestData=getAllocationMasterTestData();
		AllocationMaster1List=getAllocationMaster1List();
		assetAutoMasterData = getAssetAutoMaster();

	}
	
	// asset auto master
		private List<AssetAutoMaster_TestData> getAssetAutoMaster() {
			Gson gson = new Gson();
			JsonReader reader = new JsonReader(new StringReader(assetAutoMasterPath));
			reader.setLenient(true);
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(assetAutoMasterPath));
				AssetAutoMaster_TestData[] assetAutoMaster = gson.fromJson(bufferReader, AssetAutoMaster_TestData[].class);
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

	
	private List<BounceMasterTestDataType> getBounceMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(BounceMasterDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(BounceMasterDataPath));
			BounceMasterTestDataType[] BounceMaster= gson.fromJson(bufferReader, BounceMasterTestDataType[].class);
			return Arrays.asList(BounceMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + BounceMasterDataPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}


	
	private List<PersonalDetails_DisbursementMakerTestDataType> getPersonalDetails_DisbursementMakerList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(PersonalDetails_DisbursementMakerPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(PersonalDetails_DisbursementMakerPath));
			PersonalDetails_DisbursementMakerTestDataType[] personalDetailsDisbursementMaker= gson.fromJson(bufferReader, PersonalDetails_DisbursementMakerTestDataType[].class);
			return Arrays.asList(personalDetailsDisbursementMaker);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + PersonalDetails_DisbursementMakerPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	
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
	
	
	private List<ApplicationDisbursementMakerTestData> getdisbursementMaker() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(DisbursementMakerPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(DisbursementMakerPath));
			ApplicationDisbursementMakerTestData[] charge = gson.fromJson(bufferReader, ApplicationDisbursementMakerTestData[].class);
			return Arrays.asList(charge);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + DisbursementMakerPath);
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
			KULS_ApplicationDetails_AppDataEntry_Testdata[] applicationdetail = gson.fromJson(bufferReader, KULS_ApplicationDetails_AppDataEntry_Testdata[].class);
			return Arrays.asList(applicationdetail);
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
	//Report Master
	
	private List<ReportMasterTestDataType> getReportMasterList() {
		Gson gson2 = new Gson();
		JsonReader reader2 = new JsonReader(new StringReader(ReportMasterDataPath));
		reader2.setLenient(true);
		BufferedReader bufferReader1 = null;
		try {
			bufferReader1 = new BufferedReader(new FileReader(ReportMasterDataPath));
			ReportMasterTestDataType[] ReportMaster = gson2.fromJson(bufferReader1, ReportMasterTestDataType[].class);
			return Arrays.asList(ReportMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ReportMasterDataPath);
		} finally {
			try {
				if (bufferReader1 != null)
					bufferReader1.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	
	//AppropriationMaster
	
	private List<AppropriationMasterTestDataType> getAppropriationMasterList() {
		Gson gson2 = new Gson();
		JsonReader reader2 = new JsonReader(new StringReader(AppropriationMasterDataPath));
		reader2.setLenient(true);
		BufferedReader bufferReader1 = null;
		try {
			bufferReader1 = new BufferedReader(new FileReader(AppropriationMasterDataPath));
			AppropriationMasterTestDataType[] AppropriationMaster = gson2.fromJson(bufferReader1, AppropriationMasterTestDataType[].class);
			return Arrays.asList(AppropriationMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + AppropriationMasterDataPath);
		} finally {
			try {
				if (bufferReader1 != null)
					bufferReader1.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	
	private List<Asset_CD_MasterTestDataType> getAssetCDMasterList() {
		Gson gson2 = new Gson();
		JsonReader reader2 = new JsonReader(new StringReader(AssetCDMasterDataPath));
		reader2.setLenient(true);
		BufferedReader bufferReader1 = null;
		try {
			bufferReader1 = new BufferedReader(new FileReader(AssetCDMasterDataPath));
			Asset_CD_MasterTestDataType[] AssetCDMaster = gson2.fromJson(bufferReader1, Asset_CD_MasterTestDataType[].class);
			return Arrays.asList(AssetCDMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + AssetCDMasterDataPath);
		} finally {
			try {
				if (bufferReader1 != null)
					bufferReader1.close();
			} catch (IOException ignore) {
			}
		}
	}
	
	private List<ProjectMasterTestDataType> getProjectMasterList() {
		Gson gson2 = new Gson();
		JsonReader reader2 = new JsonReader(new StringReader(ProjectMasterDataPath));
		reader2.setLenient(true);
		BufferedReader bufferReader1 = null;
		try {
			bufferReader1 = new BufferedReader(new FileReader(ProjectMasterDataPath));
			ProjectMasterTestDataType[] ProjectMaster = gson2.fromJson(bufferReader1, ProjectMasterTestDataType[].class);
			return Arrays.asList(ProjectMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ProjectMasterDataPath);
		} finally {
			try {
				if (bufferReader1 != null)
					bufferReader1.close();
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
			SubProductRetailParameterNegativeTestDataType[] SubParameternegative = gson2.fromJson(bufferReader1, SubProductRetailParameterNegativeTestDataType[].class);
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
	
	private List<SubProductRetailParameterTestDataType> getSubParameterList() {
		Gson gson1 = new Gson();
		JsonReader reader1 = new JsonReader(new StringReader(ParameterDataPath));
		reader1.setLenient(true);
		BufferedReader bufferReader1 = null;
		try {
			bufferReader1 = new BufferedReader(new FileReader(ParameterDataPath));
			SubProductRetailParameterTestDataType[] SubParameter = gson1.fromJson(bufferReader1, SubProductRetailParameterTestDataType[].class);
			return Arrays.asList(SubParameter);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + ParameterDataPath);
		} finally {
			try {
				if (bufferReader1 != null)
					bufferReader1.close();
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
	
	//TransactionScreen
	
	public final TransactionScreenTestDataType getTransactionScreenListByName(String Username) {
		return TransactionScreen.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	//Report Master
	
	public final ReportMasterTestDataType getReportMasterListByName(String Username) {
		return ReportMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	//AppropriationMaster
	
	public final AppropriationMasterTestDataType getAppropriationMasterListByName(String Username) {
		return AppropriationMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	// Karthi Parameter
	
	public final SubProductRetailParameterNegativeTestDataType getSubParameterNegativeListByName(String Username) {
		return SubParameternegative.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final SubProductRetailParameterTestDataType getSubParameterListByName(String Username) {
		return SubParameter.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}

	
	public final KULS_Login_TestDataType getKULSLoginCredentialsByName(String Username) {
		return loginCredentials.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	// asset auto master
		public final AssetAutoMaster_TestData getAssetAutoMasterListByName(String Username) {
			return assetAutoMasterData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
		}

	
	// Project Master
	
	public final ProjectMasterTestDataType getProjectMasterListByName(String Username) {
		return ProjectMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	//Asset_CD_Master
	
	public final Asset_CD_MasterTestDataType getAssetCDMasterListByName(String Username) {
		return AssetCDMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	//batch
	
	public final KULS_AllocationMasterTestdata getAllocationMaster1ListByName(String Username) {
		return AllocationMaster1List.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final ULS_AllocationMasterTestData getAllocationTestDataByName(String Username) {
		return allocationMasterTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final AllocationMasterTestData getAllocationMasterByName(String Username) {
		return AllocationMaster.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final PersonalaDetailsDataEntryTestdata getPerDetailDataByName(String User) {
		return PerDetailEntry.stream().filter(x -> x.Users.equalsIgnoreCase(User)).findAny().get();
	}
	
	public final ApplicationDetails_NEWAPPTestData getApplicationDetailsNEWAPPListByName(String Username) {
	    return applicationDetailsNEWAPData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final KULS_ApplicationDetails_AppDataEntry_Testdata getApplicationDetailsByName(String Username) {
		return ApplicationDetails.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final ApplicationDisbursementMakerTestData getApplication_DisbursementMakerListByName(String User) {
		return disbursementMaker.stream().filter(x -> x.User.equalsIgnoreCase(User)).findAny().get();
	}
	
	public final CustomerPersonalDetailOfferingTestDataType getCustomerPersonalDetailOfferingByName(String Username) {
		return CustomerPersonalDetailOfferingList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final ApplicationDetailsOfferingTestDataType getApplicationDetailsOfferingByName(String Username) {
		return ApplicationDetailsOfferingList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final CustomerPersonalDetailDisbursementCheckerTestDataType getCustomerPersonalDetailDisbursementCheckerByName(String Username) {
		return CustomerPersonalDetailDisbursementCheckerList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	
	public final PersonalDetails_DisbursementMakerTestDataType getPersonalDetails_DisbursementMakerByName(String Username) {
		return PersonalDetails_DisbursementMakerList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
    }
	
	public final BounceMasterTestDataType getBounceMasterListByName(String Username) {
		return BounceMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
    }

	
	

}