package org.testing.Utilities;

import java.util.regex.Pattern;

public class JSONVariableInsertion {
	
	public static String jsonInsertion(String data,String VariableName,Object variableValue)
	{
		data = data.replaceAll(Pattern.quote("{{"+VariableName+"}}"), variableValue.toString());
		return data;
	}

}
