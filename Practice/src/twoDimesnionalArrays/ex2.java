package twoDimesnionalArrays;

public class ex2 {

	public static void main(String[] args) {
		int[][] numbersa = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 0, 5, 8 } };

		for (int i = 0; i < numbersa.length; i++) {
			System.out.println(" the max no for  " + (i + 1) + " row is " + getmax(numbersa[i]));
		}
	}

	public static int getmax(int[] num) {
		int max = num[0];
		for (int j = 0; j < num.length; j++) {
			max = num[j] > max ? num[j] : max;
		}
		return max;
	}
}
