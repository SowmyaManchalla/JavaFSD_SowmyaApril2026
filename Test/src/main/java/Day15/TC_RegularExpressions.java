package Day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputstr = "Test String";
		//String pattern = "Test String";
		Pattern pattern = Pattern.compile("T.*g");
		Matcher matcher = pattern.matcher(inputstr);
		
		boolean patternmatch = matcher.matches();
		
		System.out.println(patternmatch);
		
		String input = "Shop,Mop,Hopping, Chopping";
		Pattern pattern1 = Pattern.compile("hop");
		Matcher matcher1 = pattern1.matcher(input);

		System.out.println(matcher1.matches());
		
		while(matcher1.find())
		{
			System.out.println(matcher1.group()+ ":"+matcher1.start()+":"+matcher1.end());
		}
	
	String input2 = "1234567891";
	//Pattern pattern2 = Pattern.compile("\\d+");
	Pattern pattern2 = Pattern.compile("\\d{10}");
	Matcher matcher2 = pattern2.matcher(input2);

	System.out.println(matcher2.matches());
	
	String input3 = "aaddfffggggg";
	//Pattern pattern2 = Pattern.compile("\\d+");
	Pattern pattern3 = Pattern.compile("\\d{10}");
	Matcher matcher3 = pattern3.matcher(input3);

	System.out.println(matcher3.matches());
	
	String input4 = "Test  String  FGDGDFDS";
	//Pattern pattern2 = Pattern.compile("\\d+");
	Pattern pattern4 = Pattern.compile(".*\\s.*");
	Matcher matcher4 = pattern4.matcher(input4);

	System.out.println("White space:"+matcher4.matches());
	
	String input5 = "TestStrings1";
	//Pattern pattern2 = Pattern.compile("\\d+");
	Pattern pattern5 = Pattern.compile("\\S+");
	Matcher matcher5 = pattern5.matcher(input5);

	System.out.println("Non White space:"+matcher5.matches());
	
	String input6 = "Test Strings1 reg";
	//Pattern pattern2 = Pattern.compile("\\d+");
	Pattern pattern6 = Pattern.compile("^[A-Z].* reg$");
	Matcher matcher6 = pattern6.matcher(input6);

	System.out.println("Beginningend  of line:"+matcher6.matches());
	}
}
