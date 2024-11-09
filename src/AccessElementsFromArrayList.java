package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {

	public static void main(String[] args) {
		// how to check if array list is empty by using the empty() method.
		// how to find the size
		// how to access the element at particular index by using the get() method
		// how to modify the element at particular index by using the set () method

		List<String> topProgramLang = new ArrayList<>();
		System.out.println("topProgramLang is empty :" + topProgramLang.isEmpty());

		topProgramLang.add("python");
		topProgramLang.add("java");
		topProgramLang.add("c");
		topProgramLang.add("angular");
		topProgramLang.add("kotlin");
		topProgramLang.add("javascript");
		topProgramLang.add("rubics");

		System.out.println("topProgramLang is empty :" + topProgramLang.isEmpty());
		// size
		System.out.println("topProgramLang is size is :" + topProgramLang.size());

		// get
		String bestLang = topProgramLang.get(1);
		System.out.println(bestLang);
		System.out.println(topProgramLang);
		// set - modify element at given at index
		topProgramLang.set(2, "C+");
		System.out.println(topProgramLang);

		// remove element at particular index
		topProgramLang.remove(6);
		System.out.println("after removing by index :" + topProgramLang);
		

	}

}
