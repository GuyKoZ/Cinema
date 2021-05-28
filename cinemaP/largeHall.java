package cinemaP;
import java.util.Arrays;

public class largeHall extends hall {
    public largeHall(int ticketPrice, int hallNumber, int rows, int columns, cinemaP.movie movie, int[][] movieArray) {
        super(ticketPrice, hallNumber, rows, columns, movie, movieArray);
        rows = 16;  //check
        columns = 20; //check
        ticketPrice = 42;
        movieArray = new int[rows][columns];
        for (int [] row: movieArray){
            Arrays.fill(row,0);
        }
    }
    public orders buyTickets(customers customer) {
        int flag = 0;
        int rowNumberTicket = 0;
        int columnNumberTicket = 0;
        for (int i = rows; i > 0 && flag == 0 ; i--) {
            for (int j = columns; j > 0  && flag == 0; j--) {
                if (movieArray[i][j] != 0) {
                    movieArray[i][j]++;
                    rowNumberTicket = i;
                    columnNumberTicket = j;
                    flag++;
                }
            }
        }
        double ticketFinalPrice = customer.recivedDiscount(ticketPrice);
        orders ticket = new orders(this.hallNumber, rowNumberTicket, columnNumberTicket, movie.getMovieName(), ticketFinalPrice) {
            @Override
            public orders buyTickets(customers customer) {
                return null;
            }
        };
        return ticket;
    }
}

