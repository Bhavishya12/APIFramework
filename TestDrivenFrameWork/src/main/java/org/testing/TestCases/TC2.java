package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.propertiesLoad;

import com.jayway.restassured.response.Response;

public class TC2 {
	
	public void testcase2() throws IOException
	{
		Properties pr = propertiesLoad.properties();
		HTTPMethods http = new HTTPMethods(pr);
		Response re=http.GetRequest(TC1.id, "QA_URI");
		
		System.out.println("Response of TestCase2");
		System.out.println(re.asString());
		
		ResponseValidation.ResponseStatusCodeValidation(re, 200);
		ResponseValidation.ResponseDataValidationusingJsonPath(re, "Bhavishya", "firstname");
	}

}
