package basics;

public class LogicalOperators {

	public static void main(String[] args) {
		// Logical operators are used to construct the complex conditions

		// Logical AND Operator = && : True only if all conditions are true
		int a = 10, b = 5, c = 6, d = 7;
		boolean j = (a > b) && (b < c);
		boolean k = (a > b) && (b > c) && (c < d);
		System.out.println(j + " " + k);

		// Logical OR Operator = || : Evaluates true  if at least one of the conditions are true
	
		int ab = 10, bc = 5, cd = 6, de = 7;
		boolean jk = (ab > bc) || (bc < cd);
		boolean kl = (ab > bc) || (bc > cd) || (cd < de);
		System.out.println(jk + " " + kl);

	}

}
