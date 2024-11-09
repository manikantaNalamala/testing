package arrays.copy;

public class ArraysEx6 {

	public static void main(String[] args) {
		
		// Majority element
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

		int fucl = nums[0];
		int count = 0;

		for (int num : nums) {
			if (count == 0) {
				fucl = num;
			}
			if (fucl == num) {
				count++;
			} else {
				count--;
			}
		}
		System.out.println(fucl);
	}

}
