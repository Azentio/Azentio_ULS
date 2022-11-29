
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

import testDataType.KULS_ApplicationDetails_AppDataEntry_Testdata;
import testDataType.KULS_BounceMaster_Test;
import testDataType.KULS_CollateralSubType;
import testDataType.KULS_CustomerEntityLayout_ContactDetails_Testdata;
import testDataType.KULS_CustomerEntityLayout_CustomerDebt_Testdata;
import testDataType.KULS_CustomerEntityLayout_Identification_Testdata;
import testDataType.KULS_DueMaster_Creation;
import testDataType.KULS_LivingExpense_Testdata;
import testDataType.KULS_Login_TestDataType;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	// ULS Login
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;
	// Due Master--Arul
		private final String DueMasterDataPath = configFileReader.getJsonPath() + "DueMasterJson.json";
		private List<KULS_DueMaster_Creation> DueMaster;
	// Collateral Subtype Master--Arul
		private final String CollateralSubtypeDataPath = configFileReader.getJsonPath() + "CollateralSubTypeJson.json";
		private List<KULS_CollateralSubType> CollateralSubtypeMaster;
		//  Bounce Master--Arul
				private final String BounceMasterDataPath = configFileReader.getJsonPath() + "BounceMaster.json";
				private List<KULS_BounceMaster_Test> BounceMaster;
			//  Living Expense--Arul
							private final String LivingExpenseDataPath = configFileReader.getJsonPath() + "LivingExpense.json";
							private List<KULS_LivingExpense_Testdata> LivingExpense;
					//  ApplicationDetails--Arul
						private final String ApplicationDetailsDataPath = configFileReader.getJsonPath() + "ApplicationDetails_AppDataEntryJson.json";
						private List<KULS_ApplicationDetails_AppDataEntry_Testdata> ApplicationDetails;
					//  ContactDetails--Arul
						private final String ContactDetailsDataPath = configFileReader.getJsonPath() + "CustomerEntityLayout_ContactDetailsJson.json";
						private List<KULS_CustomerEntityLayout_ContactDetails_Testdata> ContactDetails;
					//  ContactDetails--Arul
						private final String IdentificationDataPath = configFileReader.getJsonPath() + "CustomerEntityLayout_IdentificationJson.json";
						private List<KULS_CustomerEntityLayout_Identification_Testdata> Identification;	
					//  CustomerDebt--Arul
						private final String CustomerDebtDataPath = configFileReader.getJsonPath() + "CustomerEntityLayout_CustomerDebtJson.json";
						private List<KULS_CustomerEntityLayout_CustomerDebt_Testdata> CustomerDebt;	
	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */

		loginCredentials = getKULSCredentialsList();
		//Due Master-Arul
		DueMaster = getDueMasterList();
		//Collateral SubType Master-Arul
		CollateralSubtypeMaster = getCollateralSubTypeList();
		//Bounce Master Master-Arul
				BounceMaster = getBounceMasterList();
		//Living Expense Maseter-Arul
				LivingExpense = getLivingExpenseList();
		//Application Details Maseter-Arul
				ApplicationDetails = getApplicationDetailsList();		
		//Contact Details Maseter-Arul
				ContactDetails = getContactDetailsList();	
		//Identification Maseter-Arul
				Identification = getIdentificationList();
		//CustomerDebt Maseter-Arul
				CustomerDebt = getCustomerDebtList();

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

	//Bounce Master--Arul
	private List<KULS_BounceMaster_Test> getBounceMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(BounceMasterDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(BounceMasterDataPath));
			KULS_BounceMaster_Test[] Bounce = gson.fromJson(bufferReader, KULS_BounceMaster_Test[].class);
			return Arrays.asList(Bounce);
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
	//Living Expense--Arul
		private List<KULS_LivingExpense_Testdata> getLivingExpenseList() {
			Gson gson = new Gson();
			JsonReader reader = new JsonReader(new StringReader(LivingExpenseDataPath));
			reader.setLenient(true);
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(LivingExpenseDataPath));
				KULS_LivingExpense_Testdata[] livingexpense = gson.fromJson(bufferReader, KULS_LivingExpense_Testdata[].class);
				return Arrays.asList(livingexpense);
			} catch (FileNotFoundException e) {
				throw new RuntimeException("Json file not found at path : " + LivingExpenseDataPath);
			} finally {
				try {
					if (bufferReader != null)
						bufferReader.close();
				} catch (IOException ignore) {
				}
			}
		}

		//ApplicationDetails--Arul
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
				//ContactDetails--Arul
				private List<KULS_CustomerEntityLayout_ContactDetails_Testdata> getContactDetailsList() {
					Gson gson = new Gson();
					JsonReader reader = new JsonReader(new StringReader(ContactDetailsDataPath));
					reader.setLenient(true);
					BufferedReader bufferReader = null;
					try {
						bufferReader = new BufferedReader(new FileReader(ContactDetailsDataPath));
						KULS_CustomerEntityLayout_ContactDetails_Testdata[] contactdetail = gson.fromJson(bufferReader, KULS_CustomerEntityLayout_ContactDetails_Testdata[].class);
						return Arrays.asList(contactdetail);
					} catch (FileNotFoundException e) {
						throw new RuntimeException("Json file not found at path : " + ContactDetailsDataPath);
					} finally {
						try {
							if (bufferReader != null)
								bufferReader.close();
						} catch (IOException ignore) {
						}
					}
				}
				//Identification--Arul
				private List<KULS_CustomerEntityLayout_Identification_Testdata> getIdentificationList() {
					Gson gson = new Gson();
					JsonReader reader = new JsonReader(new StringReader(IdentificationDataPath));
					reader.setLenient(true);
					BufferedReader bufferReader = null;
					try {
						bufferReader = new BufferedReader(new FileReader(IdentificationDataPath));
						KULS_CustomerEntityLayout_Identification_Testdata[] Identification = gson.fromJson(bufferReader, KULS_CustomerEntityLayout_Identification_Testdata[].class);
						return Arrays.asList(Identification);
					} catch (FileNotFoundException e) {
						throw new RuntimeException("Json file not found at path : " + IdentificationDataPath);
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

	public final KULS_Login_TestDataType getKULSLoginCredentialsByName(String Username) {
		return loginCredentials.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//Due Master--Arul

	public final KULS_DueMaster_Creation getDueMasterByName(String Username) {
		return DueMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//Collateral Subtype Master--Arul

		public final KULS_CollateralSubType getCollateralSubTypeByName(String Username) {
			return CollateralSubtypeMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
		}
		//Bounce Master--Arul

				public final KULS_BounceMaster_Test getBounceMasterByName(String Username) {
					return BounceMaster.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
				}

				//Living Expense--Arul

				public final KULS_LivingExpense_Testdata getLivingExpenseByName(String Username) {
					return LivingExpense.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
				}
				//ApplicationDetails--Arul

				public final KULS_ApplicationDetails_AppDataEntry_Testdata getApplicationDetailsByName(String Username) {
					return ApplicationDetails.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
				}
				//ContactDetails--Arul

				public final KULS_CustomerEntityLayout_ContactDetails_Testdata getContactDetailsByName(String Username) {
					return ContactDetails.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
				}
				//Identification--Arul

				public final KULS_CustomerEntityLayout_Identification_Testdata getIdentificationByName(String Username) {
					return Identification.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
				}
				//CustomerDebt--Arul

				public final KULS_CustomerEntityLayout_CustomerDebt_Testdata getCustomerDebtByName(String Username) {
					return CustomerDebt.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
				}
}
		

