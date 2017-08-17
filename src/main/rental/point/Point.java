package main.rental.point;

/**
 * Created by nishio on 2017/07/20.
 */
public class Point {

    int value;

    public Point(int value) {
        this.value = value;
    }

    public Point add(Point other) {
        return new Point(value + other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
