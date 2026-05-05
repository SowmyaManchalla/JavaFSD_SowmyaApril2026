package Day16;

public class TC_Thread_Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("count:"+i);
			
			try
			{
				Thread.sleep(50000);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
			
	}

}
