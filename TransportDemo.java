import java.util.Scanner;

class Transport {
    void move() {
        System.out.println("Transport is moving.");
    }
}

class Bus extends Transport {
    int passengers;

    Bus(int passengers) {
        this.passengers = passengers;
    }

    void carryPassengers() {
        System.out.println("Bus is carrying " + passengers + " passengers.");
    }
}

class Truck extends Transport {
    double goodsWeight;

    Truck(double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    void carryGoods() {
        System.out.println("Truck is carrying " + goodsWeight + " tons of goods.");
    }
}

class TransportDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passengers for Bus: ");
        int p = sc.nextInt();
        Bus bus = new Bus(p);
        bus.move();
        bus.carryPassengers();

        System.out.print("\nEnter weight of goods for Truck (tons): ");
        double w = sc.nextDouble();
        Truck truck = new Truck(w);
        truck.move();
        truck.carryGoods();

        sc.close();
    }
}
