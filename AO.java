//Write a Java program to input two integers and display their sum, difference, product, quotient, and remainder.
import java.util.Scanner;

public class AO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Sum is " + (a + b));
        System.out.println("Difference is " + (a - b));
        System.out.println("Product is " + (a * b));
        System.out.println("Quotient is " + (a / b));
        System.out.println("Remainder is " + (a % b));
        sc.close();
    }
}


