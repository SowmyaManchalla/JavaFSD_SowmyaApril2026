package pac1;

import java.util.Scanner;

public class TC_persondetailsScanner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName = sc.nextLine();
		
		System.out.println("Enter Last Name:");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Gender (M/F):");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		
		System.out.println("Enter Weight:");
		double weight = sc.nextDouble();
		
		System.out.println("\nPerson details");
		
		System.out.println("First Name:" +firstName);
		System.out.println("Last Name:" +lastName);
		System.out.println("Gender:" +gender);
		System.out.println("Age:" +age);
		System.out.println("Weight:" +weight);
		
		sc.close();

	}

}
