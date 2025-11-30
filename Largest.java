//7. Find the largest of three numbers
public class Largest {
    public static void main(String[] args) {
        int a = 69, b = 96, c = 66;
        if (a >= b && a >= c)
            System.out.println("Largest: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
    }
}