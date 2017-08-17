package test;

import main.rental.Customer;
import main.rental.movie.ChargeType;
import main.rental.movie.Movie;
import main.rental.movie.PointType;
import main.rental.rental.DaysRented;
import main.rental.rental.Rental;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    @Test
    public void statement() throws Exception {
            assertThat(actual(), is(expect()));
            assertThat(actualHtml(), is(expectHtml()));
    }

    static private String expect() {
            return "Rental Record for name\n\tmovie1\t21.0\n\tmovie2\t1.5\n\tmovie3\t3.5\n" +
                    "Amount owed is 26.0\nYou earned 4 frequent renter points";
    }

    static private String expectHtml() {
        return "<h1>Rental Record for <em>name</em></h1><p>movie1: 21.0<br>movie2: 1.5<br>movie3: 3.5<br>" +
                "<p>Amount owed is <em>26.0</em><p>You earned <em>4</em> frequent renter points<p>";
    }

    static private String actual() {

        return getTestCustomer().textStatement();
    }

    static private String actualHtml() {
        return getTestCustomer().htmlStatement();
    }

    static private Customer getTestCustomer() {

        Movie movie1 = new Movie("movie1", ChargeType.NEW_RELEASE, PointType.NEW);
        Movie movie2 = new Movie("movie2", ChargeType.CHILDREN, PointType.OLD);
        Movie movie3 = new Movie("movie3", ChargeType.REGULAR, PointType.OLD);

        Rental rental1 = new Rental(movie1, new DaysRented(7));
        Rental rental2 = new Rental(movie2, new DaysRented(2));
        Rental rental3 = new Rental(movie3, new DaysRented(3));

        Customer customer = new Customer("name");

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        return customer;

    }
}