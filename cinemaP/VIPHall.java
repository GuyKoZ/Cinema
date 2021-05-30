package CinemaP;

public final class VIPHall extends Hall { // sum of hall
    // create relevant construcet 
    public VIPHall(int ticketPrice, int hallNumber, int rows, int columns, Movie movie, int[][] movieArray) {
        super(ticketPrice, hallNumber, rows, columns, movie, movieArray);
        ticketPrice = 67;
        this.hallNumber = hallNumber;
        this.rows = rows;
        this.columns = columns;
        this.movie = movie;
        this.movieArray = movieArray;
        rows = 8;
        columns = 12;
        movieArray = new int[this.rows][this.columns]; // init VIP hall with relevant size
    }
    // another constructer to relevant specific func
    public VIPHall(int hallNumber, Movie movie) {
        ticketPrice = 67;
        this.hallNumber = hallNumber;
        this.movie = movie;
        rows = 8;
        columns = 12;
        movieArray = new int[this.rows][this.columns];
    }

    @Override
    public Orders buyTickets(Customers customer) {
        int flag = 0,rowNumberTicket = 0,columnNumberTicket = 0;
        for (int i = rows - 1; i >= 0 && flag == 0; i--) { // starting selling from upper right corner
            for (int j = columns - 1; j >= 0 && flag == 0; j--) {
                if (movieArray[i][j] == 0) {
                    movieArray[i][j]++;
                    rowNumberTicket = i;
                    columnNumberTicket = j;
                    flag++; // in order to break the loop, the ticket has been bought
                }
            }
        }
        double ticketFinalPrice = customer.receiveDiscount(this.ticketPrice);
        return new Orders(this.movie.getMovieName(), this.hallNumber, rowNumberTicket + 1, columnNumberTicket + 1, ticketFinalPrice); // +1 to return the corrent seat and row
    }
}

