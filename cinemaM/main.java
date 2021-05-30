package CinemaM;
import java.time.LocalDate; // To calculate the current date 
import java.util.ArrayList;

//Importing all packages
import CinemaP.Cinema;
import CinemaP.Hall;
import CinemaP.LargeHall;
import CinemaP.VIPHall;
import CinemaP.SmallHall;
import CinemaP.Discount;
import CinemaP.Customers;
import CinemaP.Orders;
import CinemaP.PensionerCustomer;
import CinemaP.SoldierCustomer;
import CinemaP.StudentCustomer;
import CinemaP.Employees;
import CinemaP.Movie;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customers> customersArrayList = new ArrayList<>(); // define cutomer and employee arrays
        ArrayList<Employees> employeesArrayList = new ArrayList<>();
        double[] daysMonth = new double[30]; // init month
        LocalDate releaseDate = LocalDate.of(2022, 10, 9);
        LocalDate graduationDate = LocalDate.of(2023, 2, 17);
	// init new cinema
        Cinema cinemaCity = new Cinema("The Cinema", customersArrayList, employeesArrayList, 3, 8);
	// init customers
        Customers c1 = new SoldierCustomer("kobi", "kobihazout@gmail.com", "202874233", "1111111111", 26, releaseDate);
        Customers c2 = new PensionerCustomer("kobi", "kobihazout@gmail.com", "202874233", "222222222", 26);
        Customers c3 = new Customers("kobi", "kobihazout@gmail.com", "202874233", "33333333", 26);
        Customers c4 = new StudentCustomer("kobi", "kobihazout@gmail.com", "202874233", "444444444", 26, graduationDate, "MTA");
	// adding customer to array
        customersArrayList.add(c1);
        customersArrayList.add(c2);
        customersArrayList.add(c3);
        customersArrayList.add(c4);
	// init employees
        Employees e1 = new Employees("kobi", "kobihazout@gmail.com", "202874233", "0549789001", 26, 31, daysMonth);
        Employees e2 = new Employees("guy", "kobihazout@gmail.com", "312654654", "65454546", 26, 32, daysMonth);
	// adding employees to array
        employeesArrayList.add(e1);
        employeesArrayList.add(e2);
	// init movies
        Movie m1 = new Movie("kobiguy", 18, 126, "Horror");
        Movie m3 = new Movie("kobiguy2", 11, 50, "Stressful");
        Movie m2 = new Movie("how blalba", 14, 90, "Comedy");
	// add movies to the cinema
        cinemaCity.addMovie(m1);
        cinemaCity.addMovie(m2);
        cinemaCity.addMovie(m3);
	
	// the desired func, 3 selling of each kind, update movie, and descripition of the cinema
        cinemaCity.sellMovieTicket();
        cinemaCity.sellMovieTicket();
        cinemaCity.sellMovieTicket();
        cinemaCity.sellPopcorn();
        cinemaCity.sellPopcorn();
        cinemaCity.sellPopcorn();
        cinemaCity.updateMovie(m1,"kobiguy2");
        cinemaCity.describeCinema();
    }
}
