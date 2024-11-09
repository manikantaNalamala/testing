package interviewPrograms;

import java.util.StringTokenizer;

public class CountWords {

	public static void firstOne(String s) {
		String[] words = s.toLowerCase().split(" ");
		int number = words.length;
		System.out.println(number);
	}

	public static void secondOne(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s);
		int number = tokenizer.countTokens();
		System.out.println(number);
	}

	public static void main(String[] args) {

		String s = "my name is manikanta sai";
		firstOne(s);
		secondOne(s);
	}

}
