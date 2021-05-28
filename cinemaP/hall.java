package cinemaP;

public abstract class hall {
    protected int hallNumber;
    public int rows;
    public int columns;
    public movie movie;
    protected int[][] movieArray;

    public hall(int hallNumber, int rows, int columns, movie movie, int[][] movieArray) {
        this.columns = columns;
        this.rows = rows;
        this.hallNumber = hallNumber;
        this.movie = movie;
        this.movieArray = movieArray;
        this.movieArray = new int[rows][columns]; //array size in the constructor or in the class?
    }

    public hall() {}

    public abstract orders buyTickets(customers customer);

    public void updateMovie(movie movie) { //if value of some index == null its empty chair.
        this.movie = movie;
        movieArray = null;
    }
}