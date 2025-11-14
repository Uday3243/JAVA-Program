//2.Shapes
class Shape {
    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}

public class ShapesDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.displayShape();
        System.out.println("Circle area: " + c.area());

        r.displayShape();
        System.out.println("Rectangle area: " + r.area());
    }
}
