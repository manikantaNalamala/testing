package interviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateWords {

	public static void duplicateWords(String inputString) {

		final String[] words = inputString.toLowerCase().split(" ");

		final Map<String, Integer> wordCount = new HashMap<String, Integer>();

		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);

			} else {
				wordCount.put(word, 1);
			}
		}

		// Extracting all keys
		Set<String> wordsInString = wordCount.keySet();

		for (String s : wordsInString) {
			if (wordCount.get(s) > 1) {
				// Printing that word and it's count
				System.out.println(s + " : " + wordCount.get(s));
			}
		}

	}

	public static void main(String[] args) {
		String s = "Java is java again java java a java";
		duplicateWords(s);

	}

}
