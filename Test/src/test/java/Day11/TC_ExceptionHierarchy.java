package Day11;

public class TC_ExceptionHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a= 10/0;
				
		}
		catch(ArithmeticException e) // first one will be executed by default -- preference given to child first and then onlyparent
		{
			System.out.println("Arithmetic Exception caught" +e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime exception caught" +e.getMessage());
		}
       catch(Exception e)
		{
    	   System.out.println("General exception caught" +e.getMessage());
		}
	}

}
