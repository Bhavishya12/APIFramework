package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidation {
	
	public static void ResponseStatusCodeValidation(Response res,int expectedStatusCode)
	{
		System.out.println("Actual status code "+res.statusCode());
		Assert.assertEquals(res.getStatusCode(), expectedStatusCode);
	}

	
	public static void ResponseDataValidationusingJsonPath(Response res,String expectedData,String jsonPath)
	{
		String actual_data=res.jsonPath().get(jsonPath);
		
		Assert.assertEquals(actual_data, expectedData);
	}
}
