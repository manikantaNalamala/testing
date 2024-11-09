package forEachAndFilterExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortingMapByLambda {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("one", 1);
		map1.put("four", 4);
		map1.put("six", 6);
		map1.put("eight", 8);

		System.out.println("At first "+map1);
		List<Entry<String, Integer>> entries = new ArrayList<>(map1.entrySet());
		Collections.sort(entries, (o1, o2) -> o2.getKey().compareTo(o1.getKey()));

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}


		map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("-----------------------------------------------------------------");
		map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		Map<Employe, Integer> employeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		employeMap.put(new Employe(1, "Mani", 28, 25000), 60);
		employeMap.put(new Employe(2, "kanta", 29, 26000), 37);
		employeMap.put(new Employe(3, "sai", 30, 27000), 58);
		employeMap.put(new Employe(4, "Nalma", 31, 28000), 45);

		// System.out.println(employeMap);

		employeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employe::getSalary)))
				.forEach(System.out::println);// compare by key which is custom object(here we using the salary)

		employeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);// compare by value
	}

}
