package basics;

import java.util.function.Function;

public class LambdaExpressions {

	public static void main(String[] args) {

		Function<Integer, String> function = (t) -> "Output was :" + t;
		System.out.println(function.apply(25));
		// get to know about the Method reference :it provides a way to refer the methods without invoking them 
		//these are used to create the simple lambda expressions.Its a shorthand way to write the lambda
		// stremapi are series of elements .it supports different operations to perform different  computations upon those elements

	}

}
