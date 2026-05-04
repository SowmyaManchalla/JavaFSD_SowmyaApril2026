package Day13;
import java.io.File;

public class TC_File {

	public static void main(String[] args)
	{
		File f1= new File("a1.txt");// give the entire path to make sure parent directory is not null
		System.out.println("Filename:"+f1.getName());
		System.out.println("Parent directory name:"+f1.getParent());
		System.out.println("Absolute path:"+f1.getAbsolutePath());
		System.out.println("file length:"+f1.length());
		System.out.println("File readable:"+f1.canRead());
	}
}
