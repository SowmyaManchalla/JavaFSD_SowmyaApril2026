package Day13;

import java.io.Console;

public class TC_Consoledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = System.console();
		if(c!=null)
		{
			String name = c.readLine("Enter name:");
			System.out.println("Hello:"+name);
		}
	}

}
