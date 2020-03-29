package test;

import static org.junit.jupiter.api.Assertions.*;

import midtern.Ellipsoid;

public class EllipsoidTest {
	
	public void EllipseTest() {
		Ellipsoid elldArea = new Ellipsoid(10, 20, 25);
		assertEquals(20933.333, elldArea, 0.01);
	}

}
