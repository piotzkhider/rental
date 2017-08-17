package main.rental.charge;

public class Charge {

    double value;

    public Charge(double value) {
        this.value = value;
    }

    public Charge add(Charge other) {
        return new Charge(this.value + other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
