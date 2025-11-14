//Write a Java program to compare two numbers and print which one is greater or if they are equal
import java.util.Scanner;

public class Compare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        if(a > b) {
            System.out.println(a + " is greater");
        } else if(b > a) {
            System.out.println(b + " is greater");
        } else {
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}
