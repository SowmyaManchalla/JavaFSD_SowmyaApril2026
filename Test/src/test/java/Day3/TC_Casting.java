package Day3;

class Animal
{
	void sound()
	{
		System.out.println("animal sound");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog barks");
	}
}

public class TC_Casting {
	
	public static void main(String[] args)
	{
		Animal obj = new Dog();
		if(obj instanceof Animal)
		{
			//obj.sound();
			Dog d = (Dog)obj;
			//obj.bark();-- upcasting 
			d.sound();
			d.bark();
		}
	}

}
