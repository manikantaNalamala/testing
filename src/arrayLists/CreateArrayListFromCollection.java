package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateArrayListFromCollection {
//How to create array list from collection using the array list collection c constructor.
//how to add all the elements from the existing collection to the new array list using the addAll() method.

	public static void main(String[] args) {

		List<Integer> firstFiveNumbers = new ArrayList<>();
		firstFiveNumbers.add(10);
		firstFiveNumbers.add(2);
		firstFiveNumbers.add(8);
		firstFiveNumbers.add(45);
		firstFiveNumbers.add(9);
		List<Integer> firstTenNumbers = new ArrayList<>(firstFiveNumbers);
		System.out.println(firstTenNumbers);

		List<Integer> anotherFiveNumbers = new ArrayList<>();
		anotherFiveNumbers.add(85);
		anotherFiveNumbers.add(47);
		anotherFiveNumbers.add(855);
		anotherFiveNumbers.add(55);
		anotherFiveNumbers.add(4);
		firstTenNumbers.addAll(anotherFiveNumbers);

		System.out.println(firstTenNumbers);
		Collections.sort(firstTenNumbers);// ascending order
		Collections.reverse(firstTenNumbers);// Descending order
		System.out.println(firstTenNumbers);
		

	}

}
