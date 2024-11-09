package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Eneter the 5 integeres :");
		for (int i = 0; i < 5; i++) {
			int temp = input.nextInt();
			if (!numbers.contains(temp)) {
				numbers.add(temp);
			}

		}
		Collections.sort(numbers);
		System.out.println(numbers);
	}

}
