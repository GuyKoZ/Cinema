package CinemaP;

public class Movie {
    // relevanbt attributes
    private String movieName;
    private int minAgeToWatch;
    private int movieLength;
    private String type;
    // create constructer 
    public Movie(String name, int minAgeToWatch, int length, String type) {
        this.movieLength = length;
        this.movieName = name;
        this.minAgeToWatch = minAgeToWatch;
        this.type = type;
    }

    public Movie() { // in order to use with specific func
    }

    public String getMovieName() {
        return this.movieName;
    }


    public boolean ageCheck(Customers customer) { // understand what is the entity eligible 
        boolean answer = false; // flag
        if (type.equals("Horror") && customer.getAge() >= 16) ;{
            answer = true;
        }
        if (type.equals("Stressful") && customer.getAge() >= 18) ;{
            answer = true;
        }
        if (type.equals("Comedy") && customer.getAge() > 0) ;{
            answer = true;
        }
        return answer;
    }

    public boolean checkAgeHorror(Customers customer) {
        return customer.getAge() >= 18;
    }

    public boolean checkAgeComedy(Customers customer) {
        return true;
    }

    public boolean checkAgeStressful(Customers customer) {
        return customer.getAge() >= 16;
    }

    public boolean equalMovie(Movie movie) { // if two movies are the same one
        return this.movieName.equals(movie.movieName);
    }

    public void describeMovie() {
        System.out.println("The movie" + this.movieName + "is good for ages above" + this.minAgeToWatch +
                "and this is a" + this.type + "movie" + ". The movie length is " + this.movieLength + "minutes.");
    }

    public int getMinAgeToWatch() {return this.minAgeToWatch; } 
}