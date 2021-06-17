package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");


	public static void main(String[]args){

		getProperties();
		setProperties();
		getProperties();

	}
	// here we are getting values from .properties file
	public static void getProperties() {

		try {
			//create a properties class 

			InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			prop.load(input); //now our properties file is available in our java file
			String browser = prop.getProperty("browser"); //we are reading from the .property file 
			System.out.println(browser);
            PropertiesexampleTestNG.browserName=browser;

		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	// here we are inserting values to .properties file
	public static void setProperties() {

		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);
			
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
