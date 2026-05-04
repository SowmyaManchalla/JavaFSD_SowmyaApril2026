package Day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.StringTokenizer;

public class TC_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		String str = "123";
		
		int num = Integer.parseInt(str);
		System.out.println(num+10);
		
		Pattern p = Pattern.compile("Java");
		Matcher m = p.matcher("I love Java");
		
		System.out.println(m.find());
		
		//tokenization
		
		String str2 = "Today is a beautiful day";
		String[] tokens = str2.split("");
		for(String t: tokens)
		{
			System.out.println(t);
		}
		
		StringTokenizer st = new StringTokenizer(str2," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
