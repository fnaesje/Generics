
public class Circle implements Comparable<Circle>{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public int compareTo(Circle other) {
		if (radius < other.radius) 
	        return -1;
	      else if (radius == other.radius)
	        return 0;
	      else
	        return 1;
	}
	
	@Override
    public String toString() {
      return "Circle radius: " + radius;
    }
}