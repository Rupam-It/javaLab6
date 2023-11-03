package geometry.mainpkg2;
import geometry.shapes.Square;
import geometry.shapes.Triangle;
import geometry.shapes.Circle;

public class MainClass {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(5);

        Triangle triangle = new Triangle();
        triangle.setBase(4);
        triangle.setHeight(3);

        Circle circle = new Circle();
        circle.setRadius(7);

        // Print area and perimeter for each shape
        System.out.println("Square:");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculatePerimeter());
    }
}
