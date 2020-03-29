package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import midtern.Ellipsoid;

public class EllipsoidTest {
	
	public void EllipseTest() {
		Ellipsoid elldVolume = new Ellipsoid(10, 20, 25);
		assertEquals(20933.333, elldVolume.volume(), 0.01);
	}

}
