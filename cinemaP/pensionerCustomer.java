package CinemaP;

public final class PensionerCustomer extends Customers implements Discount {
    public PensionerCustomer(String name, String email, String id, String phoneNumber, int age) {
        super(name, email, id, phoneNumber, age);
    }

    @Override
    public double receiveDiscount(double cost) { // there's an awsome discount specific for pensioner
        return 0; //change price
    }

    public boolean checkIfInpension() { return this.getAge() > 65; // that's the pensioner age
    }

}
