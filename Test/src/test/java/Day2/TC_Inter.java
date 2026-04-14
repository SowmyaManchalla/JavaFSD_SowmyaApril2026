package Day2;

public interface TC_Inter {
	
	default void display3()
	{
		System.out.println("This is default method from interface");
	}
	
	static void display1()
	{
		System.out.println("This is static method from interface");
	}
	
	void display();
	
	
	int minbalance = 100;


}
