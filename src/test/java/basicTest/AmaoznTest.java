package basicTest;

public class AmaoznTest {

	public static void main(String[] args) {
		
		
		IBMAssert obj = new IBMAssert();
		
		//application title
		obj.assertEqual("Amazon.in : iphone 14 pro", "Amazon.in : iphone 14");
		System.out.println("--------------------------------------------------");
		obj.assertEqual("Amazon.in : iphone 14 pro....", "Amazon.in : iphone 14.....", "Validation of application title get failed");
		
		
		System.out.println("==========================================");
		
		

	}

}
