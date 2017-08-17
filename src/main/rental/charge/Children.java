package main.rental.charge;

import main.rental.rental.DaysRented;

public class Children implements ChargeRule {

    DaysRented daysRented;

    public Children() {
    }

    Children(DaysRented daysRented) {
        this.daysRented = daysRented;
    }

    public ChargeRule withDays(DaysRented daysRented) {
        return new Children(daysRented);
    }

    public Charge charge() {
        Charge result = new Charge(1.5);
        if (daysRented.isOver(new DaysRented(3))) {
            Charge additional = new Charge((daysRented.value() - 3) * 1.5);
            result = result.add(additional);
        }
        return result;
    }
}
