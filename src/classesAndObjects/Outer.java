package classesAndObjects;

public class Outer {
	private int outerX;

	class Inner {

		public int innerX;

		void showX() {
			System.out.println(outerX + " " + innerX);
		}
	}

	public void demo() {
		Inner inner = new Inner();
		inner.innerX = 3;
		inner.showX();// 3
		

	}

}
