package hashSet;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class RetrivalElmentsFromHashSetByIteration {

	public static void main(String[] args) {
		Set<Integer> firstFiveNumbers = new CopyOnWriteArraySet<>();
		firstFiveNumbers.add(10);
		firstFiveNumbers.add(220);
		firstFiveNumbers.add(30);
		firstFiveNumbers.add(480);
		firstFiveNumbers.add(530);

		// enhanced for loop
		for (Integer int2 : firstFiveNumbers) {
			System.out.println(int2);
		}
		System.out.println("------------");

		// Iterator with basic loop
		for (Iterator<Integer> it1 = firstFiveNumbers.iterator(); it1.hasNext();) {
			Integer int1 = it1.next();
			System.out.println(int1);
		}
		System.out.println("------------");

		// forEach+lambda
		firstFiveNumbers.forEach((int3) -> {
			System.out.println(int3);
		});
		System.out.println("------------");

		// streams +lambda
		firstFiveNumbers.stream().filter(int4 -> int4 != 30).forEach(int4 -> System.out.println(int4));

	}

}
