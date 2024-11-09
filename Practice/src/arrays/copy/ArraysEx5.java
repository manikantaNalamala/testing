package arrays.copy;

import java.util.Arrays;

public class ArraysEx5 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5, 7, 9, -2, 3 };
		int[] temp = new int[numbers.length];
		int j = 0;
		int k = numbers.length - 1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0)
				temp[j++] = numbers[i];
			else
				temp[k--] = numbers[i];

		}
		replaceArray(numbers, temp);
		System.out.print(Arrays.toString(numbers));
	}

	public static void replaceArray(int[] numbers, int[] temp) {
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = temp[i];

	}

}
