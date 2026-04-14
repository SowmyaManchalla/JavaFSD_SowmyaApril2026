package pac1;

public class TC_CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length == 0)
		{
			System.out.println("Please provide a number as command line argument");
			return;
		}
		
		int num = Integer.parseInt(args[0]);
		
		if(num>0)
		{
			System.out.println(num+ " is a positive number");
		}
        
		else if(num<0)
		{
			System.out.println(num+ " is a negative number");
			}
		else
		{
			System.out.println("The number is zero");
		}
	}

}
