package basics;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// primeBetween(1, 50);
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
				int n = A.length() + B.length();
		System.out.println(n);
		System.out.println(A.compareTo(B) > 0 ? "yes" : "NO");

		String Bq = A.substring(0, 1).toUpperCase() + A.substring(1);
		String q = B.substring(0, 1).toUpperCase() + B.substring(1);
		System.out.println(Bq + " " + q);
	}

	/*
	 * public static boolean isPrime(int n) { for (int i = 2; i <= n / 2; i++) { if
	 * (n % 2 == 0) return false;
	 * 
	 * } return true; }
	 * 
	 * public static void primeBetween(int start, int end) { for (int i = start; i
	 * <= end; i++) if (isPrime(i)) System.out.print(i + " ");
	 * 
	 * }
	 */

}
