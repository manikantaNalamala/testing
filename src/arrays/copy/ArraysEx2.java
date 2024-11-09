package arrays.copy;

public class ArraysEx2 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, -3, 5, 7 };
		int sum = 0, multiple = 1;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			multiple *= numbers[i];

		}

		System.out.println("sum of arrays =" + sum);
		System.out.println("product of arrays =" + multiple);
		System.out.println("average of array is " + (double) sum / (numbers.length));
	}

}
