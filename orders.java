import java.util.ArrayList;

public class orders extends hall {
    private String movieName;
    private int hallNumber;
    private int rowNumber;
    private int chairNumber;
    private int ticketPrice;

    public orders(int hallNumber, int rows, int columns, movie movie, int[][] movieArray, String movieName, int hallNumber1, int rowNumber, int chairNumber, int ticketPrice) {
        super(hallNumber, rows, columns, movie, movieArray);
        this.movieName = movieName;
        this.hallNumber = hallNumber1;
        this.rowNumber = rowNumber;
        this.chairNumber = chairNumber;
        this.ticketPrice = ticketPrice;
    }
    public boolean equalOrders(orders order){ return this.equalOrders(order); }
    public void describeOrder (){
        System.out.println("The order for" + this.movieName + "is ready. You'll be sitted at row number" + this.rowNumber +
            "and the chair number is" + this.chairNumber + "in hall number " + this.hallNumber + ". The ticket's price is " + this.ticketPrice);
    }
}