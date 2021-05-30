package CinemaP;

public final class SmallHall extends Hall { // sum of hall
    // relevant constructer 
    public SmallHall(int ticketPrice, int hallNumber, int rows, int columns, Movie movie, int[][] movieArray) {
        super(ticketPrice, hallNumber, rows, columns, movie, movieArray);
        ticketPrice = 30;
        this.hallNumber = hallNumber;
        this.rows = rows;
        this.columns = columns;
        this.movie = movie;
        this.movieArray = movieArray;
        columns = 10;
        rows = 8;
        movieArray = new int[this.rows][this.columns];
    }

    public SmallHall(int hallNumber, Movie movie) { // specific constructer to the use of specific func
        ticketPrice = 30;
        this.hallNumber = hallNumber;
        this.movie= movie;
        columns = 10;
        rows = 8;
        movieArray = new int[this.rows][this.columns];
    }

    @Override
    public Orders buyTickets(Customers customer) {
        int flag = 0,rowNumberTicket = 0,columnNumberTicket = 0;
        for (int i = rows - 1; i >= 0 && flag == 0; i--) { // starting to sell from the upper right corner
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
        return new Orders(movie.getMovieName(), this.hallNumber, rowNumberTicket + 1, columnNumberTicket + 1, ticketFinalPrice); // to return the correct seat and row
    }
}

