package Day5;

import java.time.LocalDate;
import java.util.Scanner;

public class Warranty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter purchase date(yyyy-mm-dd)");
		String inputDate = sc.nextLine();
		
	    System.out.println("Enter no of warranty years:");
	    int years = sc.nextInt();
	    
	    System.out.println("Enter no of warranty months:");
	    int months = sc.nextInt();
	    
	    LocalDate purchaseDate = LocalDate.parse(inputDate);
	    
	    LocalDate expiryDate = purchaseDate.plusYears(years).plusMonths(months);
	    
	    System.out.println("Warranty expiry date:"+expiryDate);
	    sc.close();
	}

}
