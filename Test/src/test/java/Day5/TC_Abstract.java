package Day5;

abstract class animal
{
	abstract void sound();
	
	void sleep() {
		System.out.println("sleeping");
	}
}

class dog extends animal
{
	void sound()
	{
		System.out.println("sound...");
	}
}
public class TC_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       animal a = new dog();
       a.sound();
       a.sleep();
	}

}


--------------

abstract class animal
{
	int age;
	animal(int age)
	{
		this.animal=animal;
		System.out.println("Animal constructor");
		System.out.println();
	}
}

abstract void sound();

sleep()


------

//class Dog extends animal
{
	dog(int age)
	{
		super(age);
	}
	
	void sound()
	{
		
	}
	}
{
	
}