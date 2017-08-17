package main.rental.rental;

import main.rental.charge.Charge;
import main.rental.point.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rentals {
    private List<Rental> rentals;

    public Rentals(){
        rentals = new ArrayList<>();
    }

    public void add(Rental rental){
        rentals.add(rental);
    }

    public Charge charge() {
        Charge result = new Charge(0);
        for (Rental each: rentals) {
            result = result.add(each.charge());
        }
        return result;
    }

    public Point points() {
        Point result = new Point(0);
        for (Rental each: rentals) {
            result = result.add(each.point());
        }
        return result;
    }

    public List<Rental> asList(){
        return Collections.unmodifiableList(rentals);
    }
}
