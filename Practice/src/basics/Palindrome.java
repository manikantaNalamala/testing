package basics;

public class Palindrome {

	public static boolean isPalindrome(int n) {
		int originalNum = n;
		int reversedNum = 0;

		while (n != 0) {
			int remainder = n % 10;
			reversedNum = reversedNum * 10 + remainder;
			n /= 10;
		}

		return originalNum == reversedNum;
	}

	public static boolean palindromeOrNot(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;

		}

		return true;
	}

	public static void main(String[] args) {
		int num = 123214;
		String str = "madam";
		System.out.println(palindromeOrNot(str));

		if (isPalindrome(num)) {
			System.out.println(num + " is a palindrome number.");
		} else {
			System.out.println(num + " is not a palindrome number.");
		}

	}

}
