import java.util.Calendar;

public class studentCustomer extends customers {

    private String academicInstitution;
    private int dateOfGraduation;


    public studentCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber, age);

    }
    private int getDateOfGraduation(){return this.dateOfGraduation;}
    private String getAcademicInstitution(){return this.academicInstitution;}
}
