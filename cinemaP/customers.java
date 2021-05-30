package CinemaP;
import java.util.Random;

public class Customers implements Discount { // using discount
    final private String name;
    final private String email;
    final private String id;
    final private String phoneNumber;
    final private int age;

    // cunstroctur 
    public Customers(String name, String email, String id, String phoneNumber, int age) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    // cheking if two customer are the same one
    public boolean equalCustomer(Customers customer) {
        return this.id.equals(customer.id);
    }
    
    public void describeCustomer() {
        System.out.println(this.name + " is " + this.age + " years old. This is the contact information: " + this.phoneNumber);
    }
   
    public Movie chooseMovie(Movie[] movieList) { // get an array
        Movie choice;
        int size, count = 0;
        boolean flag = false;
        Random rn = new Random();
        size = rn.nextInt(movieList.length);
        choice = movieList[size];
        while (!flag && count < movieList.length) { // ranbdomize over and over untill found
            if (choice == null) {
                size = rn.nextInt(movieList.length);
                choice = movieList[size];
            } else {
                flag = true;
            }
            count++;
        }
        flag = false;
        while (!flag) {
            if (this.age >= movieList[size].getMinAgeToWatch()) ;
            {
                choice = movieList[size];
                flag = true;
            }
        }
        return choice;
    }

    @Override
    public double receiveDiscount(double cost) {
        return cost;
    }

    public String choosePopcorn() {
        Random rn = new Random();
        int size = rn.nextInt(3) + 1; // random number between 1 to 3. 1 = big, 2 = medium, 3 = small
        String size2;
        if (size == 1) {
            size2 = "Big";
            return size2;
        }
        if (size == 2) {
            size2 = "Medium";
            return size2;
        }
        size2 = "Small";
        return size2;
    }

    public int getAge() {return this.age; }
    public String getId() {return this.id; }
    public String getName() {return this.name; }
    public String getPhoneNumber() {return this.phoneNumber; }

}