import java.util.Scanner;

class Payment {
    void pay(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card.");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paying $" + amount + " using UPI.");
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paying $" + amount + " using Net Banking.");
    }
}

class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        Payment payment;  // Polymorphic reference

        switch (choice) {
            case 1:
                payment = new CreditCardPayment();
                break;
            case 2:
                payment = new UPIPayment();
                break;
            case 3:
                payment = new NetBankingPayment();
                break;
            default:
                System.out.println("Invalid choice. Using default payment.");
                payment = new Payment();
        }

        payment.pay(amount); // Polymorphic call
        sc.close();
    }
}
