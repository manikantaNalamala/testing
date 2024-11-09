package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CreateHashSetFromCollection {

	public static void main(String[] args) {

		Set<Integer> firstFiveNumbers = new HashSet<>();
		firstFiveNumbers.add(10);
		firstFiveNumbers.add(220);
		firstFiveNumbers.add(30);
		firstFiveNumbers.add(480);
		firstFiveNumbers.add(530);

		Set<Integer> firstTenNumbers = new HashSet<>(firstFiveNumbers);

		Set<Integer> nextFiveNumbers = new HashSet<>();
		nextFiveNumbers.add(60);
		nextFiveNumbers.add(770);
		nextFiveNumbers.add(80);
		nextFiveNumbers.add(900);
		nextFiveNumbers.add(1000);

		firstTenNumbers.addAll(nextFiveNumbers);

		// set to list by list constructor
		List<Integer> list1 = new ArrayList<>(firstTenNumbers);

		/*
		 * we can use add all method also one collection should be the set another be
		 * empty list then we can use addAll() method
		 */

		// streams
		// System.out.println(firstTenNumbers.stream().collect(Collectors.toList()).getClass());

		System.out.println(list1);

	}

}
