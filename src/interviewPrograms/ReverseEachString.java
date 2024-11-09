package interviewPrograms;

public class ReverseEachString {

	public static void main(String[] args) {
		reverseEachWord("MY NAME IS MANIKANTA");

	}

	public static String reverseEachWord(String OriginaStr) {
		String[] words = OriginaStr.split(" ");
		String reverseStr = "";
		for (String s : words) {
			reverseStr = reverseStr + reverseConcatString(s) + " ";
		}
		display(OriginaStr, reverseStr);
		return reverseStr;
	}

	public static final String reverseConcatString(String s) {
		String reverseWord = "";

		for (int i = (s.length() - 1); i >= 0; i--) {
			reverseWord = reverseWord + s.charAt(i);
		}
		return reverseWord;

	}

	public static void display(String original, String reverse) {
		System.out.println(original);
		System.out.println(reverse);
		System.out.println("----------------------------");
	}
}
