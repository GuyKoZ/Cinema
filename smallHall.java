import java.util.Arrays;
import java.util.Calendar;

public class smallHall extends hall {
    private int ticketPrice = 42;


    public smallHall(int hallNumber, int rows, int columns, movie movie, int[][] movieArray) {
        super(hallNumber, rows, columns, movie, movieArray);
        rows = 8; //check
        columns = 10; //check
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
        orders ticket = new orders(this.hallNumber, rowNumberTicket,columnNumberTicket, movie.getMovieName(), ticketFinalPrice );
        return ticket;
    }
}

