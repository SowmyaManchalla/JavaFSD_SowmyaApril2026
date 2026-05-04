package Day13;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.io.File;

public class TC_StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		String s1 = s.concat("  world");
		System.out.println("String: " +s);
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(1));
		
		System.out.println(s1.equals(s));
		
		System.out.println("Replace:"+s.replace('1', 'x'));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Deepa");
		sb.insert(4,"Best");
		System.out.println("String builder:"+sb);
		System.out.println("String builderreverse:" + sb.reverse());
		
		System.out.println("String delete:"+sb.delete(2,4));
		
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append("Hari");
		System.out.println("Reverse:"+sb1.reverse());
		System.out.println(sb1);
		
		File f = new File("a1.txt");
		System.out.println("File exists"+f.exists());
		System.out.println("Absolute path:"+f.getAbsolutePath());
		
		FileInputStream fis = new FileInputStream("a1.txt");
		
		int i;
		while(i=fis.read()!=-1)
		{
			System.out.println(((char)i));
		}
		
		FileReader fr = new FileReader("a1.txt");
		
		int j;
		while((j = fr.read())!=-1)
		{
			System.out.println(((char)j));
		}
        
		RandomAccessFile raf = new RandomAccessFile("a1.txt", "rw");
		raf.writeBytes("Hello");
		raf.seek(0);
		System.out.println(raf.readLine());
		raf.close();
		
		//console class
		
		
	}

}
