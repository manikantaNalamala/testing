package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rough {

	public static void main(String[] args) {
		/*
		 * 
		 * List<Integer> list1 = new ArrayList<>(); list1.add(25); list1.add(85);
		 * list1.add(1, 28); list1.add(56); list1.add(28); System.out.println(list1);
		 * Collections.sort(list1); System.out.println(list1); List list2 = new
		 * ArrayList<Integer>(); Set<Integer> set1 = new HashSet<>();
		 * 
		 * for (Integer item : list1) { if (set1.add(item)) { list2.add(item);
		 * 
		 * }
		 * 
		 * } System.out.println(list2);
		 * 
		 */

		String a = "Hello";
		String c = "Hello";
		String b = new String("Hello");
		StringBuffer sbuffer = new StringBuffer("Hello");
		StringBuilder sbuilder = new StringBuilder("Hello");

		System.out.println(a.hashCode() + " - " + c.hashCode() + " -" + b.hashCode() + " " + sbuffer.hashCode() + " "
				+ sbuilder.hashCode());
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(b == sbuffer.toString());
		
		System.out.println(sbuffer.toString().equals(sbuilder.toString()));
		System.out.println(sbuffer.toString()==sbuilder.toString());

		
		
		

	}

}

