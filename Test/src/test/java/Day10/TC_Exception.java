package Day10;

public class TC_Exception {

	public static void main(String[] args)
	{
		//int a = 10/0;  //error - exception handling - program stops here 
		//System.out.println(a);
		//System.out.println("Hello");
		try
		{
		int a =10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		finally
		{
			System.out.println("Finally block must be executed");
		}
		
		System.out.println("Hello");
		try
		{
		String str = null;
		str.equals("Hello");
		}
		catch(NullPointerException e)
		{
			System.out.println("str is null");
		}
		System.out.println("after null pointer exception");
	}
}
