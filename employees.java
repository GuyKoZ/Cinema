public class employees extends customers{
    private double arr[] = new double[30];
    private int salaryPerHour;

    public employees(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber,age);
    }
    public void sellPopcorn(String size, customers customer){


    }
    public void sellTicket(customers customer, movie movie){

    }
    public void calculateSalary(){

    }


    public boolean equalEmployee(employees employee){ return this.getId().equals(employee.getId()); }
    public void describeEmployee (){
        System.out.println(this.getName() + "is" + this.getAge() + "years old. This is the contact information:" + this.getPhoneNumber());
    }
}
