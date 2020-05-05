package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JsonParsingusingJsonPath;
import org.testing.Utilities.propertiesLoad;

import com.jayway.restassured.response.Response;

//TC-1:Post Request
//For Post Request we need data for body
//Body we can create using 3 ways: POJO, org.JSON, existing JSON File
//Using org.JSON body creation approach

public class TC1 {
	static String id;
    public  void testcase1() throws IOException
  {
	Random r= new Random(); //Generate Random number to avoid changing ID value everytime
	int random_number = r.nextInt();

	JSONObject data = new JSONObject();
	data.put("id", random_number);
	data.put("firstname", "Bhavishya");
	data.put("lastname", "Kaushik");
	data.put("age", "28");
	
	Properties pr = propertiesLoad.properties();
	
	HTTPMethods httpmethod = new HTTPMethods(pr);
	Response res= httpmethod.PostRequest(data.toString(),"QA_URI");
	ResponseValidation.ResponseStatusCodeValidation(res, 201);
	ResponseValidation.ResponseDataValidationusingJsonPath(res, "Bhavishya", "firstname");
	
	id = JsonParsingusingJsonPath.jsonparse(res, "id");
	
	
  }
	
	
	
}
