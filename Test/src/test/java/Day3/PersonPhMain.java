package Day3;

import java.util.Scanner;

public class PersonPhMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String firstName = sc.nextLine();
		
		System.out.println("Enter last name:");
		String lastName = sc.nextLine();
		
		System.out.println("Enter Gender:");
		char gender = sc.next().charAt(0);
		
		PersonPh p = new PersonPh(firstName, lastName,gender);
		
		System.out.println("Enter Phone number:");
	    String phoneNumber = sc.next();
		
		p.setPhoneNumber(phoneNumber);
		p.displayDetails();
		
		sc.close();
		}
}

