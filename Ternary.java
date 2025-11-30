//Write a Java program that reads a number and uses the ternary operator to print whether it is even or odd
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);
        sc.close();
    }
}
