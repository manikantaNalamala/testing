package basics;

public class ConditionalOperator {

	public static void main(String[] args) {
		// Operator evaluates an expression based on a condition
		int a = 100, b = 20;
		int jk = a > b ? a : b;
		//System.out.println(jk);

		String str = "";
		String finale = str.isEmpty() ? "It is empty string." : str;
		System.out.println(finale);
	}

}
