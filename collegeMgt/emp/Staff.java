package collegeMgt.emp;
import collegeMgt.emp.Employee;

public class Staff extends Employee {
    private String designation;

    public Staff(String name, int age, int empId, String doj, String designation) {
        super(name, age, empId, doj);
        this.designation = designation;
    }

    public void display() {
        super.display();
        System.out.println("Designation: " + designation);
    }
}
