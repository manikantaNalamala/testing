package java8Features;

@FunctionalInterface
public interface MyFunctionalInterface {

	void m1();
	//when we add one more abstract method it is not an functional Interface
	//void m4();  

	default void m2() {

	}

	static void m3() {

	}
}
