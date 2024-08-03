package arrayLists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateArrayList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("java", "C", "kotlin", "python", "spring");

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

		System.out.println("/");
        // basic loop with iterator
		for (Iterator it2 = courses.iterator(); it2.hasNext();) {
			String s3 = (String) it2.next();
			System.out.println(s3);

		}
		
		// 

	}

}
