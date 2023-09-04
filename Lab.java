class Shape {
    double getArea() {
        return 0.0; // Default implementation for unknown shapes
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width; // Calculate area of a rectangle
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(); // Create a generic Shape object
        Rectangle rectangle = new Rectangle(5.0, 3.0); // Create a Rectangle object

        System.out.println("Area of the Shape: " + shape.getArea()); // Calls Shape's getArea()
        System.out.println("Area of the Rectangle: " + rectangle.getArea()); // Calls Rectangle's getArea()
    }
}
