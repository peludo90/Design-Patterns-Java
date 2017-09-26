package com.designpatterns.prototype;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PrototypeTest {

	static ShapeCache shapeCache;

	@BeforeClass
	public static void beforeClass() {
		shapeCache = new ShapeCache();
	}

	@Test
	public void SquareTest() {

		Square square = shapeCache.makeSquareCopy();

		System.out.println("Objeto copiado id " + System.identityHashCode(square));
		System.out.println("Objeto original id " + System.identityHashCode(shapeCache.square));

		assertEquals(square.getId(), shapeCache.square.getId());
		assertEquals(square.getType(), shapeCache.square.getType());
		assertNotSame(square, shapeCache.square);
	}

	@Test
	public void circleTest() {

		Circle circle = shapeCache.makeCircleCopy();

		System.out.println("Objeto copiado id " + System.identityHashCode(circle));
		System.out.println("Objeto original id " + System.identityHashCode(shapeCache.circle));

		assertEquals(circle.getId(), shapeCache.circle.getId());
		assertEquals(circle.getType(), shapeCache.circle.getType());
		assertNotSame(circle, shapeCache.circle);
	}

	@Test
	public void RectangleTest() {

		Rectangle rectangle = shapeCache.makeRectangleCopy();

		System.out.println("Objeto copiado id " + System.identityHashCode(rectangle));
		System.out.println("Objeto original id " + System.identityHashCode(shapeCache.rectangle));

		assertEquals(rectangle.getId(), shapeCache.rectangle.getId());
		assertEquals(rectangle.getType(), shapeCache.rectangle.getType());
		assertNotSame(rectangle, shapeCache.square);
	}

}
