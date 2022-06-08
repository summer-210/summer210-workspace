package ls03.ta.after;

public class Point {
    double _x;
    double _y;

    Point(double x, double y) {
        _x = x;
        _y = y;
    }

    double distanceTo(Point other) {
        return Math.sqrt(((_x-other._x)*(_x-other._x))+
                         ((_y-other._y)*(_y-other._y)));
    }
}
