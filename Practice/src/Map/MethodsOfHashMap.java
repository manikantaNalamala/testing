package Map;

import java.util.HashMap;
import java.util.Map;

public class MethodsOfHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();

		// check hash map empty or not
		System.out.println(map1.isEmpty());

		map1.put("Mani", 10);
		map1.put("kant", 256);
		map1.put("sai", 585);
		map1.put("nala", 891);
		map1.put("mala", 488);
		map1.put("first", null);
		map1.put("second", null);
		map1.put("null", 5656);
		map1.put("null", 78);

		// check hash-map empty or not
		System.out.println(map1.isEmpty());

		// size of hash-map
		System.out.println(map1.size());

		// check if a key exists in map
		System.out.println(map1.containsKey("nala"));

		// check if a value exists in map
		System.out.println(map1.containsValue(891));

		// get value by using key
		System.out.println(map1.get("null"));

		// remove key from hashmap
		System.out.println(map1.remove("mala"));

		// get only keys from map
		System.out.println(map1.keySet());

		// get only values
		System.out.println(map1.values());

		System.out.println(map1);

	}

}
