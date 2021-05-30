package CinemaP;
import java.util.ArrayList;
import java.util.Random;

public final class Cinema {
    // define attributes
    private String cinemaName;
    private ArrayList<Customers> customersArrayList;
    private ArrayList<Employees> employeesArrayList;
    public Movie[] movieArrayList;
    private Hall[] hallArrayList;
    private final int numOfMovies;
    private final int numOfHalls;
    // constructor and init new cinema 
    public Cinema(String cinemaName, ArrayList<Customers> customersArrayList, ArrayList<Employees> employeesArrayList, int numOfMovies, int numOfHalls) {
        this.cinemaName = cinemaName;
        this.customersArrayList = customersArrayList;
        this.employeesArrayList = employeesArrayList;
        this.numOfMovies = numOfMovies;
        this.numOfHalls = numOfHalls;
        movieArrayList = new Movie[numOfMovies];
        hallArrayList = new Hall[numOfHalls];
        int caculateHalls = numOfHalls / 3;   //for every halls which is bigger then 3 it will go to the first loop.and repeat caculateHalls/3 times
        int caculateHallsRest = numOfHalls % 3; // If number of halls Is small or equal to 3, go to the second loop. and repeat caculateHallsrest times
        //if number of halls is 0 it will not be added to halls.
        int i, numHall = 1, z = 0,j;
        for (i = 0; i < caculateHalls; i++,numHall++) { // init all 3 types of halls to the hall array
            Hall hall1 = new SmallHall(numHall, null);
            hallArrayList[numHall-1] = hall1;
            numHall++;
            Hall hall2 = new VIPHall(numHall, null);
            hallArrayList[numHall-1] = hall2;
            numHall++;
            Hall hall3 = new LargeHall(numHall, null);
            hallArrayList[numHall-1] = hall3;
        }
        for (j = 0; j < caculateHallsRest; j++, i++,numHall++) { // init all 3 types of halls to the hall array
            Hall hall4 = new SmallHall(numHall, null);
            hallArrayList[numHall-1] = hall4;
        }
    }

    public void addMovie(Movie movie) {
        int maxMovieToAdd, flag2 = 0, flag = 0, count = 0,i;
        double sum = (double) movieArrayList.length / (double) hallArrayList.length; // calcultae the max to add 
        maxMovieToAdd = (int) Math.ceil(sum); 
        try {
            for (int z = 0; z < movieArrayList.length && flag2 == 0; z++) {
                if (movieArrayList[z] == null) {
                    for (i = 0; i < hallArrayList.length && flag == 0; i++) {
                        if (hallArrayList[i].getMovie() == null) { // if there's no movie
                            flag = 1; 
                            movieArrayList[z] = movie;
                            System.out.println("Movie added to movie list: " + movieArrayList[z].getMovieName()); // notify the user
                            flag2 = 1;
                            if (count < maxMovieToAdd) { // checking if smaller from max to add
                                hallArrayList[i].updateMovie(movie);
                                System.out.println("The movie added to hall list: " + movieArrayList[z].getMovieName()); // notify the user
                                count++;
                            }
                        }
                    }
                }
            }
            if (flag == 0 && flag2 == 0) {
                System.out.println("The movie not been added, please try again");
            }
        } catch (Exception error) {
            System.out.println("Something get wrong please try again");
        }
    }

    public void updateMovie(Movie movie, String movieName) {
        int flag = 0, i, saveIndex = 0;
        for (i = 0; i < movieArrayList.length && flag == 0; i++) { 
            if (movieArrayList[i].getMovieName() == movieName) { // searcing for that particular movie name, if found, breaking the loop
                flag = 1;
                saveIndex = i;
            }
        }
        if (flag == 0) { // no movie has found in the array
            System.out.println("The movie name not exist on the movie list");
        } else {
            movieArrayList[saveIndex] = movie;
            System.out.println("The new movie replaced with the old one"); // notify for replacement 
            for (i = 0; i < hallArrayList.length && hallArrayList[i].getMovie() != null; i++) {
                if (hallArrayList[i].getMovie().getMovieName() == movieName) {
                    hallArrayList[i].updateMovie(movie);
                    System.out.println("The movie updated in hall number:" + hallArrayList[i].getHallNumber());
                }
            }
        }
    }

    public void addEmployee(Employees employee) { 
        this.employeesArrayList.add(employee);
        System.out.println("Employee added successfully");
    }

    public void deleteEmployee(Employees employee) {
        this.employeesArrayList.remove(employee); 
        System.out.println("Employee deleted successfully");
    }

    public void describeCinema() {
        System.out.println("Cinema name: " + this.cinemaName + "\nNumber of movies that presented in the cinema: " + movieArrayList.length + "\nNumber of cinema halls that exist are: " + this.hallArrayList.length + "\n");
    }

    public void sellMovieTicket() { // randomize customer and employee and selling ticket
        Employees employee;
        Customers customer;
        Orders order;
        Movie movie;
        Random rn = new Random();
        int random = rn.nextInt(customersArrayList.size());
        customer = customersArrayList.get(random); 
        random = rn.nextInt(employeesArrayList.size());
        employee = employeesArrayList.get(random);
        movie = customer.chooseMovie(movieArrayList);
        order = employee.sellTicket(customer, movie, hallArrayList);
        System.out.println("The customer who bought the ticket: ");
        customer.describeCustomer();
        System.out.println("The employee who sold the ticket: ");
        employee.describeEmployee();
        System.out.println("Order details: ");
        order.describeOrder();
    }

    public void sellPopcorn() {
        Employees employee;
        Customers customer;
        String size;
        Random rn = new Random();
        int random = rn.nextInt(customersArrayList.size());
        customer = customersArrayList.get(random);
        random = rn.nextInt(employeesArrayList.size());
        employee = employeesArrayList.get(random);
        size = customer.choosePopcorn();
        double price = employee.sellPopcorn(size, customer); // sending relevant parameters to selling popcorn func
        System.out.println("Popcorn size is: " + size + "popcorn price is: " + price);
        employee.describeEmployee();
        customer.describeCustomer();
    }

    public boolean equalCinema(Cinema cinema) { // checking if 2 cinemas are equal
        return this.equals(cinema);
    }
}