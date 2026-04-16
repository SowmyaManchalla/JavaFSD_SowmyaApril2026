package Day4;

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str = sc.next();
		
		for(int i =0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>=str.charAt(i+1))
			{
				System.out.println("Not a positive string");
			    sc.close();
			    return;
			}
		}
		System.out.println("Positive String");
		sc.close();

}
}

