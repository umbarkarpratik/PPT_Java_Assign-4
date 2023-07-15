package PrePlacementTraning.JavapptaAssign_4;

// Defining an interface
interface Shape {
    void draw(); // Abstract method
}

// Implementing the interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Main class to test the interfaces
public class Que1 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape triangle = new Triangle();
        triangle.draw();
    }
}

