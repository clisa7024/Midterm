package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import midtern.Circle;

public class CircleTest {

	@Test
	public void CircleTest() {
		Circle cArea = new Circle(10);
		assertEquals(314.15, cArea.area(), 0.01);
	}
}

