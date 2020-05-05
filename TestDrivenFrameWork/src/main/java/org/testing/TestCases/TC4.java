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
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

// Delete Record

public class TC4 {
	String age;

	public void TestCase4() throws IOException 
	{
		Properties pr = propertiesLoad.properties();
		HTTPMethods http = new HTTPMethods(pr);
		Response res=http.DeleteRequest(age, "QA_URI");
		
		
		ResponseValidation.ResponseStatusCodeValidation(res, 200);
		
	}


}
