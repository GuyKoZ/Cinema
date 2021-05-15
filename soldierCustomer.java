import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class soldierCustomer extends customers{

    //private date endDateOfService;
    public soldierCustomer(String name, String email, String id, String phoneNumber,int age) {
        super(name, email, id, phoneNumber, age);
    }

    public boolean checkIfInService(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        //System.out.println(formatter.format(date));
        if (date.after(this.endDateOfService))
    }
}
