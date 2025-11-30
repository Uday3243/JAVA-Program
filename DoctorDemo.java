import java.util.Scanner;

class Doctor {
    void consultationFee() {
        System.out.println("General Doctor consultation fee: $50");
    }
}

class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist consultation fee: $80");
    }
}

class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: $120");
    }
}

class Surgeon extends Doctor {
    void consultationFee() {
        System.out.println("Surgeon consultation fee: $200");
    }
}

class DoctorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Doctor Type:");
        System.out.println("1. Dentist");
        System.out.println("2. Cardiologist");
        System.out.println("3. Surgeon");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        Doctor doc;
        switch (choice) {
            case 1:
                doc = new Dentist();
                break;
            case 2:
                doc = new Cardiologist();
                break;
            case 3:
                doc = new Surgeon();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to General Doctor.");
                doc = new Doctor();
        }

        doc.consultationFee();
        sc.close();
    }
}