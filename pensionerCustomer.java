import java.util.Calendar;

public class pensionerCustomer extends customers{

    public pensionerCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber,age);

    }

    public String type_of_customer() {
        if (this.getAge()>65) {
            return "Pensioner";
        }
        return "Customer";
    }
}

