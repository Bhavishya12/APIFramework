package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JSONLoadForBody;
import org.testing.Utilities.JSONVariableInsertion;
import org.testing.Utilities.propertiesLoad;

import com.jayway.restassured.response.Response;

public class TC1usingexistingJSONFile {
	
public static void main(String[] args) throws IOException {
	
	String data = JSONLoadForBody.jsonLoad("D:\\Java_1\\TestDrivenFrameWork\\json");
	
	Random r= new Random(); //Generate Random number to avoid changing ID value everytime
    int random_number = r.nextInt();
	
     data=JSONVariableInsertion.jsonInsertion(data,"id",random_number);
	System.out.println(data);
     Properties pr = propertiesLoad.properties();
     
    HTTPMethods http = new HTTPMethods(pr);
	Response re= http.PostRequest(data,"QA_URI");
	ResponseValidation.ResponseStatusCodeValidation(re, 201);
	ResponseValidation.ResponseDataValidationusingJsonPath(re, "Testing", "firstname");
}

}
