package cinemaP;
import java.util.ArrayList;

public abstract class orders extends hall {
    private String movieName;
    private int rowNumber;
    private int chairNumber;

    public orders(int ticketPrice, int hallNumber, int rows, int columns, cinemaP.movie movie, int[][] movieArray, String movieName, int rowNumber, int chairNumber) {
        super(ticketPrice, hallNumber, rows, columns, movie, movieArray);
        this.movieName = movieName;
        this.rowNumber = rowNumber;
        this.chairNumber = chairNumber;
    }

    public orders(int hallNumber, int rowNumberTicket, int columnNumberTicket, String movieName, double ticketFinalPrice) {
        super();
    }

    public boolean equalOrders(orders order) {
        return this.equalOrders(order);
    }

    public void describeOrder() {
        System.out.println("The order for" + this.movieName + "is ready. You'll be sitted at row number" + this.rowNumber +
                "and the chair number is" + this.chairNumber + "in hall number " + hallNumber + ". The ticket's price is " + this.ticketPrice);
    }
}