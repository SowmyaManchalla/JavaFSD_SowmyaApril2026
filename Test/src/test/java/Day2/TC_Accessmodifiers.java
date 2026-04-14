package Day2;

public class TC_Accessmodifiers {
	
	class A
	{
		private int x=100;// private modifier
		
	}
	
	class B
	{
		int x2 = 100; //default modifier
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		B obj = new B();
		System.out.println(obj.x);//wont allow private
		
		System.out.println(obj.x2);
		

	}

}
