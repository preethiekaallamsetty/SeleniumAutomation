package basicTest;

public class GoogleTest {

	public static void main(String[] args) {
		
		
		
		
		String actualURL = "https://www.google.com/";
		
		String expectedURL = "https://www.google.in/";
		
		
		//create an object		
		//obj.assertEqual
		
		IBMAssert.assertEqual(expectedURL, actualURL, 101);
		
		
		
	}

}
