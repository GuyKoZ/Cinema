package cinemaP;
import java.util.ArrayList;

public class cinema {
    private String cinemaName;
    private ArrayList<customers> customersArrayList;
    private ArrayList<employees> employeesArrayList;
    public ArrayList<movie> movieArrayList;
    private ArrayList<hall> hallArrayList;

    public void setName(String name){
        this.cinemaName = name;
    }
    public String getCinemaName() { return cinemaName; }
    public ArrayList<customers> getCustomersArrayList() { return customersArrayList; }
    public ArrayList<employees> getEmployeesArrayList() { return employeesArrayList; }
    public ArrayList<movie> getMovieArrayList() { return movieArrayList; }
    public ArrayList<hall> getHallArrayList() { return hallArrayList; }

    public cinema(String cinemaName, ArrayList<customers> customersArrayList, ArrayList<employees> employeesArrayList, ArrayList<movie> movieArrayList, ArrayList<hall> hallArrayList) {
        this.cinemaName = cinemaName;
        this.customersArrayList = customersArrayList;
        this.employeesArrayList = employeesArrayList;
        this.movieArrayList = movieArrayList;
        this.hallArrayList = hallArrayList;
    }

    public void addMovie (movie movie){

    }
    public void updateMovie (movie movie){

    }
    public void addEmployee (employees employee){
        this.employeesArrayList.add(employee);
        System.out.println("Employee added successfully");
    }
    public void deleteEmployee (employees employee){
        this.employeesArrayList.remove(employee); //works?
        System.out.println("Employee deleted successfully");
    }
    public void sellMovieTicket (customers customers, employees employee){


    }
    public void sellPopcorn (customers customers, employees employee){


    }
    public boolean equalCinema(cinema cinema) {return this.equals(cinema);}
}