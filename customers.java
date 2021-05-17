import java.util.ArrayList;
import java.util.Random;


public abstract class customers {
    private String name;
    private String email;
    private String id;
    private String phoneNumber;
    private int age;
    public customers (String name, String email, String id, String phoneNumber, int age){
        this.email = email;
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public int getAge(){return this.age;}
    public String getId(){return this.id;}
    public String getName(){return this.name;}
    public String getPhoneNumber(){return this.phoneNumber;}
    public movie chooseMovie (movie [] movieList){
    movie choice = null;
    boolean flag = false;
    Random rn = new Random();
    int size = rn.nextInt(movieList.length);
    while (flag == false) {
        if (this.age >=movieList[size].getMinAgeToWatch());{
            choice = movieList[size];
            flag = true;
            break;
        }
    }
    return choice;
    }
    public String choosePopcorn (){
        Random rn = new Random();
        int size = rn.nextInt(3) + 1;
        String size2;
        if(size == 1) {
            size2 = "Big";
            return size2;
        }
        if (size == 2)  {
            size2 = "Medium";
            return size2;
        }
        size2 = "Small";
        return size2;
    }
    public abstract double  recieveDiscount (double cost );

    public boolean equalCustomer (customers customer) { return this.id.equals(customer.id);}
    public void describeCustomer (){
        System.out.println(this.name + "is" + this.age + "years old. This is the contact information:" + this.phoneNumber);
    }
}