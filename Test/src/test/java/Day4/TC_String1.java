package Day4;

public class TC_String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
		s.concat("World");//cannot print world here 
		System.out.println(s);
		
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World"); // can print world --- mutable original object is changed 
		System.out.println(sb);
	}

}
