package twoDimesnionalArrays;

import java.util.Arrays;

public class ex1 {

	public static void main(String[] args) {
		int[][] numbers;
		numbers = new int[5][3];

		numbers[0][0] = 3;
		numbers[0][1] = 1;
		numbers[0][2] = 9;

		// System.out.println(Arrays.deepToString(numbers));
		// getArray();
		// getColArray();
		int[][] output = returningTwoDArray();
		System.out.println(Arrays.deepToString(output));
	}

	public static void getArray() {
		int[][] numbers = { { 1, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(numbers[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void getColArray() {
		int[][] numbers = { { 1, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 } };

		for (int i = 0; i < numbers[i].length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.print(numbers[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] returningTwoDArray() {
		int[][] numbers = new int[][] { { 1, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 } };

		return numbers;

	}
}
