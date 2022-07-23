package resources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReaderWriter {
	String path = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Reader.json";
	String path2 = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Referance.json";
	String path3 = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Referance2.json";
	String path4 = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Referance3.json";

	JSONObject jsonobject = new JSONObject();
	JSONObject ref2object = new JSONObject();
	JSONObject ref3object = new JSONObject();
	
	FileWriter filewriter;

	public void addData(String revID) throws IOException {
		jsonobject.put("ReviewerID", revID);
		filewriter = new FileWriter(path);
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();
	}

	
    public String readdata() throws IOException, ParseException
    {
    	JSONParser jsonparser=new JSONParser();
    	FileReader filereader=new FileReader(path);
        Object obj=jsonparser.parse(filereader);
        jsonobject=(JSONObject) obj;
       String reviewerID= (String) jsonobject.get("ReviewerID");
	return reviewerID;
    }
    //---reference1---//
	public void addReferanceData(String data) throws IOException {
		jsonobject.put("Referance", data);
		filewriter = new FileWriter(path2);
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();
	}
    public String readReferancedata() throws IOException, ParseException
    {
    	JSONParser jsonparser=new JSONParser();
    	FileReader filereader=new FileReader(path2);
        Object obj=jsonparser.parse(filereader);
        jsonobject=(JSONObject) obj;
       String reviewerID= (String) jsonobject.get("Referance");
	return reviewerID;
    }
    //---reference2---//
    public void addReferance2Data(String ref2) throws IOException {
    	ref2object.put("Referance2", ref2);
    	filewriter = new FileWriter(path3);
    	filewriter.write(ref2object.toJSONString());
    	filewriter.close();
    }
    public String readReferance2data() throws IOException, ParseException
    {
    	JSONParser jsonparser=new JSONParser();
    	FileReader filereader=new FileReader(path3);
    	Object obj=jsonparser.parse(filereader);
    	ref2object=(JSONObject) obj;
    	String reference2= (String) ref2object.get("Referance2");
    	return reference2;
    }
    //---reference3---//
    public void addReferance3Data(String ref3) throws IOException {
    	ref3object.put("Referance3", ref3);
    	filewriter = new FileWriter(path4);
    	filewriter.write(ref3object.toJSONString());
    	filewriter.close();
    }
    public String readReferance3data() throws IOException, ParseException
    {
    	JSONParser jsonparser=new JSONParser();
    	FileReader filereader=new FileReader(path4);
    	Object obj=jsonparser.parse(filereader);
    	ref3object=(JSONObject) obj;
    	String reference3= (String) ref3object.get("Referance3");
    	return reference3;
    }
}