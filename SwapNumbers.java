//5. Swap two numbers without using a third variable
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 4, b = 24;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}
