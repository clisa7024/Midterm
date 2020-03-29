package midtern;

public class Ellipsoid extends Ellipse implements Comparable{
	double HeightRadius;
	
	public Ellipsoid(double Radius, double MinorRadius, double HeightRadius) {
		this.HeightRadius = HeightRadius;
	}
	
	public double volume() throws Exception{
		double volume;
		volume = (4/3) * (3.14159) * (Radius * MinorRadius * HeightRadius);
		
		if(HeightRadius < 0) {
			throw new IllegalArgumentException("Wrong Argument");
		}
		
		return volume;
	}
	
	@Override
	public int compareTo(Object o) {
		Ellipsoid elld = (Ellipsoid) o;
		try {
			return (int) (this.volume() - elld.volume());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
