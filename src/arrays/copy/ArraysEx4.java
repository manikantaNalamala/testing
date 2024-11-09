package arrays.copy;

public class ArraysEx4 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, -3, 5, 7 };
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			max = (numbers[i] > max ? numbers[i] : max);
			min = (numbers[i] < min ? numbers[i] : min);

		}

		System.out.println("Max of arrays =" + max);
		System.out.println("min of arrays =" + min);
	}

}
