package cinemaP;

public abstract class hall {
    int ticketPrice;
    protected int hallNumber;
    public int rows;
    public int columns;
    public movie movie;
    protected int[][] movieArray;

    public hall(int ticketPrice, int hallNumber, int rows, int columns, cinemaP.movie movie, int[][] movieArray) {
        this.ticketPrice = ticketPrice;
        this.hallNumber = hallNumber;
        this.rows = rows;
        this.columns = columns;
        this.movie = movie;
        this.movieArray = movieArray;
        this.movieArray = new int[rows][columns]; //array size in the constructor or in the class?

    }
    public hall() { }

    public cinemaP.movie getMovie() { return movie; }

    public int getTicketPrice() { return ticketPrice; }
    public int getHallNumber() { return hallNumber; }

    public int getRows() { return rows; }

    public int getColumns() { return columns; }

    public int[][] getMovieArray() { return movieArray; }

    public int countSeats() {
        int count = 0;
        for(int i = 0; i < columns; ++i) {
            for(int j = 0; j < rows; ++j) {
                if (movieArray[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public abstract orders buyTickets(customers customer);

    public void updateMovie(movie movie) { //if value of some index == null its empty chair.
        this.movie = movie;
        movieArray = null;
    }
}
