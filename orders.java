import java.util.ArrayList;

public class orders extends hall {

    private String movieName;
    private int hallNumber;
    private int rowNumber;
    private int chairNumber;
    private int ticketPrice;

    public orders(String movieName, int hallNumber, int rowNumber, int chairNumber, int ticketPrice){
        this.chairNumber = chairNumber;
        this.movieName = movieName;
        this.hallNumber = hallNumber;
        this.rowNumber = rowNumber;
        this.ticketPrice = ticketPrice;
    }
    public boolean equalOrders(orders order){ return this.equalOrders(order); }
    public void describeOrder (){
        System.out.println("The order for" + this.movieName + "is ready. You'll be sitted at row number" + this.rowNumber +
            "and the chair number is" + this.chairNumber + "in hall number " + this.hallNumber + ". The ticket's price is " + this.ticketPrice);
    }
}