package main.rental.rental;

/**
 * Created by nishio on 2017/08/01.
 */
public class DaysRented {

    int value;

    public DaysRented(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public boolean isOver(DaysRented daysRented) {
        return this.value > daysRented.value;
    }
}
