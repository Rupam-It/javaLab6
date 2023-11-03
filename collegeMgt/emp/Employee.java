package collegeMgt.emp;
import collegeMgt.per1.Person;

public class Employee extends Person {
    private int empId;
    private String doj;

    public Employee(String name, int age, int empId, String doj) {
        super(name, age);
        this.empId = empId;
        this.doj = doj;
    }

    public void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Date of Joining: " + doj);
    }
}
