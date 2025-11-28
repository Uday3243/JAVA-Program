import vehicles.Vehicle;
import vehicles.Bike;
import vehicles.Car;
import java.util.Scanner;

class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Vehicle:");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.print("Enter choice (1-2): ");
        int choice = sc.nextInt();

        Vehicle v;

        switch (choice) {
            case 1:
                v = new Bike();
                break;
            case 2:
                v = new Car();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Bike.");
                v = new Bike();
        }

        v.speed();
        sc.close();
    }
}
