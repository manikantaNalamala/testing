package classesAndObjects;

public class MainOne {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innerX = 5;
		inner.showX(); //5
	}

}
