package Day2;

enum Day{
	Monday, Tuesday, Wednesday, Thursday,Friday,Saturday, Sunday
}

public class TC_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day d = Day.Monday;
		//System.out.println(d);
		
		switch(d)
		{
		case Monday:
			System.out.println("This is the first day");
		}

	}

}
