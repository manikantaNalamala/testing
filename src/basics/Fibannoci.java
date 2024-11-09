package basics;

public class Fibannoci {

	public static void printFibonacci(int n) {
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}

	public static void main(String[] args) {
		int n = 10;
	//	System.out.print("Fibonacci series: ");
		printFibonacci(n);

	}

}
