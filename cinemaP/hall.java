package CinemaP;

public abstract class Hall {
    // relevant attributes
    protected int ticketPrice;
    protected int hallNumber;
    public int rows;
    public int columns;
    protected Movie movie;
    protected int[][] movieArray;
    // create constructer and init the array with relevant rows and columns
    public Hall(int ticketPrice, int hallNumber, int rows, int columns, Movie movie, int[][] movieArray) {
        this.ticketPrice = ticketPrice;
        this.hallNumber = hallNumber;
        this.rows = rows;
        this.columns = columns;
        this.movie = movie;
        this.movieArray = movieArray;
        this.movieArray = new int[rows][columns];
    }

    public Hall() { } // empty for use of other func

    public Movie getMovie() { return this.movie; }

    public int getHallNumber() {
        return this.hallNumber;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int[][] getMovieArray() {
        return movieArray;
    }

    public int countSeats(Hall hall) { // count how many seats in the matrix 
        int count = 0;
        for (int j = 0; j < hall.getRows(); ++j) {
            for (int i = 0; i < hall.getColumns(); ++i) {
                if (hall.getMovieArray()[j][i] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public abstract Orders buyTickets(Customers customer);

    public void updateMovie(Movie movie) {
        this.movie = movie;
        this.movieArray = new int[this.rows][this.columns];
    }
}