import java.util.Scanner;

interface Bank {
    double rateOfInterest();
}

class SBI implements Bank {
    public double rateOfInterest() {
        return 7.5;
    }
}

class HDFC implements Bank {
    public double rateOfInterest() {
        return 6.8;
    }
}

class BankDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Bank:");
        System.out.println("1. SBI");
        System.out.println("2. HDFC");
        System.out.print("Enter choice (1-2): ");
        int choice = sc.nextInt();

        Bank bank;

        switch (choice) {
            case 1:
                bank = new SBI();
                break;
            case 2:
                bank = new HDFC();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to SBI.");
                bank = new SBI();
        }

        System.out.println("Rate of Interest: " + bank.rateOfInterest() + "%");
        sc.close();
    }
}
