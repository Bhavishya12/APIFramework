package org.testing.TestCases;

import static com.jayway.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.propertiesLoad;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

// Update Record

public class TC3 {
	
	public void TestCase3() throws IOException
	{
		File f= new File("D:\\Java_1\\TestDrivenFrameWork\\json");
		
		FileReader fr= new FileReader(f);
		FileInputStream fi= new FileInputStream(f);
		JSONTokener j= new JSONTokener(fi);
		JSONObject jj= new JSONObject(j);
		
		String s =jj.toString();
		
	
	JSONObject obj= new JSONObject(s);

	obj.put("firstname", "Bhanu");
		
		
		System.out.println("Updated Data is "+obj.toString());
		
		
	}
}
		
		
	
    

