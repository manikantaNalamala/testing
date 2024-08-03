package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterationOverHashMap {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Mani", 10);
		map1.put("kant", 256);
		map1.put("sai", 585);
		map1.put("nala", 891);
		map1.put("mala", 488);
		map1.put("first", null);
		map1.put("second", null);
		map1.put("null", 5656);
		map1.put("null", 78);

		// for loop
		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println("key is :" + entry.getKey() + "  and the " + " value is :" + entry.getValue());
		}
		System.out.println();

		// iterator
		Set<Map.Entry<String, Integer>> entries = map1.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = entries.iterator();
		while (it1.hasNext()) {
			Map.Entry<String, Integer> entry = it1.next();
			System.out.println("key = " + entry.getKey() + "  value = " + entry.getValue());

		}
		System.out.println();

		// java 8 forEach
		map1.forEach((k, v) -> {
			System.out.println("k " + k + " v " + v);
		});
	}

}
