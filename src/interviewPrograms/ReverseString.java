package interviewPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String s = "JAVA";

		StringBuilder string = new StringBuilder(s);
		System.out.println(string.reverse());

		char[] words = s.toCharArray();

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}

	}

}
