package CinemaP;

public final class LargeHall extends Hall { // sun of hall
    // relevant constructer
    public LargeHall(int ticketPrice, int hallNumber, int rows, int columns, Movie movie, int[][] movieArray) {
        super(ticketPrice, hallNumber, rows, columns, movie, movieArray);
        ticketPrice = 42;
        this.hallNumber = hallNumber;
        this.rows = rows;
        this.columns = columns;
        this.movie = movie;
        this.movieArray = movieArray;
        rows = 16;
        columns = 20;
        movieArray = new int[this.rows][this.columns];
    }
    // relevant constructer to specific func
    public LargeHall(int hallNumber, Movie movie) {
        ticketPrice = 42;
        this.hallNumber = hallNumber;
        this.movie = movie;
        rows = 16;
        columns = 20;
        movieArray = new int[this.rows][this.columns]; // init array by demand
    }

    @Override
    public Orders buyTickets(Customers customer) {
        int flag = 0, rowNumberTicket = 0, columnNumberTicket = 0;
        for (int i = rows - 1; i >= 0 && flag == 0; i--) { // starting from the upper right corner 
            for (int j = columns - 1; j >= 0 && flag == 0; j--) {
                if (movieArray[i][j] == 0) {
                    movieArray[i][j]++;
                    rowNumberTicket = i;
                    columnNumberTicket = j;
                    flag++;
                }
            }
        }
        double ticketFinalPrice = customer.receiveDiscount(this.ticketPrice);
        return new Orders(movie.getMovieName(), this.hallNumber, rowNumberTicket + 1, columnNumberTicket + 1, ticketFinalPrice); // +1 to give the corrct row and chair number
    }
}
