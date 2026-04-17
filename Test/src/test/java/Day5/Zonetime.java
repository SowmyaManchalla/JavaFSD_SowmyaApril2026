package Day5;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zonetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Choose zone:");
      System.out.println("1.America/New York");
      System.out.println("2.Europe/London");
      System.out.println("3.Asia/Tokyo");
      System.out.println("4.US/Pacific");
      System.out.println("5.Africa/Cairo");
      System.out.println("6.Australia/Syndey");
      
      int choice = sc.nextInt();
      
      switch(choice)
      {
      case 1:
    	  System.out.println("Current date & time:"+ ZonedDateTime.now(ZoneId.of("America/New_York")));
    	  break;
      case 2:
    	  System.out.println("Current date & time:" +ZonedDateTime.now(ZoneId.of("Europe/London")));
    	  break;
      case 3: 
    	  System.out.println("Current date & time:" +ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
    	  break;
      case 4: 
    	  System.out.println("Current date & time:" +ZonedDateTime.now(ZoneId.of("US/Pacific")));
    	  break;
      case 5:
    	  System.out.println("Current date & time:" +ZonedDateTime.now(ZoneId.of("Africa/Cairo")));
    	  break;
      case 6:
    	  System.out.println("Current date & time:" +ZonedDateTime.now(ZoneId.of("Australia/Syndey")));
    	  break;
    	 
    	  default:
    		  System.out.println("Incorrect choice");
      }
      sc.close();
	}
}

