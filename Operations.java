//Write a program to demonstrate +=, -=, and *= operations on an integer variable and display the result after each operation.
import java.util.Scanner;

public class Operations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        num += 5;
        System.out.println("After += 5: " + num);
        num -= 3;
        System.out.println("After -= 3: " + num);
        num *= 2;
        System.out.println("After *= 2: " + num);
        sc.close();
    }
}
