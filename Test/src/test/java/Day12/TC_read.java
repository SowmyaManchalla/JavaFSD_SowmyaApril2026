package Day12;

import java.util.Scanner;

public class TC_read {
	
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		char c;
		
		System.out.println("Enter a string:");
		try
		{
			while((c=(char) System.in.read())!='\n')
          {
	        sb.append(c);
          }
          catch(Exception e)
          {
        	  System.out.println("Error while reading:"+e.getMessage());  
        	  
          }
          String s = new String(sb);
          System.out.println("You entered:"+s);
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your name:");
          String s1 = sc.nextLine();
          System.out.println("Your name is:"+s1);
          }
	}
}
