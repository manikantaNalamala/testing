package basics;

public class Opertators {

	public static void main(String[] args) {

		// Integer div by int gives int

		int i = (int) 1.0f / 2;
		int iw = (int) (1.0f / 2);
		double j = 1 / 2;
		System.out.println(i);
		System.out.println(iw);
		System.out.println(j);

		// double div by double gives double
		double l = 1.0 / 2.0;
		double e = 2.0 / (double) 4.0f;
		double t = (double) 1 / 2;
		double gh = (double) 1.0f / 2.0f;

		System.out.println(t);
		System.out.println("/" + e);
		System.out.println(l);

		// float div by float gives float
		float q = 1.0f / 2.0f;
		double qj = (float) 1.0f / 2.0f;
		System.out.println("vvv" + gh);
		System.out.println(qj);
		System.out.println(q);

		// div int and double
		double d = 1.0 / 2;
		double f = 1 / 2.0;
		System.out.println(d + " " + f);

	}

}
