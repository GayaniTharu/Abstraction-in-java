// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by derived classes)
    abstract double calculateArea();

    // Concrete method
    void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}

// Concrete class implementing the abstract class
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class implementing the abstract class
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}


