package main.rental.point;

import main.rental.rental.DaysRented;

/**
 * Created by nishio on 2017/07/27.
 */
public class New implements PointRule {

    DaysRented daysRented;

    public New(){};
    New(DaysRented daysRented) {
        this.daysRented = daysRented;
    }

    @Override
    public PointRule withDays(DaysRented daysRented) {
        return new New(daysRented);
    }

    @Override
    public Point point() {
        int point = daysRented.isOver(new DaysRented(1)) ? 2 : 1;
        return new Point(point);
    }
}
