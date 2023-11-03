package geometry.shapes;

public class Triangle {
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculatePerimeter() {
        // Assuming it's a right triangle for simplicity
        double hypotenuse = Math.sqrt(base*base + height*height);
        return base + height + hypotenuse;
    }
}
