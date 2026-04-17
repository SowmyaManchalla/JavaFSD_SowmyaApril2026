package Day4;

interface Engine1
{
	void start();
}

class PetrolEngine implements Engine1
{
	public void start()
	{
		System.out.println("Petrol engine started");
	}
}

class car
{
	Engine1 e;
	car(Engine1 e)
	{
		this.e=e;
	}
	void driver()
	{
		e.start();//loose coupling
	}
}
public class Engine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
