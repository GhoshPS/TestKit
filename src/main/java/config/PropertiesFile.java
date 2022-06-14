package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop= new Properties();//It should available to all the functions

	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		//readPropertiesFile();
	}

	
	public static void readPropertiesFile() {
		//1 get data from properties file
		//Properties prop= new Properties();//create an object of properties class
		
		//create an object for input string
		try {
			InputStream inputStream = new FileInputStream("/Users/pritishankar.ghosh/eclipse-workspace/Selenium_Automation_Training/src/main/java/config/config.properties");
		    prop.load(inputStream);//load property file
		    System.out.println(prop.getProperty("browser"));//get value from property
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
//set data in properties file	
	
	public static void writePropertiesFile() {	
      
		try {
			OutputStream output = new FileOutputStream("/Users/pritishankar.ghosh/eclipse-workspace/Selenium_Automation_Training/src/main/java/config/config.properties");
		   // prop.setProperty("browser", "uc");
		    prop.setProperty("result","pass");
		    prop.store(output, null);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}