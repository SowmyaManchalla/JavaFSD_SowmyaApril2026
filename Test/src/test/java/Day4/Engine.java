package Day4;

public class Engine {
	
	void start()
	{
		System.out.println("Engine started");
	}

}

class Car
{
	Engine e = new Engine();
	
	void drive()
	{
		e.start();//tight coupling 
	}
}