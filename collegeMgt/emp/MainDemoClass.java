package collegeMgt.emp;
import collegeMgt.stu.Student;
import collegeMgt.emp.Staff;
import collegeMgt.emp.Faculty;

public class MainDemoClass {
    public static void main(String[] args) {
        // Create objects
        Student student = new Student("John Doe", 20, 1001, "Computer Science");
        Faculty faculty = new Faculty("Jane Doe", 35, 2001, "2023-09-15", "Professor");
        Staff staff = new Staff("James Doe", 25, 3001, "2022-05-20", "Technical");

        // Display details
        System.out.println("Student Details:");
        student.display();

        System.out.println("\nFaculty Details:");
        faculty.display();

        System.out.println("\nStaff Details:");
        staff.display();
    }
}
