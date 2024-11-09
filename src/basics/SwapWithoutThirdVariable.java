package basics;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Before swapping: a = " + a + ", b = " + b);

		int temp = a;
		a = b;
		b = temp;

		/*
		 * a = a + b; b = a - b; a = a - b;
		 */
		System.out.println("After swapping: a = " + a + ", b = " + b);

	}

}
