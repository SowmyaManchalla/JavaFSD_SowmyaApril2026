package Day2;

class Student
{
	void display()
	{
		System.out.println("Student method");
	}
}

public class TC_ObjectClass {
	
	Student obj = new Student();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "1234";
		int num = Integer.parseInt(str1);
		System.out.println(str1+10);
		
		double a=10.75;
		int b = (int)a;
		
		System.out.println("value of b is:"+b);
		
	}

}


