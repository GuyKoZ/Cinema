import java.time.LocalDate;
import java.util.Date;

public class studentCustomer extends customers {

    private String academicInstitution;
    LocalDate graduationDate;


    public studentCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber, age);
    }

    public LocalDate getGraduationDate (){ return graduationDate; }
    public void setGraduationDate(LocalDate graduationDate) { this.graduationDate = graduationDate;  }
    private LocalDate getDateOfGraduation(){return this.graduationDate;}
    private String getAcademicInstitution(){return this.academicInstitution;}

    @Override
    public double recieveDiscount(double cost) {
        LocalDate currentDate = LocalDate.now();
        boolean answer = currentDate.isBefore(graduationDate);
        if (answer){
            return cost*0.5;
        }
        else {
            return cost;
        }
    }

}
