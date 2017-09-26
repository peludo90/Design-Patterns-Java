package com.designpatterns.prototype;

public class ShapeCache {

	Square square;
	Rectangle rectangle;
	Circle circle;

	public ShapeCache() {
		square = new Square();
		rectangle = new Rectangle();
		circle = new Circle();
	}

	public Square makeSquareCopy() {

		return (Square) square.copy();
	}

	public Rectangle makeRectangleCopy() {

		return (Rectangle) rectangle.copy();
	}

	public Circle makeCircleCopy() {

		return (Circle) circle.copy();
	}

}
