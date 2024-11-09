package basics;

public class Pyramid {

	public static void printPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pyramid(int n) {
		for (int a = 1; a <= n; a++) {
			for (int q = n; q > a; q--) {
				System.out.println(" ");
			}
			for (int f = 1; f <= (2 * a - 1); f++) {
				System.out.println("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int rows = 5;
		// printPyramid(rows);
		pyramid(rows);

	}

}
