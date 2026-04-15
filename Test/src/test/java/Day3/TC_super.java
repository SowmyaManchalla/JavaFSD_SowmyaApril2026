package Day3;

package Day3;

class Base
{
	String name = "animal";
	
	void basemethod()
	{
		System.out.println("Base method from parent");
	}
}

class Child extends Base
{
	
	String name = "cat";
	
	void basemethod()
	{
		System.out.println("Base method from child");
	}
	void childmethod()
	{
		System.out.println("Child method");
		System.out.println("Name from child:"+name);
		System.out.println("Name from parent:"+super.name);
		super.basemethod();//used to access parents, variables and methods by overriding child
		basemethod();
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
