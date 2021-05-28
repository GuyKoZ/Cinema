package cinemaP;

public class movie {
    private String movieName;
    private int minAgeToWatch;
    private int movieLength;
    private String type;
    public movie (String name, int age, int length, String type){
        this.movieLength = length;
        this.movieName = name;
        this.minAgeToWatch = age;
        this.type = type;
    }

    public String getMovieName(){return this.movieName;}
    public int getMinAgeToWatch(){return this.minAgeToWatch;}
    public String getType() {return type;}
    public int getMovieLength(){return this.movieLength;}

    public boolean ageCheck(customers customer){
        boolean answer = false;
        if(type.equals("Horror") && customer.getAge()>=16);
        {
            answer = true;
        }
        if(type.equals("Stressful") && customer.getAge()>=18);
        {
            answer = true;
        }
        if(type.equals("Comedy") && customer.getAge()>0);
        {
            answer = true;
        }
        return answer;
    }
    public boolean checkAgeHorror(customers customer){
        if (customer.getAge() >= 18) return true;
        return false;
    }
    public boolean checkAgeComedy(customers customer){
        return true;
    }
    public boolean checkAgStressful(customers customer){
        if (customer.getAge() >= 16) {return true;}
        else{ return false;}
    }

    public boolean equalMovie(movie movie){ return this.movieName.equals(movie.movieName); }
    public void describeMovie (){
        System.out.println("The movie" + this.movieName + "is good for ages above" + this.minAgeToWatch +
                "and this is a" + this.type +"movie" + ". The movie length is " + this.movieLength + "minutes.");
    }
}
