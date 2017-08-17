package main.rental.charge;

import main.rental.rental.DaysRented;

public class NewRelease implements ChargeRule {
    private DaysRented daysRented;

    public NewRelease(){}
    NewRelease(DaysRented daysRented) {
        this.daysRented = daysRented;
    }

    public ChargeRule withDays(DaysRented daysRented) {
        return new NewRelease(daysRented);
    }

    public Charge charge() {
        return new Charge(daysRented.value() * 3);
    }
}
