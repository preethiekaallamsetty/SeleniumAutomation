package basicTest;

import utility.ReadConfig;

public class NOPCommTest {

	public static void main(String[] args) throws Exception {
		
		
		
		ReadConfig conf = new ReadConfig();
		
		
		
		String applicationURL = conf.getApplicationURL();
		
		//launch application
		System.out.println("Execution eviornment: QA/PROD" );
		System.out.println("Application URL: " + applicationURL);
		
		
		//conf.prop.getProperty("");
		
		
		
		System.out.println("login test case");
		System.out.println("user details "+ conf.getEmail());
		
	}
	
	
	
	

}
