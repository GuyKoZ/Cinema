package CinemaP;
import java.time.LocalDate;

public final class SoldierCustomer extends Customers implements Discount { // sun of customer
    // relevant attribute
    LocalDate endDateOfService;
    // relevant constructer
    public SoldierCustomer(String name, String email, String id, String phoneNumber, int age, LocalDate releaseDate) {
        super(name, email, id, phoneNumber, age);
        this.endDateOfService = releaseDate;
    }

    @Override
    public double receiveDiscount(double cost) { // the relevant calculate if the entity is eligible
        LocalDate today = LocalDate.now();
        boolean checkIfBefore = today.isBefore(endDateOfService); // verify that soldier still in service
        if (checkIfBefore) {
            return 0; // if in service it's free ticket
        } else {
            return cost; // not eligible for soldier ticket
        }
    }
}

