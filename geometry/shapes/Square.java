package geometry.shapes;

public class Square {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}
