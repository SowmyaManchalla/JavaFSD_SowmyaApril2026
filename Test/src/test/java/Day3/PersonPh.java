package Day3;

public class PersonPh {
	
	private String firstName;
	private String lastName;
	private char gender;
	private String phoneNumber;
	
	public PersonPh(String firstName, String lastName,char gender)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender=gender;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public void displayDetails()
	{
		System.out.println("Person details");
		System.out.println("-------------------------");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gender: " + gender);
		System.out.println("Phone Number: " + phoneNumber);	
		
	}
}