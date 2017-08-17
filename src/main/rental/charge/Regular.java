package main.rental.charge;

import main.rental.rental.DaysRented;

public class Regular implements ChargeRule {

    DaysRented daysRented;

    public Regular(){}
    Regular(DaysRented daysRented) {
        this.daysRented = daysRented;
    }

    public ChargeRule withDays(DaysRented daysRented) {
        return new Regular(daysRented);
    }

    public Charge charge() {
        Charge result = new Charge(2);
        if (daysRented.isOver(new DaysRented(2))) {
            Charge additional = new Charge((daysRented.value() - 2) * 1.5);
            result = result.add(additional);
        }
        return result;
    }
}
