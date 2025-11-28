import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManagerInfo() {
        displayInfo();
        System.out.println("Department: " + department);
    }
}

class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter manager name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        Manager m = new Manager(name, salary, department);

        System.out.println("\nManager Details:");
        m.displayManagerInfo();

        sc.close();
    }
}