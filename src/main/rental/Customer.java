package main.rental;

import main.rental.rental.Rental;
import main.rental.rental.Rentals;

public class Customer {
    private String name;
    private Rentals rentals;

    public Customer(String name) {
        this.name = name;
        rentals = new Rentals();
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String textStatement() {
        Statement statement = new Statement(name, rentals);
        return statement.textStatement();
    }

    public String htmlStatement() {
        Statement statement = new Statement(name, rentals);
        return statement.htmlStatement();
    }

}
