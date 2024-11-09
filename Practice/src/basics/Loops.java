package basics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 10; i++) { for (int j = 1; j <= 20; j++)
		 * System.out.println((i * j) + " "); System.out.println(); }
		 */

		/*
		 * String str = "Raja sri"; String reverse = ""; for (int i = str.length() - 1;
		 * i >= 0; i--) { System.out.print(str.charAt(i) + " "); // reverse the string
		 * reverse += str.charAt(i); } System.out.println(reverse);
		 */

		/*
		 * String str1 = "swaws"; boolean isPlaindrome = true;
		 * 
		 * for (int i = 0, j = str1.length() - 1; i < j; i++, j--) { if (str1.charAt(i)
		 * == str1.charAt(j)) continue; isPlaindrome = false; break;
		 * 
		 * } System.out.println(isPlaindrome ? "it is palindrome" :
		 * " it is not palindrome");
		 */

		/*
		 * System.out.println("Please enter the no :");
		 * 
		 * Scanner input = new Scanner(System.in); int n = input.nextInt(); for (int i =
		 * 0; i <= n; i++) { for (int j = 0; j < i; j++) { System.out.print((i)); }
		 * System.out.println(); }
		 */

		/*
		 * System.out.println("please enter the nO : "); Scanner input = new
		 * Scanner(System.in); int n = input.nextInt();
		 * 
		 * for (int i = 1; i <= n; i++) { for (int j = 1; j <= n - i; j++)
		 * System.out.print(" ");
		 * 
		 * for (int k = 1; k <= 2*i-1; k++) System.out.print("*");
		 * 
		 * System.out.println(); }
		 */

		/*
		 * System.out.println("please enter the nO : "); Scanner input = new
		 * Scanner(System.in); int n = input.nextInt();
		 * 
		 * for (int i = 1; i <= n; i++) { for (int j = 1; j <= n - i; j++)
		 * System.out.print(" ");
		 * 
		 * for (int k = 1; k <= 2 * i - 1; k++)
		 * 
		 * if (i == n) System.out.print("*"); else if (k == 1 || k == 2 * i - 1)
		 * System.out.print("*"); else System.out.print(" ");
		 * 
		 * System.out.println(); }
		 */

		/*
		 * System.out.println("please enter the nO : "); Scanner input = new
		 * Scanner(System.in); int n = input.nextInt(); for (int i = 1; i <= n; i++) {
		 * if (i == n || i == 1) for (int j = 1; j <= n; j++) { System.out.print("*"); }
		 * else for (int j = 1; j <= n; j++) if (j == 1 || j == n)
		 * System.out.print(" "); else System.out.print("*"); System.out.println(); }
		 */

		
		Scanner in = new Scanner( System.in );
        int t = in.nextInt();
        for( int i = 0; i < t; i++ ){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int result = a;
            for( int j = 0; j < n; j++ ){
               result = result + ( int )( Math.pow( 2 , j )) * b;
              // System.out.printf( "%d ", result ); 
               System.out.print(result+" ");
             
               
            }
            System.out.print( "\n" );
        }
        in.close();
	}

}
