public class movie {
    private String movieName;
    private int minAgeToWatch;
    private int movieLength;

    public movie (String name, int age, int length){
        this.movieLength = length;
        this.movieName = name;
        this.minAgeToWatch = age;
    }

    public String getMovieName(){return this.movieName;}
    public int getMinAgeToWatch(){return this.minAgeToWatch;}
    public int getMovieLength(){return this.movieLength;}
    public boolean checkAgeHorror(customers customer){
        if (customer.getAge() >= 18) return true;
        return false;
    }
    public boolean checkAgeComedy(customers customer){
        return true;
    }
    public boolean checkAgStressful(customers customer){
        if (customer.getAge() >= 16) return true;
        return false;
    }
    public boolean equalMovie(movie movie){ return this.movieName.equals(movie.movieName); }
    public void describeMovie (){
        System.out.println("The movie" + this.movieName + "is good for ages above" + this.minAgeToWatch +
                "and this is a" + this.get + ". The movie length is " + this.movieLength + "minutes.");
    }
}