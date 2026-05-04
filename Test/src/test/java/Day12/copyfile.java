package Day12;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {
	
	public static void main(String[] args)
	{
		FileInputStream fromfile = null;
		FileOutputStream tofile = null;

		
		try
		{
			fromfile = new FileInputStream("a1.txt");
			tofile = new FileOutputStream("a2.txt");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			int i = fromfile.read();
			
			while(i!=-1)
			{
				tofile.write(i);
				i=fromfile.read();
		}
			fromfile.close();
			tofile.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Exception:" +ioe.getMessage());
		}

}
}
