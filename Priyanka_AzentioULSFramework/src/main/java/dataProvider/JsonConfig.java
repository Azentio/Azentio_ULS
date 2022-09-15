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

import testDataType.CollateralTestDataType;
import testDataType.IncentiveMasterTestDataType;
import testDataType.IncomeDetailsTestDataType;
import testDataType.KULS_Login_TestDataType;
import testDataType.PersonalDetails_DisbursementMakerTestDataType;
import testDataType.ProductMaster_RetailTestDataType;
import testDataType.ProjectMasterTestDataType;
import testDataType.ReportMasterTestDataType;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */

		loginCredentials = getKULSCredentialsList();
		ProductMasterRetailList = getProductMasterRetailList();
		ProjectMasterList = getProjectMasterList();
		CollateralList = getCollateralList();
		IncentiveMasterList = getIncentiveMasterList();
		ReportMasterList = getReportMasterList();
		PersonalDetails_DisbursementMakerList = getPersonalDetails_DisbursementMakerList();
		IncomeDetailsList = getIncomeDetailsList();
	}

	//ULS Login
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;

	//loginCredentials
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
	
	//loginCredentials
	public final KULS_Login_TestDataType getKULSLoginCredentialsByName(String Username) {
		return loginCredentials.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	
	//ProductMasterRetail
		private final String ProductMasterRetailPath = configFileReader.getJsonPath() + "ProductMaster_RetailJSON.json";
		private List<ProductMaster_RetailTestDataType> ProductMasterRetailList;
	
	//ProductMasterRetail
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

	//ProductMasterRetail
	public final ProductMaster_RetailTestDataType getProductMasterRetailByName(String Username) {
		return ProductMasterRetailList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	//ProjectMaster
	private final String ProjectMasterPath = configFileReader.getJsonPath() + "ProjectMasterJSON.json";
	private List<ProjectMasterTestDataType> ProjectMasterList;

	//ProjectMaster
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
	//ProjectMaster
	public final ProjectMasterTestDataType getProjectMasterByName(String Username) {
	return ProjectMasterList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}

	//Collateral
	private final String CollateralPath = configFileReader.getJsonPath() + "CollateralJSON.json";
	private List<CollateralTestDataType> CollateralList;

	//Collateral
	private List<CollateralTestDataType> getCollateralList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(CollateralPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(CollateralPath));
			CollateralTestDataType[] collateral = gson.fromJson(bufferReader, CollateralTestDataType[].class);
			return Arrays.asList(collateral);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + CollateralPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}
	//Collateral
	public final CollateralTestDataType getCollateralByName(String Username) {
	return CollateralList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	
	}
	
	// IncentiveMaster
	private final String IncentiveMasterPath = configFileReader.getJsonPath() + "IncentiveMasterJSON.json";
	private List<IncentiveMasterTestDataType> IncentiveMasterList;

	// IncentiveMaster
	private List<IncentiveMasterTestDataType> getIncentiveMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(IncentiveMasterPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(IncentiveMasterPath));
			IncentiveMasterTestDataType[] incentiveMaster= gson.fromJson(bufferReader, IncentiveMasterTestDataType[].class);
			return Arrays.asList(incentiveMaster);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + IncentiveMasterPath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	// IncentiveMaster
	public final IncentiveMasterTestDataType getIncentiveMasterByName(String Username) {
		return IncentiveMasterList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();

	}
	

	// ReportMaster
	private final String ReportMasterPath = configFileReader.getJsonPath() + "ReportMasterJSON.json";
	private List<ReportMasterTestDataType> ReportMasterList;

	// ReportMaster
	private List<ReportMasterTestDataType> getReportMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(ReportMasterPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(ReportMasterPath));
			ReportMasterTestDataType[] reportMaster= gson.fromJson(bufferReader, ReportMasterTestDataType[].class);
			return Arrays.asList(reportMaster);
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

	// ReportMaster
	public final ReportMasterTestDataType getReportMasterByName(String Username) {
		return ReportMasterList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();

	}
	
	// PersonalDetails_DisbursementMaker
		private final String PersonalDetails_DisbursementMakerPath = configFileReader.getJsonPath() + "PersonalDetails_DisbursementMakerJSON.json";
		private List<PersonalDetails_DisbursementMakerTestDataType> PersonalDetails_DisbursementMakerList;

	// PersonalDetails_DisbursementMaker
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

	// PersonalDetails_DisbursementMaker
	public final PersonalDetails_DisbursementMakerTestDataType getPersonalDetails_DisbursementMakerByName(String Username) {
	return PersonalDetails_DisbursementMakerList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();

		}
	
	
	//IncomeDetails
		private final String IncomeDetailsPath = configFileReader.getJsonPath() + "IncomeDetailsJSON.json";
		private List<IncomeDetailsTestDataType> IncomeDetailsList;

		// IncomeDetails
		private List<IncomeDetailsTestDataType> getIncomeDetailsList() {
			Gson gson = new Gson();
			JsonReader reader = new JsonReader(new StringReader(IncomeDetailsPath));
			reader.setLenient(true);
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(IncomeDetailsPath));
				IncomeDetailsTestDataType[] incomeDetails= gson.fromJson(bufferReader, IncomeDetailsTestDataType[].class);
				return Arrays.asList(incomeDetails);
			} catch (FileNotFoundException e) {
				throw new RuntimeException("Json file not found at path : " + IncomeDetailsPath);
			} finally {
				try {
					if (bufferReader != null)
						bufferReader.close();
				} catch (IOException ignore) {
				}
			}
		}

		// ReportMaster
		public final IncomeDetailsTestDataType getIncomeDetailsByName(String Username) {
			return IncomeDetailsList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();

		}

}