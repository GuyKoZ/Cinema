import java.util.ArrayList;

public class cinema {
    private String cinemaName;
    private ArrayList<movie> movieArrayList;
    private ArrayList<hall> hallArrayList;


    public void setName(String name){
        this.cinemaName = name;
    }

    public void addMovie (movie movie){

    }
    public void updateMovie (movie movie){

    }
    public void addEmployee (employees employee){

    }
    public void deleteEmployee (employees employee){

    }
    public void sellMovieTicket (customers customers, employees employee){

    }
    public void sellPopcorn (customers customers, employees employee){

    }
    public boolean equalCinema(cinema cinema) {return this.equals(cinema);}
}