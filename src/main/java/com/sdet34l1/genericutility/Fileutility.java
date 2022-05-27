package com.sdet34l1.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * 
 * @author Admin this class contains only java specific reusable methods
 *
 */

public class Fileutility
{
	static Properties property;
	/**
	 * This method  is used to open the property file
	 * @throws IOException 
	 * 
	 *
	 *
	 */

	public static void openPropertyFile(String filepath) throws IOException
	{
	 FileInputStream fis = new FileInputStream(filepath);
	property =new Properties();
	property.load(fis);
	}
	public static String getDataFromPropertyFile(String key) throws IOException
	{
	
	String value = property.getProperty(key);
	return value;
	

}
}
