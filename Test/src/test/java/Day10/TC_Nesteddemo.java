package Day10;

public class TC_Nesteddemo {

	public static void main(String arg[]) {
		// TODO Auto-generated method stub
		try
		{
			int a = arg.length;
			int b = 10/a;
			System.out.println("a="+a);
			try
			{
				if(a==1)
					a=a/a-a;
				    if(a==2)
				    {
				    	int c[] = {1};
				    	c[42] = 99;
				    	}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index out of bounds:"+e);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divided by 0:"+e);
			}
		}
		finally
		{
			System.out.println("Finally block must be executed");
		}
		
	}

}
