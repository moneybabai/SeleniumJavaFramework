package selenium1;

public class ExceptionhandlingDemo2 {
	
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	public static void demo() throws Exception {
		
		
		// here the exception not handled but thrown 
		// to the main class
		System.out.println("Entered..!");
		
		// we can deliberately throw an exception
		throw new ArithmeticException("Not a valid operation");
		//int i = 1/10;
		
		
		//System.out.println("Completed..!");
		
		
	}

}
