package main.rental.movie;

import main.rental.point.New;
import main.rental.point.Old;
import main.rental.point.PointRule;

public enum PointType {
    OLD(new Old()),
    NEW(new New());

    PointRule rule;

    PointType(PointRule rule){
        this.rule = rule;
    }

    PointRule rule() {
        return rule;
    }
}
