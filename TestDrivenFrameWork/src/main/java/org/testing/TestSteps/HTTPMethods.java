package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
	
	Properties pr;
	public HTTPMethods (Properties pr)
	{
		this.pr = pr;
	}
	
	public Response PostRequest(String body_data,String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body_data)
		.when()
		.post(pr.getProperty(uriKey));
		
		return res;
	}

	
	public Response GetRequest(String id,String uriKey)
	
	{
		String base=pr.getProperty(uriKey);
		String actual_uri=base+"/"+id;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(actual_uri);
		
		return res;
	}
	
public Response DeleteRequest(String age,String uriKey)
	
	{
		String base=pr.getProperty(uriKey);
		String actual_uri=base+"/"+age;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(actual_uri);
		
		return res;
	}
}
