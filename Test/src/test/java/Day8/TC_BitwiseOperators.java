package Day8;

public class TC_BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int num=4;
		if((num&1)==0)
		{
			System.out.println("Even:");
		}
		else
			System.out.println("odd");
		
		int permissions=0;
		System.out.println("permission");
		permissions = permissions|1;
		System.out.println("After enabling the feature 1:"+permissions);
		permissions = permissions|2;
		System.out.println("After enabling the feature 2:"+permissions);
		
		int a=10;
		int b=30;
		
		int result = a^b;
		
		System.out.println(result);
		//10
		
		
		int s1=10;
		int ps1=2;
		int r1=s1>>ps1;
		
		System.out.println("result:"+r1);
		
		System.out.println("Binary of original number:"+Integer.toBinaryString(s1));
		System.out.println("Binary after right shift:"+Integer.toBinaryString(r1));
		
		int d1=20;
		int d2=10;
		
		d1|=d2;
		
		
		//left shift
	}

}
