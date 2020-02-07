package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Library implements IAuto_Constant{
	
	public static String getPropertyValue(String propertyName) {
		String propertyvalue="";
		try {
			FileInputStream flib = new FileInputStream(CONFIG_FILE_PATH);
			Properties prop = new Properties();
			prop.load(flib);
		    propertyvalue = prop.getProperty(propertyName);
		} catch (Exception e) {
		}
		
		return propertyvalue;
	}

}
