package Day8;

public class TC_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10+5;
		
		
		
		int x=10;
		int y=30;
		
		//System.out.println(x&y);
		//System.out.println(x|y);
		System.out.println(x^y);
		
		int a[] = {2,3,5,2,6,7,2};
		int result=0;
		for(int num:a)
		{
			result = result^num;
		}
		
	System.out.println("Unique numbers:" +result);
	
	boolean isformvalid=false;
	
	if(isformvalid)
	{
		System.out.println("isformvalid");
	}
	
	if(9==9)
	{
		System.out.println("equal");
	}
	int num1=8;
	String result1 = (num%2==0)?
			"Even":"odd";//condition?true:false
	System.out.println(result1);

}


