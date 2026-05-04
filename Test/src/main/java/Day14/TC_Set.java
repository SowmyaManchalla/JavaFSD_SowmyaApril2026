package Day14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TC_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //HashSet<Integer> set1 = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(null);
		
		System.out.println("Set value:"+set1);
		
		for(int num:set1)
		{
			System.out.println(num);
		}
		Set <Integer> set2 = new TreeSet<>();
		set2.add(10);
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		
		System.out.println("Set value:"+set2);
		
		for(int num1:set2)
		{
			System.out.println(num1);
		}
		Set<Integer> set3 = new LinkedHashSet<>();
		set3.add(10);
		set3.add(10);
		set3.add(20);
		set3.add(30);
System.out.println("Set value:" +set3);

for(int num1:set2)
{
	System.out.println(num1);
}
	}

}
