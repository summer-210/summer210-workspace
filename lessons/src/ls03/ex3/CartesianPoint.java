package ls03.ex3;

public class CartesianPoint implements Point {

	private double x;
	private double y;
	
	final private static double POINT_EPSILON = 0.0001;

	public CartesianPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanceTo(Point other) {
		return Math.sqrt((getX() - other.getX())*(getX() - other.getX()) +
				         (getY() - other.getY())*(getY() - other.getY()));
	}
	
	public double getX() {
		return x;
	}
		
	public double getY() {
		return y;
	}
	
	public boolean equals(Point other) {
		boolean x_close_enough = (Math.abs(getX() - other.getX()) < POINT_EPSILON);
		boolean y_close_enough = (Math.abs(getY() - other.getY()) < POINT_EPSILON);
		
		return (x_close_enough && y_close_enough);
	}
}
