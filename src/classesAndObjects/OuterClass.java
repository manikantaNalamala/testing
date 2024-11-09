package classesAndObjects;

public class OuterClass {

	class InnerClass {

		private int x;

		public InnerClass(int x) {
			this.x = x;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}
	}

}
