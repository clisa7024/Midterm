package test;

import static org.junit.jupiter.api.Assertions.*;

import midtern.Ellipse;

public class EllipseTest {

	public void EllipseTest() {
		Ellipse ellArea = new Ellipse(10, 20);
		assertEquals(628, ellArea, 0.01);
	}
}
