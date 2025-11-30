import java.util.Scanner;

class Product {
    int id;

    Product(int id) {
        this.id = id;
    }

    void display() {
        System.out.println("Product ID: " + id);
    }
}

class Electronic extends Product {
    int warranty;

    Electronic(int id, int warranty) {
        super(id);
        this.warranty = warranty;
    }

    void display() {
        super.display();
        System.out.println("Warranty: " + warranty + " years");
    }
}

public class Product1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Warranty (years): ");
        int warranty = sc.nextInt();

        Electronic e = new Electronic(id, warranty);
        e.display();

        sc.close();
    }
}
