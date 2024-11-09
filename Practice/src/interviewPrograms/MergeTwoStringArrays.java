package interviewPrograms;

import java.util.Arrays;

public class MergeTwoStringArrays {

	public static void main(String[] args) {
		String[] array1 = { "Hello", "World" };
		String[] array2 = { "Java", "Programming" };

		// Merging the arrays
		String[] mergedArray = mergeArrays(array1, array2);

		// Displaying the merged array
		System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}

	public static String[] mergeArrays(String[] array1, String[] array2) {

		int length1 = array1.length;
		int length2 = array2.length;
		int mergedLength = length1 + length2;

		String[] mergedArray = new String[mergedLength];
		System.arraycopy(array1, 0, mergedArray, 0, length1);
		System.arraycopy(array2, 0, mergedArray, length1, length2);
		return mergedArray;

	}

}
