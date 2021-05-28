import java.util.ArrayList;

public abstract class orders extends hall {
    private String movieName;
    private int rowNumber;
    private int chairNumber;
    private int ticketPrice;

//    public orders(int hallNumber, int rows, int columns, movie movie, int[][] movieArray) {
//        super(hallNumber, rows, columns, movie, movieArray);
//        this.movieName = movieName;
//        this.rowNumber = rowNumber;
//        this.chairNumber = chairNumber;
//        this.ticketPrice = ticketPrice;
//    }


    public orders(int hallNumber, int rows, int columns, movie movie, int[][] movieArray, String movieName, int rowNumber, int chairNumber, int ticketPrice) {
        super(hallNumber, rows, columns, movie, movieArray);
        this.movieName = movieName;
        this.rowNumber = rowNumber;
        this.chairNumber = chairNumber;
        this.ticketPrice = ticketPrice;
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

//    public orders buyTickets(customers customer) {
//        double price;
//        movie choose;
//        price = customer.recivedDiscount(ticketPrice);
//        choose =  customer.chooseMovie(movieArrayList);
//        choose - customer.chooseMovie(m)
//    }
}