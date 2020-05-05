package org.testing.Utilities;

import org.json.JSONObject;

public class JSONHelper {
	
	public static String JSONUpdate(String jsonData,String SearchValue,String InsertValue)
	{
	JSONObject jb = new JSONObject(jsonData);
	
	jb.get(SearchValue);
	jb.put(InsertValue, jsonData);
	return  InsertValue;
		

	}
	
	

}
