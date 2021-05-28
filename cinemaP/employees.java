package cinemaP;

import java.util.ArrayList;
package cinemaP;

public abstract class employees  extends customers implements discount {
    private double[] arr;
    private int salaryPerHour;

    public employees(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber, age);
        this.arr = new double[30];
        this.salaryPerHour = salaryPerHour;
    }

    public double sellPopcorn(String size, customers customer) {
        double price;
        if (size.equals("Big")) {
            price = 30;
        } else if (size.equals("Small")) {
            price = 10;
        } else price = 20;
        price = customer.recivedDiscount(price);
        return price;
    }

    public void sellTicket(customers customer, movie movie) {

        double price;
     // price = customer.recivedDiscount();

    }

    public double calculateSalary(){
        double salary = 0;
        for(double i:arr){
          salary = salary + (i * salaryPerHour);
        }
        return salary;
     }

    public boolean equalEmployee(employees employee) {
        return this.getId().equals(employee.getId());
    }

    public void describeEmployee() {
        System.out.println(this.getName() + "is" + this.getAge() + "years old. This is the contact information:" + this.getPhoneNumber());
    }
}