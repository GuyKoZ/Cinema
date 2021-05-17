import java.util.Date;


public class soldierCustomer extends customers{
    private Date endDateOfService = new Date(2022, 1, 3);

    public soldierCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber, age);
    }

    public double recieveDiscount(double cost) {
        return 0; // change price
    }

    public boolean checkIfInService(){
        Date currentDate = new Date();
        boolean answer = this.endDateOfService.before(currentDate);
        return answer;
    }
}
