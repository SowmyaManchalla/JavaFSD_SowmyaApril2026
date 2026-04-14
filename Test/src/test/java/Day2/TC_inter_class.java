package Day2;

class c1 implements TC_Inter
{
	public void display()
	{
		System.out.println("This is from interface");
	}
}
public class TC_inter_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c1 obj = new c1();
		obj.display();
		TC_Inter.display1();
		obj.display3();
        System.out.println("The minimum balance is:" +minbalance);
	}

}
