package midtern;

public class Circle extends Shape implements Comparable{
	double Radius;
	
	public Circle() {
		
	}
	
	public Circle(double Radius) {
		this.Radius = Radius;
	}
	
	public double area() throws Exception {
		double area;
		area = 3.14159 * (Radius * Radius);
		
		if(Radius < 0) {
			throw new IllegalArgumentException("Wrong Argument");
		}
		
		return area;
	}
	
	protected double getRadius() {
		return Radius;
	}
	
	protected void setRadius(double newRadius) {
		if(Radius >= 0) {
		Radius = newRadius;
		}
	}
	
	@Override
	public int compareTo(Object o) {
		Circle c = (Circle) o;
		try {
			return (int) (this.area() - c.area());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
