package interviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordRemover {

	public static void main(String[] args) {

		String input = "Java is a programming language and Java is widely used in the software industry.";

		System.out.println(removeDuplicateWords(input));

	}

	public static String removeDuplicateWords(String s) {

		String[] words = s.split(" ");

		Set<String> unqiueWords = new HashSet<String>();

		StringBuilder resultString = new StringBuilder();

		for (String word : words) {
			if (unqiueWords.add(word)) {
				resultString.append(word).append(" ");
			}

		}
		String result = resultString.toString();

		return result;
	}

}
