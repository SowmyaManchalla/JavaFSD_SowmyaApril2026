package Day12;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.FilterReader;

class uppercasereader extends FilterReader
{
	protected uppercasereader(Reader in)
	{
		super(in);
	}
	
	public int read() throws IOException
	{
		int ch3=super.read();
		if(ch3==-1)
		{
			return -1;
		}
		return Character.toUpperCase((char)ch3);
	}
}
public class TC_Reader {
		


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new FileReader("a1.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();
        
        LineNumberReader lr = new LineNumberReader(new FileReader("a1.txt"));
        String line1;
        while((line1=lr.readLine())!=null)
       {
	   System.out.println(lr.getLineNumber());
       }
       lr.close();

    char[] data = {'A','B','C'};
    CharArrayReader cr = new CharArrayReader(data);
    int ch;
    while((ch=cr.read())!=-1)
     {
	System.out.println((char)ch);
     }
     cr.close();
        InputStreamReader isr = new InputStreamReader(System.in);
        int ch1 = isr.read();
        System.out.println((char)ch1);
        
        FileReader fr = new FileReader("a1.txt");
        int ch2;
        
        while((ch2=fr.read())!=-1)
        {
        	System.out.println((char)ch2);
        }
        
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader(pw);
        pw.write("HIII");
        pw.close();
        
        int ch5;
        while((ch5=pr.read())!=-1)
        {
        	System.out.println((char)ch5);
        }
        pr.close();
        
        String data1 = "hello java";
        StringReader sr1 = new StringReader(data1);
        int ch6;
        while((ch6=sr1.read())!=-1)
        {
        	System.out.println((char)ch6);
        }
        sr1.close();
	}

}
