package collectionsday14;
import java.util.*;
public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// map stores key value pair - to get value we use
		HashMap map =new HashMap();
		map.put(0, 345);
		map.put(1, 567);
		map.put(2, 456);
		map.put(2, 453);
		map.put(0, 453);
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(2));
		
		HashMap map1 =new HashMap();
		map1.put("apple","iphone");
		map1.put("samsung","galaxy");
		map1.put("nokia", "asha");
		map1.put("google", "pixel");
		map1.put("mi", "note11");
		
		System.out.println(map1);
		
// 3 views of hashmap
		
	}

}
