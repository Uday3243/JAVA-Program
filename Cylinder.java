import java.util.Scanner;

class Cylinder {
    private double radius;
    private double height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        System.out.println("\nUsing Constructor:");
        System.out.println("Surface Area = " + surfaceArea());
        System.out.println("Volume = " + volume());
    }

    Cylinder() {}
}

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 4;
        breadth = 5;
        System.out.println("\nDefault Rectangle:");
        System.out.println("Length = " + length + ", Breadth = " + breadth);
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("\nCustom Rectangle:");
        System.out.println("Length = " + this.length + ", Breadth = " + this.breadth);
    }
}

class CylinderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cylinder c1 = new Cylinder();
        System.out.print("Enter radius: ");
        c1.setRadius(sc.nextDouble());
        System.out.print("Enter height: ");
        c1.setHeight(sc.nextDouble());

        System.out.println("\nUsing Getters & Setters:");
        System.out.println("Surface Area = " + c1.surfaceArea());
        System.out.println("Volume = " + c1.volume());

        System.out.print("\nEnter radius for constructor: ");
        double r = sc.nextDouble();
        System.out.print("Enter height for constructor: ");
        double h = sc.nextDouble();
        Cylinder c2 = new Cylinder(r, h);

        Rectangle r1 = new Rectangle();

        System.out.print("\nEnter custom rectangle length: ");
        int l = sc.nextInt();
        System.out.print("Enter custom rectangle breadth: ");
        int b = sc.nextInt();
        Rectangle r2 = new Rectangle(l, b);

        sc.close();
    }
}
