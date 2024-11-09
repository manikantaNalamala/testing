package ep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class s1 {

	public static void main(String[] args) {

		Collection<String> c1 = new ArrayList<>();
		System.out.println(c1.isEmpty());
		Collection<String> f1 = Collections.emptyList();

		try {
			f1.add("Manika");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// System.exit(0);
			System.out.println("tatat");

		}

		c1.add("Mani");
		c1.add("Kanta");
		System.out.println(c1);
		Collection<Integer> c2 = new ArrayList<>(Arrays.asList(1, 2, 3));
		System.out.println(c2);
		Collection<String> c3 = new ArrayList<>(Arrays.asList("haha", "gagag"));
		System.out.println(c3.equals(c2));

		c1.addAll(c3);
		System.out.println(c1);

// enhance for loop

		for (String s : c1) {
			// System.out.println(s);
			if (s.contains("haha")) {
				s = s.toUpperCase();
			}

			System.out.println(s);
		}

// using the iterator
		/*
		 * Iterator<String> it1 = c1.iterator(); while (it1.hasNext()) {
		 * System.out.println(it1.next()); }
		 */
// using the for each java 8 feature
		/*
		 * c1.forEach(s -> { System.out.println(s); });
		 */
		
		

	}

	class Book {
		private String title;
		private String author;

		public Book(String string, String string2) {
		}

		// Constructor, getters, and setters

		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof Book)) {
				return false;
			}
			Book book = (Book) obj;
			return Objects.equals(title, book.title) && Objects.equals(author, book.author);
		}
	}

	

}
