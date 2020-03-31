package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import midtern.Circle;

public class CircleTest {

	@Test
	public void CircleTes() {
		Circle c1Area = new Circle(10);
		assertEquals(314.15, c1Area.area(), 0.01);
	}
}

