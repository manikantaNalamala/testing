package arrays.copy;

import java.util.Arrays;

public class ArraysEx7 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 5, 6, 7, 8, 9, 11 };
		int sum = nums[0];
		int missingNum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (sum != nums[i]) {
				missingNum = sum;
				sum++;
			}
			sum++;
		}
		System.out.println(missingNum);
	}

}
