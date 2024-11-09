package arrayLists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DifferentWaysToIterateArrayList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("java", "C", "kotlin", "python", "spring", "jacku");

		// Basic for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));

		}
		System.out.println();

		// enriched or enhanced for loop
		for (String s : courses) {
			System.out.println(s);
		}
		System.out.println();

		// using iterator with while loop
		Iterator<String> it1 = courses.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("");

		// basic loop with iterator
		for (Iterator<String> it2 = courses.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}

		System.out.println();

		// for each
		courses.forEach((ele) -> {
			System.out.println(ele + " -");
		});
		System.out.println();
		// streams
		courses.stream().sorted().forEach((ele) -> {
			System.out.println("streams  " + ele);
		});
		System.out.println();
		courses.stream().sorted().filter((ele) -> ele.startsWith("j")).collect(Collectors.toList())
				.forEach((ty) -> System.out.println(ty + " filter"));

	}

}
