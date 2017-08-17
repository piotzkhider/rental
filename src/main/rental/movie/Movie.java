package main.rental.movie;

import main.rental.charge.Charge;
import main.rental.charge.ChargeRule;
import main.rental.point.Point;
import main.rental.point.PointRule;
import main.rental.rental.DaysRented;

public class Movie {

    private String title;
    private ChargeType chargeType;
    private PointType pointType;

    public Movie(String title, ChargeType chargeType, PointType pointType) {
        this.title = title;
        this.chargeType = chargeType;
        this.pointType = pointType;
    }

    public String getTitle() {
        return title;
    }

    public Charge charge(DaysRented daysRented) {
        ChargeRule rule = chargeType.rule();
        rule = rule.withDays(daysRented);

        return rule.charge();
    }

    public Point point(DaysRented daysRented) {
        PointRule rule = pointType.rule();
        rule = rule.withDays(daysRented);

        return rule.point();
    }
}
