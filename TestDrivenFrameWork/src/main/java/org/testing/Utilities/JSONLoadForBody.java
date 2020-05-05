package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONLoadForBody {
	
	public static String jsonLoad(String filePath) throws IOException
	{
		File f = new File(filePath);
		FileInputStream fi= new FileInputStream(f);
		JSONTokener js= new JSONTokener(fi);
		JSONObject j = new JSONObject(js);
		return j.toString();
	}

}
