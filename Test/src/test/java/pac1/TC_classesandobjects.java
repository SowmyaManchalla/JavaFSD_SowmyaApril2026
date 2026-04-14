package pac1;

class Box
{
	double w=30;
	double h=40;
	double d = 50;
	
	double calcvolume()
	{
		return w*h*d;
	}
}


public class TC_classesandobjects {
	
	public static void main(String[] args)
	{
		Box obj = new Box();
		System.out.println(obj.w);
		System.out.println(obj.calcvolume());
		
	}
	
}


