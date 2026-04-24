package Day10;

public class Transactions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Person3 p3 = new Person3("Divya", "Bharathi", 14);

		System.out.println("Person created successfully");
		}

	catch(InvalidAgeException e)
	{
		System.out.println("Error:" +e.getMessage());
	}

}
}
