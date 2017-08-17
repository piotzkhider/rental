package main.rental.point;

import main.rental.rental.DaysRented;

/**
 * Created by nishio on 2017/07/27.
 */
public class Old implements PointRule {

    @Override
    public PointRule withDays(DaysRented daysRented) {
        return this;
    }

    @Override
    public Point point() {
        return new Point(1);
    }
}
