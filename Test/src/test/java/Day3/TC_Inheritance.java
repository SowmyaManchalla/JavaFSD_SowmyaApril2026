package Day3;

class Base
{
	String name = "animal";
	
	void basemethod()
	{
		System.out.println("Base method");
	}
}

class Child extends Base
{
	
	String name = "cat";
	void childmethod()
	{
		System.out.println("Child method");
		System.out.println("Name from child:"+name);
		System.out.println("Name from parent:"+super.name);
	}
}

public class TC_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Child obj = new Child();
             obj.childmethod();
             obj.basemethod();
             
      System.out.println(obj instanceof Base);
      System.out.println(obj.name);// prints cat by default but for parent super keyword is used 
      
      
	}

}
