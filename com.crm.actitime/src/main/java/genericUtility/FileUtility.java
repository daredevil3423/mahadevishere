package genericUtility;

import java.util.Properties;

public class FileUtility {
   
	public String fetchDataFromProperFile(String key)
	FileInputStream fis = new FileInputStream("");
	Properties property = new Properties();
	property.load(fis );
	
	return property.getProperty(key);
	
}}

