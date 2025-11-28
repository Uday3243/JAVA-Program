class Employee {
    private int salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EmployeeA {
    public static void main(String[] args) {
        Employee e = new Employee(50000000, "UDAY KIRAN S");
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        e.setName("UK's");
        System.out.println(e.getName());
    }
}