package hashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CreateAndAddHashSet {

	public static void main(String[] args) {

		Set<String> s1 = new HashSet<>();
		s1.add("Mani");
		s1.add("kanta");
		s1.add("sai");
		s1.add("nala");
		System.out.println(s1);
		// it doesn't allows the duplicates
		s1.add("Mani");
		System.out.println(s1);
		// it allows the single null value
		s1.add("null");
		System.out.println(s1);

	}

}
