package midtern;

public class Ellipse extends Circle implements Comparable{
	double MinorRadius;
	
	public Ellipse() {
		
	}
	
	public Ellipse(double Radius, double MinorRadius) {
		this.MinorRadius = MinorRadius;
	}
	
	public double getMinorRadius() {
		return MinorRadius;
	}
	
	public void setMinorRadius(double newMinorRadius) {
		MinorRadius = newMinorRadius;
	}
	
	public double area() throws Exception {
		double area;
		area = 3.14159 * (Radius * MinorRadius);
		
		if(MinorRadius < 0) {
			throw new IllegalArgumentException("Wrong Argument");
		}
		
		return area;
	}
	
	public boolean isCircle() {
		if(Radius == MinorRadius) {
			return true;
		}else{
			return false;
		}
		
	}
	
	@Override
	public int compareTo(Object o) {
		Ellipse ell = (Ellipse) o;
		try {
			return (int) (this.area() - ell.area());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
