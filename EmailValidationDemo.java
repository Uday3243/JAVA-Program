import java.util.Scanner;

// Custom Exception
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
            System.out.println("Email is valid.");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@' symbol.");
        }
    }
}
