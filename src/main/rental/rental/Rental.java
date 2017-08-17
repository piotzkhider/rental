package main.rental.rental;

import main.rental.charge.Charge;
import main.rental.movie.Movie;
import main.rental.point.Point;

public class Rental {
    private Movie movie;
    private DaysRented daysRented;

    public Rental(Movie movie, DaysRented daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }

    public Charge charge() {
        return movie.charge(daysRented);
    }

    Point point() {
        return movie.point(daysRented);
    }
}
