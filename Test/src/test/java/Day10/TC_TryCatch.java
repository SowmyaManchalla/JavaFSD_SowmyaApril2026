package Day10;

public class TC_TryCatch {
	
	public static void main(String[] args)
	{
		
		try
		{
			int[] arr = new int[3];
			arr[5]=10;
			
			int result = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
	}

}
