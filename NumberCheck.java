//Write a Java program using an if-else statement to determine if an input number is positive, negative, or zero.
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("The number is positive");
        } else if(num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        sc.close();
    }
}
