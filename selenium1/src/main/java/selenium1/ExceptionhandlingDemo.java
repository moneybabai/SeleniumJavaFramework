package selenium1;

public class ExceptionhandlingDemo {
	
	public static void main(String[] args) {
		
		
		try {
		System.out.println("Hello Fans");
		
		int  i =1/0;
		
		System.out.println("Hello OnlyFans");
		
		    }
		
		catch(Exception exp) {
			
			System.out.println("You are caught");
			
			// with this we will get why there is an error
			System.out.println("Message is : "+exp.getMessage());
			
			System.out.println("Cause is : "+exp.getCause());
			//exp.printStackTrace();
		}
		
		finally {
			System.out.println("In Finally Block");
			
		}
		
		
	}
	 
	

}
