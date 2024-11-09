package ep;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("MANI");
		list1.add("KANTA");
		list1.add("SAI");
// it allows duplicates
		list1.add("MANI");
// it allow null's
		list1.add("NULL");
		list1.add("NULL");
// it have control over the insertion
		list1.add("jytohi");
		list1.add("venkat");
// we can access the list members by using index
		System.out.println(list1.get(2));
		System.out.println(list1.get(0));

		System.out.println(list1);

	}

}
