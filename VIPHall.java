import java.util.Calendar;

public class VIPHall extends hall {

    public VIPHall(int hallNumber, int rows, int columns, movie movie, int[][] movieArray) {
        super(hallNumber, rows, columns, movie, movieArray);
        rows = 8; //check
        columns = 12; //check
        int[][] smallHallMatrix = new int[rows][columns];
        int ticketPrice = 67;
    }

    public orders buyTickets(customers customer) {
        return null;
    }
}

