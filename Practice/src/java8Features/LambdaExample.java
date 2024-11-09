package java8Features;

//The Expression through which we can represent an Anonymous Function.
//Anonymous function means where it doesn't have name/unknown.
//A method doesn't have any name & modifier.
//An interface contains only one abstract method irrespective of how many default & void methods are  present is knowan as Functional Interface.
interface Calculator {
	// void SwitchOn();
	// void SwitchOn(int input);
	int SwitchOn(int a, int b);

}

public class LambdaExample {

	public static void main(String[] args) {

		// SYNTAX FOR LAMBDA ---> () -> {body}

		Calculator calculator = (a, b) -> {
			if (a < b) {
				throw new RuntimeException("A VALUE SHOULD BE > B");
			} else {
				return a - b;
			}
		};

		System.out.println(calculator.SwitchOn(27, 26));
	}

}
