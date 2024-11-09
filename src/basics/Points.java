package basics;

import java.awt.Point;
import java.util.Scanner;

public class Points {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements(Max is 20) :");
		int n = input.nextInt();
		while (n > 20 || n <= 0) {
			System.out.println("Invalid.Please try again.Please enter : ");
			n = input.nextInt();
		}
		Point[] numbers = new Point[n];
		fillArrayOfIntegers(numbers);
		printArrayOfIntegers(numbers);

	}

	private static void fillArrayOfIntegers(Point[] numbers) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Please enter 'x'  & 'y' for point : " + (i + 1) + ": ");
			numbers[i] = new Point(input.nextInt(), input.nextInt());

		}
	}

	private static void printArrayOfIntegers(Point[] numbers) {
		System.out.println("The elements are :");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("(" + numbers[i].x + ", "+ numbers[i].y + ")");
		}
	}

}
