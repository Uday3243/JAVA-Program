//Create a program that checks if a person is eligible to vote — eligibility requires age ≥ 18 and citizenship = true (use logical AND).
import java.util.Scanner;

public class Vote{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Are you a citizen? (1 for yes, 0 for no):");
        int c = sc.nextInt();
        boolean citizen = (c == 1);
        if(age >= 18 && citizen) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}

