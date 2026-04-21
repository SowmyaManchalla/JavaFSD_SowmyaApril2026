package Day7;

public class TC_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		
		System.out.println("Total memory:"+r.totalMemory());
		System.out.println("Free memory:"+r.freeMemory());
		
		for(int i =0;i<10000;i++)
		{
			new TC_Memory();
		}
		
		System.gc();
	    System.out.println("After GC:"+r.freeMemory());
	}

}
