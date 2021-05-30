package CinemaP;

public final class Orders {
    // relevant attributes
    private String movieName;
    private int hallNumber;
    private int rowNumber;
    private int chairNumber;
    private double ticketPrice;
    // create constructer
    public Orders(String movieName, int hallNumber, int rowNumber, int chairNumber, double ticketPrice) {
        this.movieName = movieName;
        this.hallNumber = hallNumber;
        this.rowNumber = rowNumber;
        this.chairNumber = chairNumber;
        this.ticketPrice = ticketPrice;
    }

    public boolean equalOrders(Orders order) { // if two orders are the same 
        return this.equalOrders(order);
    }

    public void describeOrder() {
        System.out.println("The order for " + this.movieName + " is ready. You'll be sitted at row number " + this.rowNumber +
                " and the chair number is " + this.chairNumber + " in hall number " + hallNumber + ".\n" + "The ticket's price is " + this.ticketPrice);
    }
}