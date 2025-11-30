public class ScopeTest {
    public static void main(String[] args) {
        {
            int temp = 25;
            System.out.println("Inside block: " + temp);
        }
        // System.out.println(temp); // Error: not accessible
    }
}
