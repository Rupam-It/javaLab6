package custDemo.mainpkg3;
import custDemo.cust.Customer;

public class MainClass {
    public static void main(String[] args) {
        // Create a customer object
        Customer customer = new Customer("John Doe", "123 Main St", "555-555-5555", 1001, true);

        // Access and print customer details
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Customer Phone Number: " + customer.getPhoneNumber());
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        System.out.println("Is on Mailing List: " + customer.isOnMailingList());
    }
}
         