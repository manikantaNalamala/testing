package classesAndObjects;

import java.awt.Point;

public class Circle {

	Point center;
	double radius;
	static int numberOfCircles;

	// Default constructor
	public Circle() {
		numberOfCircles++;
	}

	// Parameterized constructor
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
		numberOfCircles++;

	}

	public double getParameter() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return radius * Math.PI * radius;
	}

	void setCenter(Point center) {
		this.center = center;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	static int numberOfCircleMethod() {
		return numberOfCircles;
	}
}
