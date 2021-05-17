import java.util.Calendar;

public class pensionerCustomer extends customers{

    public pensionerCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber,age);

    }

    public double recieveDiscount(double cost) {
        return 0; //change price
    }

    public boolean checkIfInpension() {
        boolean answer = false;
        if (this.getAge()>65) {
            answer = true;
        }
        return answer;
    }
}

