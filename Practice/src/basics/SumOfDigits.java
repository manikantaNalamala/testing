package basics;

public class SumOfDigits {

	public static int sumDigi(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;

		}

		return sum;
	}

	public static void main(String[] args) {

		int number = 12345;
		System.out.println(sumDigi(number));

	}

}
