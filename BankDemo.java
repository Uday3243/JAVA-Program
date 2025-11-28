import java.util.Scanner;

final class CentralBankRules {
    void rules() {
        System.out.println("All banks must follow central bank regulations.");
    }
}

class Account {
    private final String accountNumber;

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public final void bankPolicy() {
        System.out.println("Bank Policy: Minimum balance must be maintained.");
    }
}

class SavingsAccount extends Account {
    double balance;

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber);
        this.balance = balance;
    }

    void display() {
        System.out.println("Savings Account No: " + getAccountNumber());
        System.out.println("Balance: $" + balance);
        bankPolicy();
    }
}

class CurrentAccount extends Account {
    double balance;

    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber);
        this.balance = balance;
    }

    void display() {
        System.out.println("Current Account No: " + getAccountNumber());
        System.out.println("Balance: $" + balance);
        bankPolicy();
    }
}

class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Savings Account number: ");
        String sAcc = sc.nextLine();
        System.out.print("Enter Savings Account balance: ");
        double sBal = sc.nextDouble();
        sc.nextLine();

        SavingsAccount sa = new SavingsAccount(sAcc, sBal);
        sa.display();

        System.out.print("\nEnter Current Account number: ");
        String cAcc = sc.nextLine();
        System.out.print("Enter Current Account balance: ");
        double cBal = sc.nextDouble();

        CurrentAccount ca = new CurrentAccount(cAcc, cBal);
        ca.display();

        CentralBankRules cbr = new CentralBankRules();
        System.out.println();
        cbr.rules();

        sc.close();
    }
}
