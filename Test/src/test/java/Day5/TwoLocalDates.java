package Day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TwoLocalDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first date(yyyy-mm-dd):");
        String input1 = sc.nextLine();
        System.out.println("Enter second date(yyyy-mm-dd):");
        String input2 = sc.nextLine();
        
        	LocalDate date1=LocalDate.parse(input1);
        	LocalDate date2=LocalDate.parse(input2);
        	
        	int result = date1.compareTo(date2);
        	Period diff;
        	
        	switch(result)
        	{
        	case 0:
        		System.out.println("Both dates are same");
        		return;
        	default:
        		System.out.println("Both dates are different");
        		if(result<0)
        		{
        			diff=Period.between(date1, date2);
        		}
        		else
        		{
        			diff=Period.between(date2, date1);
        		}
        	}
        System.out.println("Duration:");
        System.out.println(diff.getYears()+"Years");
        System.out.println(diff.getMonths()+"Months");
        System.out.println(diff.getDays()+"Days");
	}

}
