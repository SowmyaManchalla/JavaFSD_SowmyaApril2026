package Day16;

class priorityexample extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"running");
			
			Thread.yield();
		}
	}
}

public class TC_ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		priorityexample t1= new priorityexample();
		priorityexample t2= new priorityexample();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.setName("Low priority thread");
		t2.setName("High priority thread");
		t1.start();
		t2.start();
		

	}

}
