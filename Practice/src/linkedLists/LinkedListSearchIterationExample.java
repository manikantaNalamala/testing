package linkedLists;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterationExample {

	public static void main(String[] args) {

		LinkedList<String> progLangs = new LinkedList<>();
		progLangs.add("java");
		progLangs.add("C+");
		progLangs.add("python");
		progLangs.add("spring");
		progLangs.add("Hibernate");
		progLangs.add("kotlin");
		progLangs.add("Hibernate");
		progLangs.add("python");

		System.out.println(progLangs.contains("spring"));

		// find the index of first occurrence of element at LL
		System.out.println(progLangs.indexOf("Hibernate"));

		// find the index of last occurrence of element at LL
		System.out.println(progLangs.lastIndexOf("Hibernate"));

		// iterator with while loop
		Iterator<String> it1 = progLangs.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println();

		// iterator with basic loop
		for (Iterator<String> it2 = progLangs.iterator(); it2.hasNext();) {
			String s1 = it2.next();
			System.out.println(s1);
		}
		System.out.println();

		// enhanced for loop
		for (String s2 : progLangs) {
			System.out.println(s2);
		}
		System.out.println();

		// forEach loop
		progLangs.forEach((element) -> System.out.println(element + " - for each"));

		// using the streams
		progLangs.stream().sorted().forEach((ele) -> System.out.println("-- " + ele));
		

	}

}
