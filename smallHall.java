import java.util.Calendar;

public class smallHall extends hall {

    public smallHall(int hallNumber, int rows, int columns, movie movie, int[][] movieArray) {
        super(hallNumber, rows, columns, movie, movieArray);
        rows = 8; //check
        columns = 10; //check
        int[][] smallHallMatrix = new int[rows][columns];
        int ticketPrice = 42;
    }

    public orders buyTickets(customers customer) {
        return null;
    }
}

