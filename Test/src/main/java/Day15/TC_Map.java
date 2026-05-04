package Day15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TC_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(40,"Pooja");
		map.put(2, "Kiran");
		map.put(3, "Leena");
		map.put(4, "Teja");
  System.out.println(map);
  
  Map<Integer,String> treemap = new TreeMap<>();
	treemap.put(40,"Pooja");
	treemap.put(2, "Kiran");
	treemap.put(3, "Leena");
	treemap.put(4, "Teja");
System.out.println(treemap);
	
Map<Integer,String> linkedhashmap = new LinkedHashMap<>();
linkedhashmap.put(40,"Pooja");
linkedhashmap.put(2, "Kiran");
linkedhashmap.put(3, "Leena");
linkedhashmap.put(4, "Teja");
System.out.println(linkedhashmap);


	}

}
