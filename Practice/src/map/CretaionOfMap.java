package map;

import java.util.HashMap;
import java.util.Map;

public class CretaionOfMap {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Mani", 10);
		map1.put("kant", 256);
		map1.put("sai", 585);
		map1.put("nala", 891);
		map1.put("mala", 488);

		// add null keys
		map1.put("null", 5656);
		map1.put("null", 78);

		// add null values

		map1.put("first", null);
		map1.put("second", null);
		
		//add duplicates
		map1.put("sai", 586);

		System.out.println(map1);
	}

}
