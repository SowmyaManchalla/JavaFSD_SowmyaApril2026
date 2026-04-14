package pac1;

public class TC_Constructor {
	
	int id;
	String name;
	
	TC_Constructor(int a, String b)
	{
		this.id =a;
		this.name = b;
	}
	
	TC_Constructor(int c)
	{
		this.id = c;
		this.name = "leena";
	
	}
	
	TC_Constructor()
	{
		id = 1;
		name = "pooja";
	}

	public static void main(String[] args)
	{
		TC_Constructor() obj = new TC_Constructor(200,"kavya");
		System.out.println("id:" +obj.id);
		System.out.println("name:"+obj.name);
		
	}
	
}

	

