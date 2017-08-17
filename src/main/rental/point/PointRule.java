package main.rental.point;

import main.rental.rental.DaysRented;

public interface PointRule {
    PointRule withDays(DaysRented daysRented);
    Point point();
}
