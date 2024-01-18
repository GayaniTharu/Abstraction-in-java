public class AbstractionExample {
    

    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Using abstraction to call the common method without knowing the specific implementation
        circle.displayArea();
        rectangle.displayArea();
    }
}

