package Day3;
class parent
{
	void show()
	{
		System.out.println("parent method");
	}
}

class child extends parent
{
	@Override()//CAN ALSO USE 
	void show()
	{
		System.out.println("child method");
	}
}
public class TC_override {

	public static void main(String[] args)
	{
		parent p = new child();// upcasting
		child c = (child)p;//downcasting
		p.show();
		c.show();
	}
}
