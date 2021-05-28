package cinemaP;
import java.time.LocalDate;
import java.util.Date;
public abstract class soldierCustomer extends customers implements discount {
    LocalDate endDateOfService;

    public soldierCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber, age);
    }

    public LocalDate getEndDateOfService() {
        return endDateOfService;
    }

    public void setEndDateOfService(LocalDate endDateOfService) {
        this.endDateOfService = endDateOfService;
    }

    //    public boolean checkIfInService(){
    //        Date currentDate = new Date();
    //        boolean answer = currentDate.endDateOfService.before(currentDate);
    //        return answer;
    //    }
    public double recieveDiscount(double cost) {
        LocalDate today = LocalDate.now();
        boolean checkIfBefore = today.isBefore(endDateOfService);
        if (checkIfBefore) {
            return 0;
        } else {
            return cost;
        }
    }
}

