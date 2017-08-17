package main.rental;

import main.rental.rental.Rental;
import main.rental.rental.Rentals;

class Statement {

    String customerName;
    Rentals rentals;

    Statement(String customerName, Rentals rentals) {
        this.customerName = customerName;
        this.rentals = rentals;
    }


    private String textFormat = "Rental Record for %s\n" +
            "%s" +
            "Amount owed is %s\n" +
            "You earned %s frequent renter points";

    String textStatement() {
        return statement(textFormat, textDetailFormat);
    }

    private String htmlFormat = "<h1>Rental Record for <em>%s</em></h1><p>" +
            "%s" +
            "<p>Amount owed is <em>%s</em><p>" +
            "You earned <em>%s</em> frequent renter points<p>";

    String htmlStatement() {
        return statement(htmlFormat, htmlDetailFormat);
    }

    private String statement(String format, String detailFormat) {

        String result = String.format(format,
                customerName,
                details(detailFormat),
                rentals.charge(),
                rentals.points());

        return result;
    }

    private String detailFormatTemplate = "%s%%s%s%%s%s";
    private String textDetailFormat = String.format(detailFormatTemplate, "\t", "\t", "\n");
    private String htmlDetailFormat = String.format(detailFormatTemplate, "", ": ", "<br>");

    private String details(String format) {
        String result = "";
        for (Rental each : rentals.asList()) {
            result += String.format(format, each.getMovieTitle(), each.charge());
        }
        return result;
    }
}
