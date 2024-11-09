package Set;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromHashSet {

	public static void main(String[] args) {

		List<Integer> firstFiveNumbers = new ArrayList<>();
		firstFiveNumbers.add(10);
		firstFiveNumbers.add(2);
		firstFiveNumbers.add(8);
		firstFiveNumbers.add(45);
		firstFiveNumbers.add(9);

		// remove
		System.out.println(firstFiveNumbers.remove(1) + " " + firstFiveNumbers);

		List<Integer> anotherFiveNumbers = new ArrayList<>();
		anotherFiveNumbers.add(8);
		anotherFiveNumbers.add(45);
		anotherFiveNumbers.add(9);

		// removeAll
		firstFiveNumbers.removeAll(anotherFiveNumbers);
		System.out.println(firstFiveNumbers);

		// clear
		firstFiveNumbers.clear();
		System.out.println(firstFiveNumbers);

	}

}
