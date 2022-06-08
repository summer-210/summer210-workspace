package ls03.ex4;

public class PolarPoint implements Point {

	private double theta;
	private double r;
	
	final private static double POINT_EPSILON = 0.0001;
	
	public PolarPoint(double theta, double r) {
		this.theta = theta;
		this.r = r;
	}
	
	public double getX() {
		return (r * Math.cos(theta));
	}

	public double getY() {
		return (r * Math.sin(theta));
	}

	public double distanceTo(Point other) {
		return Math.sqrt((getX() - other.getX())*(getX() - other.getX()) +
		         (getY() - other.getY())*(getY() - other.getY()));
	}

	public boolean equals(Point other) {
		boolean x_close_enough = (Math.abs(getX() - other.getX()) < POINT_EPSILON);
		boolean y_close_enough = (Math.abs(getY() - other.getY()) < POINT_EPSILON);
		
		return (x_close_enough && y_close_enough);
	}

}
