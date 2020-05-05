package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//This method will load the properties File and retuen the Properties Object

public class propertiesLoad {
	
	public static Properties properties() throws IOException
	{
		File F= new File("D:\\Java_1\\TestDrivenFrameWork\\environment.properties");
		FileInputStream fi= new FileInputStream(F);
		Properties pr= new Properties();
		pr.load(fi);
		return pr;    //Returning Properties Object
			
	}

}
