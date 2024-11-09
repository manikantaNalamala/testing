package basics;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		System.out.println("hello world");
		String st1 = "strintg";
		String st2 = "abcde";
		String st3 = "qwert";
		int a = 1, b = 2, c = 1;
		System.out.println(a);
		System.out.println(st1);
		System.out.println(st1.toUpperCase().concat(" concat".toUpperCase()).indexOf(1));
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st1.charAt(st3.indexOf('w')));
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age & name :");
		System.out.println("Hii " + input.nextInt() + " your age is " + input.next() + ". Thank you!");

		int i = 6;
		int j = 8;
		// i+=6;
		j *= 8;
		double jk = 25.36;
		int fhf = (int) jk;

		System.out.println(jk);
		System.out.println(fhf);

	}

}