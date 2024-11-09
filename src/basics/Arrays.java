package basics;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements(Max is 20) :");
		int n = input.nextInt();
		while (n > 20 || n <= 0) {
			System.out.println("Invalid.Please try again.Please enter : ");
			n = input.nextInt();
		}
		int[] numbers = new int[n];
		fillArrayOfIntegers(numbers);
		printArrayOfIntegers(numbers);

	}

	private static void fillArrayOfIntegers(int[] numbers) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();

		}
	}

	private static void printArrayOfIntegers(int[] numbers) {
		System.out.print("The elements are :");
		System.out.print(java.util.Arrays.toString(numbers));
	}

}
