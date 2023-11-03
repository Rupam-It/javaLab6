package custDemo.cust;
import custDemo.per2.Person;

public class Customer extends Person {
    private int customerNumber;
    private boolean onMailingList;

    // Constructors
    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean onMailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    // Accessors
    public int getCustomerNumber() {
        return customerNumber;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    // Mutators
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }
}
