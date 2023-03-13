package configExample;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	
	public static void main(String[] args) throws Exception {
		
		

		//filelocation - relative path
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		
		Properties prop = new Properties();
		
		
		prop.load(fis);
		
		String url = prop.getProperty("appURL_qa");
		String prod_url = prop.getProperty("appURL_prod");
		
		System.out.println("Application URL: " + url);
		System.out.println("Application URL prod: " + prod_url);

	}

	



}
