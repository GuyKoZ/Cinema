import java.time.LocalDate;
import java.util.Date;


public class soldierCustomer extends customers{
    LocalDate endDateOfService;

    public soldierCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber, age);
    }

    public LocalDate getEndDateOfService (){ return endDateOfService; }
    public void setEndDateOfService(LocalDate endDateOfService) { this.endDateOfService = endDateOfService; }

    @Override
    public double recieveDiscount(double cost) {
        LocalDate today = LocalDate.now();
        boolean checkIfBefore = today.isBefore(endDateOfService);
        if (checkIfBefore) { return 0; }
        else { return cost; }
    }

//    public boolean checkIfInService(){
//        Date currentDate = new Date();
//        boolean answer = currentDate.endDateOfService.before(currentDate);
//        return answer;
//    }
}
