package CinemaP;

public final class Employees extends Customers {// ASSUMING employee CAN'T be pensioner/student/soldier !!!!!!!
    final private double[] daysMonth;
    final private int salaryPerHour;

    public Employees(String name, String email, String id, String phoneNumber, int age, int salaryPerHour, double[] daysMonth) {
        super(name, email, id, phoneNumber, age);
        this.daysMonth = daysMonth;
        this.salaryPerHour = salaryPerHour;
    }

    public double sellPopcorn(String size, Customers customer) { // relevant prices which provided 
        double price;
        if (size.equals("Big")) {
            price = 30;
        } else if (size.equals("Small")) {
            price = 10;
        } else {
            price = 20;
        }
        price = customer.receiveDiscount(price);
        return price;
    }

    public Orders sellTicket(Customers customer, Movie movie, Hall[] halls) {
        int i, maxSeats = 0, freeSeats, saveIndex = 0;
        Orders order;
        for (i = 0; i < halls.length && halls[i].getMovie() != null; i++) { // check in halls array and verify there's no null before searching
            if (halls[i] != null && halls[i].getMovie().equalMovie(movie)) {
                freeSeats = halls[i].countSeats(halls[i]);
                if (freeSeats > maxSeats) {
                    maxSeats = freeSeats; // for next iteration
                    saveIndex = i; // to save the relevant place
                }
            }
        }
        order = halls[saveIndex].buyTickets(customer);
        return order;
    }

    public double calculateSalary() { // calculate using the salary per hour which provided
        double salary = 0;
        for (double i : daysMonth) {
            salary = salary + (i * salaryPerHour);
        }
        return salary;
    }

    public boolean equalEmployee(Employees employee) { // verify if this is the same entity
        return this.getId().equals(employee.getId());
    }

    public void describeEmployee() {
        System.out.println(this.getName() + "is " + this.getAge() + " years old. This is the contact information: " + this.getPhoneNumber());
    }

    @Override
    public double receiveDiscount(double cost) {
        return cost;
    }
}