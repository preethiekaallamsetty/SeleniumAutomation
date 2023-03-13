package basicTest;

public class IBMAssert {

	// method overloading
	// no of arg ---different
	// arg type - different

	public void assertEqual(String expectedValue, String actualValue) {

		if (expectedValue.equalsIgnoreCase(actualValue)) {

			System.out.println("Validation pass !!");

		}

		else {

			System.out.println("Validation failed !!");
			System.out.println("Actual Value : " + actualValue);
		}

	}
	
	public static void assertEqual(String expectedValue, String actualValue, int value) {

		if (expectedValue.equalsIgnoreCase(actualValue)) {

			System.out.println("Validation pass !!");

		}

		else {

			System.out.println("Validation failed !!");
			System.out.println("Actual Value : " + actualValue);
			System.out.println("Value are : " + value);
		}

	}

	public void assertEqual(String expectedValue, String actualValue, String errorMessage) {

		if (expectedValue.equalsIgnoreCase(actualValue)) {

			System.out.println("Validation pass !!");

		}

		else {

			System.out.println("Validation failed !!");
			System.out.println("Actual Value : " + actualValue);
			System.out.println("Error Message: " + errorMessage);
		}

	}

	
	
	public void assertEqual(int expectedValue, int actualValue) {

		if (expectedValue == actualValue) {

			System.out.println("Validation pass !!");

		}

		else {

			System.out.println("Validation failed !!");
			System.out.println("Actual Value : " + actualValue);
		}

	}

}
