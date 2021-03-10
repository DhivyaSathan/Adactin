package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;
	public ConfigurationReader() throws IOException {
		
		File f = new File("C:/Users/dhivy/eclipse-workspace/com.automation/configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);
		 
		
	}
	public static String getBrowser() {
		String browsername = ps.getProperty("browser");
		return browsername;

	}
	public static String getUrl() {
		String url = ps.getProperty("url");
		return url;
		

	}
	
	
	
	
	
	
}
