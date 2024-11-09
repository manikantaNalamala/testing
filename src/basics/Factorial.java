package basics;

public class Factorial {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	public static int factorials(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int number = 5;
		System.out.println("Factorial of " + number + " is: " + factorial(number));
		System.out.println(factorials(number));
	}

}
