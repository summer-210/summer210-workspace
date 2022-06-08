package ls03.ex1;

public class Point {

	double x;
	double y;
	
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double distanceTo(Point other) {
		return Math.sqrt((this.x - other.x)*(this.x - other.x) +
				         (this.y - other.y)*(this.y - other.y));
	}
}
