package Day3;

import java.util.Scanner;

enum Gender
{
	M,F
}

class PersonG
{
	String name;
	Gender gender;
	
	PersonG(String name)
	{
		this.name=name;
		
		if(name.equals("Divya Bharathi"))
		{
			gender=Gender.F;
		}
		else
		{
			gender=Gender.M;
		}
	}
	
	void display()
	{
		System.out.println("Name:" +name);
		System.out.println("Gender:" +gender);
	}
}

public class EnumGender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name = sc.nextLine();
  
		PersonG p = new PersonG(name);
		p.display();
	}

}
