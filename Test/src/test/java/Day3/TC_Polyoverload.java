package Day3;

public class TC_Polyoverload {
	
	int noofcylinders;
	int noofvalves;
	int enginepower;
	boolean ispowersteering; 
	
	
	TC_Polyoverload()
	{
		noofcylinders=3;
		noofvalves=4;
		enginepower=48;
		ispowersteering=false;
		
	}
	
TC_Polyoverload(boolean powersteering)
{
	this();
	this.ispowersteering=powersteering;
}
TC_Polyoverload(int noofcylinders, int noofvalves, int enginepower)
{
	this.noofcylinders=noofcylinders;
	this.noofvalves=noofvalves;
	this.enginepower=enginepower;
}

public static void main(String[] args)
{
	TC_Polyoverload obj = new TC_Polyoverload();
	TC_Polyoverload(40,40,40);
}
}
