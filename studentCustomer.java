import java.util.Date;

public class studentCustomer extends customers {

    private String academicInstitution;
    private Date endDateOfStudy = new Date(2022, 1, 3);


    public studentCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber, age);
    }

    public double recieveDiscount(double cost) {
        return 0; //change price
    }

    public boolean checkIfStudent(){
        Date currentDate = new Date();
        boolean answer = this.endDateOfStudy.before(currentDate);
        return answer;
    }
    private Date getDateOfGraduation(){return this.endDateOfStudy;}
    private String getAcademicInstitution(){return this.academicInstitution;}
}
