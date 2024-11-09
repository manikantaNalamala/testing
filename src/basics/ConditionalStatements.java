package basics;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		System.out.println("Please enter the number : ");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		if (result % 2 == 0) {
			System.out.println("The given number is even " + result);
		} else
			System.out.println("The given number is odd " + result);

		System.out.println("Please enter the number :");
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		switch (n % 2) {
		case 0:
			System.out.println("it is even");
			break;
		case 1:
			System.out.println("it is odd");
			break;
		case 220:
			System.out.println("it is 220");
			break;
		case 5:
			System.out.println("it is 5");
			break;
		default:
			System.out.println("OOps");

		}

		int num = s.nextInt();

		char operetor = s.next().charAt(0);
		int num2 = s.nextInt();

		if (operetor == '+') {
			System.out.println((num + num2));
		} else if (operetor == '-') {
			System.out.println((num - num2));
		} else if (operetor == '*') {
			System.out.println((num * num2));
		} else if (operetor == '/') {
			System.out.println((num / num2));
		} else
			System.out.println("invalid operator");

	}

}
