package test;

import static org.junit.jupiter.api.Assertions.*;

import midtern.Circle;

public class CircleTest {

	public void CircleTest() {
		Circle c1Area = new Circle(10);
		assertEquals(314.15, c1Area, 0.01);
	}
}

