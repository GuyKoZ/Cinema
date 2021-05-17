public class employees extends customers{ // not sure
    private double [] arr;
    private int salaryPerHour;

    public employees(String name, String email, String id, String phoneNumber, int age, double[] arr, int salaryPerHour) {
        super(name, email, id, phoneNumber, age);
        this.arr = new double[30];
        this.salaryPerHour = salaryPerHour;
    }
    public double sellPopcorn(String size, customers customer){
        double prise;
        if (size.equals("Big")) {
            prise = 30;
        }
        else if (size.equals("Small")){
            prise = 10;
        }
        else prise = 20;
        prise = prise * customer.recieveDiscount(prise);
        return prise;
    }
    public void sellTicket(customers customer, movie movie){

    }
    public void calculateSalary(){

    }
    public boolean equalEmployee(employees employee){ return this.getId().equals(employee.getId()); }
    public void describeEmployee (){
        System.out.println(this.getName() + "is" + this.getAge() + "years old. This is the contact information:" + this.getPhoneNumber());
    }

    public double recieveDiscount(double cost) {
        return 0;  // change price for
    }
}
