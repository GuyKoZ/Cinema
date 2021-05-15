import java.util.ArrayList;

public class customers {
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

    public customers() {

    }

    public int getAge(){return this.age;}
    public String getId(){return this.id;}
    public String getName(){return this.name;}
    public String getPhoneNumber(){return this.phoneNumber;}
    public movie chooseMovie (movie movieList){

        //return
    }
    public void choosePopcorn (){

    }
    public void recieveDiscount (int cost ){

    }

    public boolean equalCustomer (customers customer) { return this.id.equals(customer.id);}
    public void describeCustomer (){
        System.out.println(this.name + "is" + this.age + "years old. This is the contact information:" + this.phoneNumber);
    }
}