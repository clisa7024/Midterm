package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import midtern.Ellipse;

public class EllipseTest {

	public void EllipseTest() {
		Ellipse ellArea = new Ellipse(10, 20);
		assertEquals(628, ellArea.area(), 0.01);
	}
}
