package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		while (true) {
			displayMenu();
			int n = input.nextInt();
			if (n == 1) {
				System.out.println("please enter integer :");
				numbers.add(input.nextInt());
				System.out.println("Element Added");

			} else if (n == 2) {
				System.out.println("please enter integer :");
				int g = input.nextInt();
				if (numbers.contains(g)) {
					numbers.remove(Integer.valueOf(g));
					System.out.println("Element removed");
				} else {
					System.out.println("element not found");
				}

			} else if (n == 3) {
				System.out.println("List is " + numbers);

			} else if (n == 4) {
				numbers.removeAll(numbers);
				System.out.println("all are removed");
				
			}
		}
	}

	public static void displayMenu() {
		System.out.println();
		System.out.println("Add enter the 1 ");
		System.out.println("Remove enter the 2 ");
		System.out.println("get enter the 3 ");
		System.out.println("to clear all enter 4");

	}

}
