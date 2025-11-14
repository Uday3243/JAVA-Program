//Write a program to perform bitwise AND, OR, and XOR operations on two integers entered by the user, and print the binary results.
import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Bitwise AND: " + Integer.toBinaryString(a & b));
        System.out.println("Bitwise OR: " + Integer.toBinaryString(a | b));
        System.out.println("Bitwise XOR: " + Integer.toBinaryString(a ^ b));
        sc.close();
    }
}
