package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	public Properties prop;

	public ReadConfig() throws Exception {

		FileInputStream fis = new FileInputStream(".\\data\\config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getApplicationURL() {

		String url = prop.getProperty("appURL_qa");
		return url;

	}

	public String getApplicationURL_prod() {

		return prop.getProperty("appURL_prod");

	}
	
	public String getEmail() {

		return prop.getProperty("userName");

	}
	
	public String getPassword() {

		return prop.getProperty("password");

	}

}
