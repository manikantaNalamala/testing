package classesAndObjects;

import java.awt.Point;

public class Main {

	public static void main(String[] args) {

		System.out.println(Circle.numberOfCircles);
		Circle c1 = new Circle();
		System.out.println(Circle.numberOfCircles);

		Circle c2 = new Circle(new Point(1, 2), 3);
		System.out.println(Circle.numberOfCircleMethod());
		c2.numberOfCircles = 12;
		Circle c3 = new Circle(new Point(4, 8), 9);
		System.out.println(c1.numberOfCircles);

		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
	}

}
