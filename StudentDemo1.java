//10. Create a Student class and display student info
import java.util.Scanner;

class Student { 
    String name;
    int rollNo;

    void setData(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class StudentDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        
        Student1 s1 = new Student1();
        s1.setData(name, rollNo);
        s1.display();

        sc.close();
    }
}
