package exceptionHandling;

abstract class Shape {
    // Abstract method
    abstract double area();

    // Non-abstract method
    void displayShapeType() {
        System.out.println("This is a shape.");
    }
}

class circle extends Shape {
    private double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

public class Task1_2_AbstractNonAbstract {
    public static void main(String[] args) {
        Shape circle = new circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle:");
        circle.displayShapeType();  // non-abstract method
        System.out.println("Area: " + circle.area());

        System.out.println("\nRectangle:");
        rectangle.displayShapeType();  // inherited method
        System.out.println("Area: " + rectangle.area());
    }
}