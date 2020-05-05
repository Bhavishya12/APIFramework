package org.testing.Utilities;

import com.jayway.restassured.response.Response;

public class JsonParsingusingJsonPath {
	
	public static String jsonparse(Response res,String jsonPath)
	{
     return res.jsonPath().getString(jsonPath);
		
	}

}
