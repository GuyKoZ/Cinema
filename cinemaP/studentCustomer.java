package CinemaP;
import java.time.LocalDate;

public final class StudentCustomer extends Customers implements Discount { // sun of customer 
    // relevant attributes
    private String academicInstitution;
    private LocalDate graduationDate;
    // relevant constructer 
    public StudentCustomer(String name, String email, String id, String phoneNumber, int age, LocalDate graduationDate, String academicInstitution) {
        super(name, email, id, phoneNumber, age);
        this.academicInstitution = academicInstitution;
        this.graduationDate = graduationDate;
    }

    @Override
    public double receiveDiscount(double cost) {
        LocalDate currentDate = LocalDate.now();
        boolean answer = currentDate.isBefore(graduationDate); // check if the student still before graduation
        if (answer) {
            return cost * 0.5; // eligible for discount
        }
        return cost; // the entity isn't studnent and not eligible
    }

}
