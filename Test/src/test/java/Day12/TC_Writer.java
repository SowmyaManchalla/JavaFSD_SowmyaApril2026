package Day12;

import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

class mywriter extends FilterWriter
{
	protected mywriter(Writer out)
	{
		super(out);
	}
	public void write(String str) throws IOException
	{
		super.write()
	}
}

public class TC_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BufferedWriter bw = new BufferedWriter(new FileWriter("b1.txt"));
		bw.write("Hello BufferedWriter");
		bw.newLine();
		bw.close();

		char[] data = {'A','B','C'};
	    CharArrayWriter cw = new CharArrayWriter();
	    cw.write("Hello char array");
	    System.out.println(cw.toString());
	    cw.close();
	    
	    OutputStreamWriter osw = new OutputStreamWriter(System.out);
	    
	    osw.write("Hello OutputStreamWriter");
	    osw.flush();
	    
	    FileWriter fw = new FileWriter("abc.txt");


}
