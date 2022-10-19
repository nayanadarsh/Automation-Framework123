package UtilityPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	


	public Properties LoadConfig() {
		Properties prop=new Properties();
		try {
			
			FileInputStream fis=new FileInputStream("/Users/nayanadarsh/eclipse-workspace/TestFramework"
					+ "/src/main/java/ConfigPackage/Config.properties");
			prop.load(fis);	
		}

		catch (IOException e) {
			e.printStackTrace();

		}

		return prop;

	}

	public String getURL(Properties prop) {
		String url=prop.getProperty("url");
		return url;
	}

	public String getusername(Properties prop) {
		String user=prop.getProperty("username");
		return user;
	}

	public String getpassword(Properties prop) {
		String pass=prop.getProperty("password");
		return pass;
	}
}	

