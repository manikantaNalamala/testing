package basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {

	public static void main(String[] args) {

		// Map<Integer, String> map = new HashMap<>();
		//ConcurrentHashmap
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "one");
		map.put(2, "two");

		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key + " : " + map.get(key));
			map.put(3, "Three");

		}
	}

}
