package Day11;

public class TC_ExceptionDeclaration {
	
	static void readfile() throws FileNotFoundException
	{
		Filereader file = new Filereader("test.txt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			readfile();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found exception is handled"+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("IO exception is handled" +e.getMessage());
		}

	}

}
