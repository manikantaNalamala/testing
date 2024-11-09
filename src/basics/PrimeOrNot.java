package basics;

public class PrimeOrNot {
	public static Boolean prime(int n) {
		if (n%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 22;
		System.out.println(prime(n));
		// TODO Auto-generated method stub

	}

}
