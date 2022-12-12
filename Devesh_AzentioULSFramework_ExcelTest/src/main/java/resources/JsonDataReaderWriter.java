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

	JSONObject jsonobject = new JSONObject();
	FileWriter filewriter;

	public void addData(String cheID) throws IOException {
		jsonobject.put("CheckerID", cheID);
		filewriter = new FileWriter(path);
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();
	}

	public String readdata() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader filereader = new FileReader(path);
		Object obj = jsonparser.parse(filereader);
		jsonobject = (JSONObject) obj;
		String CheckerID = (String) jsonobject.get("CheckerID");
		return CheckerID;
	}

	// ---reference1---//
	public void addReferanceData(String data) throws IOException {
		jsonobject.put("Referance", data);
		filewriter = new FileWriter(path2);
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();
	}

	public String readReferancedata() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader filereader = new FileReader(path2);
		Object obj = jsonparser.parse(filereader);
		jsonobject = (JSONObject) obj;
		String Referance = (String) jsonobject.get("Referance");
		return Referance;
	}
    
}