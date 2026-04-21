package Day6;

class arraydemo
{
	int intnumbers[];
	arraydemo(int i)
	{
		intnumbers = new int[i];
	}
	
	void populatearray()
	{
		for(int i=0;i<intnumbers.length;i++)
		{
			intnumbers[i]=i;
		}
	}
	void displaycontent()
	{
		for(int i=0;i<intnumbers.length;i++)
		{
			System.out.println("numbers:" +intnumbers[i]);
		}
	}
}

public class TCS_arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraydemo ad = new arraydemo(5);
		ad.displaycontent();
		ad.populatearray();
		ad.displaycontent();
		

	}

}
