//1.EMPLOYEE
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
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("UDAY KIRAN S", 75000, "IT");
        m.displayInfo();
    }
}
