
public class largeHall extends hall {

    public largeHall(int hallNumber, int rows, int columns, movie movie, int[][] movieArray) {
        super(hallNumber, rows, columns, movie, movieArray);
        rows = 16;  //check
        columns = 20; //check
        int[][] largeHallMatrix = new int[rows][columns];
        int ticketPrice = 30;
    }

    public orders buyTickets(customers customer) {
        return null;
    }
}
