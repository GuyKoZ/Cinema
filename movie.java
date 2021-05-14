import java.util.ArrayList;


public class movie {
    private String movieName;
    private int minAgeToWatch;
    private int movieLength;

    public movie (String name, int age, int length){
        this.movieLength = length;
        this.movieName = name;
        this.minAgeToWatch = age;
    }
    public checkAgeHorror(customers customer){
        if (customers.age >= 18) return true;
    }
    public checkAgeComedy(customers customer){
        return true;
    }
    public checkAgStressful(customers customer){
        if (customers.age >= 16) return true;
    }

}