package Day4;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.println("1.Adding string to itself");
      System.out.println("2.Replace odd positions with #");
      System.out.println("3.Remove duplicates");
      System.out.println("4.Uppercase odd positions change");
      
      int choice = sc.nextInt();
      String str,result="";
      
      switch(choice)
      {
      case 1:
      {
    	  str = "hello";
    	  System.out.println(str+str);
    	  break;
      }
  
      case 2:
      {
    	  str="Welcome";
    	  StringBuffer sb1 = new StringBuffer();
    	  for(int i =0; i<str.length();i++)
    		  if(i%2==0)
    		  {
    			  sb1.append("#");
    		  }else {
    			  sb1.append(str.charAt(i));
      }
     
      System.out.println(sb1.toString());
      break;
      }
      
      case 3:
      {
    	  str = "hello";
    	  StringBuffer sb2 = new StringBuffer();
    	  for(int i =0;i<str.length();i++)
    	  {
    		  char ch = str.charAt(i);
    	  if(sb2.indexOf(String.valueOf(ch))==-1)
    	  {
    		  sb2.append(ch);
    	  }
    	  }
	System.out.println(sb2);
	break;
      }
	
	  case 4:
	  {
		  str = "hello";
		  StringBuffer sb3 = new StringBuffer();
		  for(int i =0; i<str.length();i++)
		  {
			  char ch = str.charAt(i);
		     if(i%2==0)
		     {
		    	 sb3.append(Character.toUpperCase(ch));
		     }else {
		    		 sb3.append(ch);
		     }
		  }
		     System.out.println(sb3);
		     break;
	  }
		     
		     default:
		    	 System.out.println("Incorrect");
}
sc.close();
}
}
