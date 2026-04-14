package Day2;

public class TC_B {
	
	static int x=100;
	final int y=400;
	
	
	void change()
	{
		y=500;//not allowed 
	}

	final void change1()
	{
		y=500;
	}
	
	class A extends TC_B
	{
		void change()//cant override 
		{
			
		}
	}
}
