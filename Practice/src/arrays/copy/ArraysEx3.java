package arrays.copy;

import java.util.Scanner;

public class ArraysEx3 {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 2, 2, 3, 4 };
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the no :");
		int n = input.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == n) {
				count++;
			}
		}
		System.out.println("no of occurences = " + count);
	}
}
