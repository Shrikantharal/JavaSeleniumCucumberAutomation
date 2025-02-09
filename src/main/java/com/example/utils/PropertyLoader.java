package com.example.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader 
{
	public static Properties loadProperty(String fileName) throws IOException 
	{
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream(
		FileUtility.getFilePath(fileName));
		properties.load(fis);
		return properties;
	}
}
