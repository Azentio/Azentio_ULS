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
import testDataType.ApplicationDisbursementMakerTestData;
import testDataType.BeneficiaryDetailTestData;
import testDataType.Charge_Master_Testdata;
import testDataType.CustomerEmploymentTestDataType;
import testDataType.CustomerEmploymentTestData;
import testDataType.DepositAccountTestData;
import testDataType.FeeMasterTestData;
import testDataType.FloatingRateMasterTestData;
import testDataType.KULS_Login_TestDataType;
import testDataType.OwnershipLayoutTestData;
import testDataType.ReportMasterTestData;
import testDataType.SchemeMasterTestData;
import testDataType.CustomerFinancialsTestData;

//master
public class JsonConfig {
	ConfigFileReader configFileReader = new ConfigFileReader();

	// ULS Login
	private final String KULSLoginDataPath = configFileReader.getJsonPath() + "KULS_Login_dataJSON.json";
	private List<KULS_Login_TestDataType> loginCredentials;
	
	//Fee Master-->Kamalapriya
	private final String FeeMasterDataPath = configFileReader.getJsonPath() + "FeeMasterJson.json";
	private List<FeeMasterTestData> FeeMaster;
	//Scheme Master-->Kamalapriya
		private final String SchemeMasterDataPath = configFileReader.getJsonPath() + "SchemeMasterJson.json";
		private List<SchemeMasterTestData> SchemeMaster;
		//Floating rate Master Master-->Kamalapriya
				private final String FloatingRateMasterDataPath = configFileReader.getJsonPath() + "FloatingRateMasterJson.json";
				private List<FloatingRateMasterTestData> FloatingRateMaster;
				//Deposit Account Master-->Kamalapriya
				private final String DepositAccountMasterDataPath = configFileReader.getJsonPath() + "DepositAccountMasterJson.json";
				private List<DepositAccountTestData> DepositAccountMaster;
				//allocation Master-->Kamalapriya
				private final String AllocationMasterDataPath = configFileReader.getJsonPath() + "AllocationMasterJson.json";
				private List<AllocationMasterTestData> AllocationMaster;
				//Report Master-->Kamalapriya
				private final String ReportMasterDataPath = configFileReader.getJsonPath() + "ReportMasterJson.json";
				private List<ReportMasterTestData> ReportMaster;
				
				//Charge Master-->Kamalapriya
				private final String chargemasterrPath = configFileReader.getJsonPath() + "Charge_MasterJSON.json";
				private List<Charge_Master_Testdata> chargemaster;
				//Application Details Disbursement Makerr-->Kamalapriya
				private final String DisbursementMakerPath = configFileReader.getJsonPath() + "Application_DisbursementMakerJSON.json";
				private List<ApplicationDisbursementMakerTestData> disbursementMaker;
				// Transaction Customer Employment-->Kamalapriya
				private final String CustomerEmploymentDataPath = configFileReader.getJsonPath() + "CustomerEmployementJson.json";
				private List<CustomerEmploymentTestData> CustomerEmployment;
				//CustomerFinancials
			    private final String CustomerFinancialsPath = configFileReader.getJsonPath() + "CustomerFinancial.json";
			    private List<CustomerFinancialsTestData> CustomerFinancialsTestData;
			  //Beneficiary Details- Kamalapriya
			    private final String BeneficaiaryDetailPath = configFileReader.getJsonPath() + "BeneficiaryDetailsJson.json";
			    private List<BeneficiaryDetailTestData> BeneficiaryDetail;
			    // customer employment devesh
			    private final String CustomerEmploymentPath = configFileReader.getJsonPath() + "CustomerEmploymentJSON.json";
				private List<CustomerEmploymentTestDataType> CustomerEmploymentList;
				// ownweship Layout-Kamalapriya
			    private final String OwnershipLayoutPath = configFileReader.getJsonPath() + "OwnershipLayoutJson.json";
				private List<OwnershipLayoutTestData> OwnershipLayoutList;
				
	public JsonConfig() {
		/*
		 * RegisterList = getRegisterData(); LoginList = getLoginList();
		 */

		loginCredentials = getKULSCredentialsList();
		//Fee Master-->Kamalapriya

		FeeMaster = getFeeMasterList();
		//Scheme Master-->Kamalapriya

		SchemeMaster = getSchemeMasterList();
		//Floating Rate Master-->Kamalapriya
		FloatingRateMaster = getFloatingRateMasterList();
		//Deposit account  Master-->Kamalapriya
				DepositAccountMaster = getDepositAccountMasterList();
				//allocation  Master-->Kamalapriya
				AllocationMaster = getAllocationMasterList();
				//ReportMaster -->Kamalapriya
				ReportMaster = getReportMasterList();
//Charge Master-->Kamalapriya
				chargemaster = getchargemaster();
				//Application Details Disbursement Maker-->Kamalapriya
				disbursementMaker = getdisbursementMaker();
				//Transaction Customer Employement-->Kamalapriya
				CustomerEmployment = getCustomerEmployment();
				CustomerFinancialsTestData=getCustomerFinancialsData();
				//Benefixciary details--kamalapriya
				BeneficiaryDetail= getBeneficiaryDetail();
                // employment devesh
				CustomerEmploymentList = getCustomerEmploymentList();
				 // ownwership Layout-Kamalapriya
				OwnershipLayoutList = getOwnershipLayoutList();

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
	//Fee Master-->Kamalapriya
	
	private List<FeeMasterTestData> getFeeMasterList() {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(FeeMasterDataPath));
		reader.setLenient(true);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(FeeMasterDataPath));
			FeeMasterTestData[] credentials = gson.fromJson(bufferReader, FeeMasterTestData[].class);
			return Arrays.asList(credentials);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + FeeMasterDataPath);
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

	//Scheme Master-->Kamalapriya
	
		private List<SchemeMasterTestData> getSchemeMasterList() {
			Gson gson = new Gson();
			JsonReader reader = new JsonReader(new StringReader(SchemeMasterDataPath));
			reader.setLenient(true);
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(SchemeMasterDataPath));
				SchemeMasterTestData[] scheme = gson.fromJson(bufferReader, SchemeMasterTestData[].class);
				return Arrays.asList(scheme);
			} catch (FileNotFoundException e) {
				throw new RuntimeException("Json file not found at path : " + SchemeMasterDataPath);
			} finally {
				try {
					if (bufferReader != null)
						bufferReader.close();
				} catch (IOException ignore) {
				}
			}
		}
		
		//Floating Rate Master-->Kamalapriya
		
			private List<FloatingRateMasterTestData> getFloatingRateMasterList() {
				Gson gson = new Gson();
				JsonReader reader = new JsonReader(new StringReader(FloatingRateMasterDataPath));
				reader.setLenient(true);
				BufferedReader bufferReader = null;
				try {
					bufferReader = new BufferedReader(new FileReader(FloatingRateMasterDataPath));
					FloatingRateMasterTestData[] floating = gson.fromJson(bufferReader, FloatingRateMasterTestData[].class);
					return Arrays.asList(floating);
				} catch (FileNotFoundException e) {
					throw new RuntimeException("Json file not found at path : " + FloatingRateMasterDataPath);
				} finally {
					try {
						if (bufferReader != null)
							bufferReader.close();
					} catch (IOException ignore) {
					}
				}
			}
			
			//Deposit Account Master-->Kamalapriya
			
			private List<DepositAccountTestData> getDepositAccountMasterList() {
				Gson gson = new Gson();
				JsonReader reader = new JsonReader(new StringReader(DepositAccountMasterDataPath));
				reader.setLenient(true);
				BufferedReader bufferReader = null;
				try {
					bufferReader = new BufferedReader(new FileReader(DepositAccountMasterDataPath));
					DepositAccountTestData[] Deposit = gson.fromJson(bufferReader, DepositAccountTestData[].class);
					return Arrays.asList(Deposit);
				} catch (FileNotFoundException e) {
					throw new RuntimeException("Json file not found at path : " + DepositAccountMasterDataPath);
				} finally {
					try {
						if (bufferReader != null)
							bufferReader.close();
					} catch (IOException ignore) {
					}
				}
			}

//Report Master-->Kamalapriya
			
			private List<ReportMasterTestData> getReportMasterList() {
				Gson gson = new Gson();
				JsonReader reader = new JsonReader(new StringReader(ReportMasterDataPath));
				reader.setLenient(true);
				BufferedReader bufferReader = null;
				try {
					bufferReader = new BufferedReader(new FileReader(ReportMasterDataPath));
					ReportMasterTestData[] Report = gson.fromJson(bufferReader, ReportMasterTestData[].class);
					return Arrays.asList(Report);
				} catch (FileNotFoundException e) {
					throw new RuntimeException("Json file not found at path : " + ReportMasterDataPath);
				} finally {
					try {
						if (bufferReader != null)
							bufferReader.close();
					} catch (IOException ignore) {
					}
				}
			}
//Charge Master-->Kamalapriya
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
			//ApplicationDetails Disbursement maker-->Kamalapriya
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
			//Transaction Customer Employment-->Kamalapriya
			private List<CustomerEmploymentTestData> getCustomerEmployment() {
				Gson gson = new Gson();
				JsonReader reader = new JsonReader(new StringReader(CustomerEmploymentDataPath));
				reader.setLenient(true);
				BufferedReader bufferReader = null;
				try {
					bufferReader = new BufferedReader(new FileReader(CustomerEmploymentDataPath));
					CustomerEmploymentTestData[] emp = gson.fromJson(bufferReader, CustomerEmploymentTestData[].class);
					return Arrays.asList(emp);
				} catch (FileNotFoundException e) {
					throw new RuntimeException("Json file not found at path : " + CustomerEmploymentDataPath);
				} finally {
					try {
						if (bufferReader != null)
							bufferReader.close();
					} catch (IOException ignore) {
					}
				}
			}
			
			//CustomerFinancialsData
		    private List<CustomerFinancialsTestData> getCustomerFinancialsData() {
		        Gson gson = new Gson();
		        JsonReader reader = new JsonReader(new StringReader(CustomerFinancialsPath));
		        reader.setLenient(true);
		        BufferedReader bufferReader = null;
		        try {
		            bufferReader = new BufferedReader(new FileReader(CustomerFinancialsPath));
		            CustomerFinancialsTestData[] customerFinancialsData = gson.fromJson(bufferReader,
		            		CustomerFinancialsTestData[].class);
		            return Arrays.asList(customerFinancialsData);
		        } catch (FileNotFoundException e) {
		            throw new RuntimeException("Json file not found at path : " + CustomerFinancialsPath);
		        } finally {
		            try {
		                if (bufferReader != null)
		                    bufferReader.close();
		            } catch (IOException ignore) {
		            }
		        }
		    }
		    
		  //Ownership Layout--Kamalapriya
		    private List<OwnershipLayoutTestData> getOwnershipLayoutList() {
		        Gson gson = new Gson();
		        JsonReader reader = new JsonReader(new StringReader(OwnershipLayoutPath));
		        reader.setLenient(true);
		        BufferedReader bufferReader = null;
		        try {
		            bufferReader = new BufferedReader(new FileReader(OwnershipLayoutPath));
		            OwnershipLayoutTestData[] Ownershiplayout = gson.fromJson(bufferReader,
		            		OwnershipLayoutTestData[].class);
		            return Arrays.asList(Ownershiplayout);
		        } catch (FileNotFoundException e) {
		            throw new RuntimeException("Json file not found at path : " + OwnershipLayoutPath);
		        } finally {
		            try {
		                if (bufferReader != null)
		                    bufferReader.close();
		            } catch (IOException ignore) {
		            }
		        }
		    }
		    
			
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
			   
			  //Beneficiary Details--Kamalapriya
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

	public final KULS_Login_TestDataType getKULSLoginCredentialsByName(String Username) {
		return loginCredentials.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
	}
	//Fee Master-->Kamalapriya
	public final FeeMasterTestData getFeeMasterByName(String Username) {
		return FeeMaster.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
	}
	//Scheme Master-->Kamalapriya
		public final SchemeMasterTestData getSchemeMasterByName(String Username) {
			return SchemeMaster.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
		}
		//Floating Rate Master-->Kamalapriya
				public final FloatingRateMasterTestData getFloatingRateMasterByName(String Username) {
					return FloatingRateMaster.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
				}
				//Deposit account Master-->Kamalapriya
				public final DepositAccountTestData getDepositAccountMasterByName(String Username) {
					return DepositAccountMaster.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
				}
				//Allocation Master-->Kamalapriya
				public final AllocationMasterTestData getAllocationMasterByName(String Username) {
					return AllocationMaster.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
				}
				//Report Master-->Kamalapriya
				public final ReportMasterTestData getReportMasterByName(String Username) {
					return ReportMaster.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
				}
				//Charge Master-->Kamalapriya
				public final Charge_Master_Testdata getchargemasterListByName(String User) {
				return chargemaster.stream().filter(x -> x.UserType.equalsIgnoreCase(User)).findAny().get();
			}
				//Application Details Disbursement Maker-->Kamalapriya
				public final ApplicationDisbursementMakerTestData getApplication_DisbursementMakerListByName(String User) {
				return disbursementMaker.stream().filter(x -> x.User.equalsIgnoreCase(User)).findAny().get();
			}
				//Transaction Customer Employment-->Kamalapriya
				public final CustomerEmploymentTestData getCustomerEmploymentListByName(String User) {
				return CustomerEmployment.stream().filter(x -> x.User.equalsIgnoreCase(User)).findAny().get();
			}
				// CustomerFinancialTestData
                public final testDataType.CustomerFinancialsTestData getCustomerFinancialsDataListByName(String Username) {
                    return CustomerFinancialsTestData.stream().filter(x -> x.UserType.equalsIgnoreCase(Username)).findAny().get();
                    }
             // Beneficiary Detail-Kamalapriya
                public final testDataType.BeneficiaryDetailTestData getBeneficiaryDetailListByName(String Username) {
                    return BeneficiaryDetail.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
                    }
                // customer employment devesh
                public final CustomerEmploymentTestDataType getCustomerEmploymentByName(String Username) {
            		return CustomerEmploymentList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
            	}
                // Ownership Layout-Kamalapriya
                public final OwnershipLayoutTestData getOwnwershipLayoutByName(String Username) {
            		return OwnershipLayoutList.stream().filter(x -> x.User.equalsIgnoreCase(Username)).findAny().get();
            	}
}