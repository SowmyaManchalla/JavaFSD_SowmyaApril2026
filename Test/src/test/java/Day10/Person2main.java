package Day10;

public class Person2main {
	
	public static void main(String[] args)
		{
			try
			{
				Person2 p2 = new Person2(" Divya " ,"Bharathi" , "Female" ,25);
				p2.display();
			}
			catch(InvalidNameException e)
			{
				System.out.println("Error:"+e.getMessage());
			}
		}
	}


