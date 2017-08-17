package main.rental.charge;

import main.rental.rental.DaysRented;

public interface ChargeRule {
    Charge charge();
    ChargeRule withDays(DaysRented daysRented);
}
