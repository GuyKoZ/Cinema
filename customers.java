import java.util.ArrayList;

public class customers {
    private String name;
    private String email;
    private String id;
    private String phoneNumber;

    public customers (String name, String email, String id, String phoneNumber){
        this.email = email;
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean equalCustomer (customers customer) { return this.id == customer.id;}
}