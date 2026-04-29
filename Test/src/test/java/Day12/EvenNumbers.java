package Day12;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  File file = new File("numbers.txt");
    	  Scanner sc = new Scanner(file);
    	  
    	  sc.useDelimiter(",");
    	  
    	  System.out.println("Even numbers are:");
    	  
    	  while(sc.hasNext())
    	  {
    		  int num = sc.nextInt();
    		  
    		  if(num%2==0)
    		  {
    			  System.out.println(num);
    		  }
    	  }
    	  sc.close();
      }
      catch(FileNotFoundException e)
      {
    	  System.out.println("File not found");
      }
	}
}
