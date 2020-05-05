package org.testing.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testing.Utilities.JSONHelper;
import org.testing.Utilities.JSONLoadForBody;

//Update Type in JSON

public class TC5 {
	
	public void TestCase5() throws IOException
	{
		
File f= new File("D:\\Java_1\\TestDrivenFrameWork\\target\\test-classes\\updatejson");
		
		FileReader fr= new FileReader(f);
		FileInputStream fi= new FileInputStream(f);
		JSONTokener j= new JSONTokener(fi);
		JSONObject jj= new JSONObject(j);
		
		String s =jj.toString();
		
		
	JSONHelper.JSONUpdate(s, "type", "Samsung");  		
	
		
	}
	

}
