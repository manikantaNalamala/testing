package streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import forEachAndFilterExamples.Employe;

public class Streams2 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1100, "Mani");
		map1.put(2206, "kanta");
		map1.put(350, "sai");

		System.out.println(map1);
		System.out.println(map1.entrySet().stream().filter((ele) -> ((String) ele.getValue()).startsWith("k"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)) + " 88");

		Map<Employe, Integer> employeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		employeMap.put(new Employe(1, "Mani", 28, 25000), 60);
		employeMap.put(new Employe(2, "kanta", 29, 26000), 37);
		employeMap.put(new Employe(3, "sai", 30, 27000), 58);
		employeMap.put(new Employe(4, "Nalma", 31, 28000), 45);

		employeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employe::getSalary)))
				.forEach(System.out::println);
		employeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employe::getSalary)))
				.forEach(System.out::println);
        employeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		
	}
}
