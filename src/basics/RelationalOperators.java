package basics;

public class RelationalOperators {

	public static void main(String[] args) {
		// operators are used to make comparisons
		// All these operators produce a boolean values when used
		// Equality operator(==)
		boolean abc = (1 == 1);
		boolean bcd = (1 == 2);
		boolean cde = (1 + 2) == (6 - 3);

		System.out.println(abc + " " + bcd + " " + cde);

		// Not Equality operator(==)
		boolean qwe = (1 != 1);
		boolean qsd = (1 != 2);
		boolean wer = (1 + 2) != (6 - 3);

		System.out.println(qwe + " " + qsd + " " + wer);
		// Greater than
		int a = 10, b = 20;
		boolean j = a > b;
		boolean gh = b > a;
		System.out.println(j + " " + gh);

		// Greater than or equal
		int ag = 10, bf = 10;
		boolean jl = a >= b;
		boolean gd = bf >= ag;
		System.out.println(jl + " " + gd);
	}

}
