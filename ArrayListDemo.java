import java.util.ArrayList;
import java.util.Scanner;

class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("\nCurrent List: " + names);

        System.out.print("\nEnter a name to remove: ");
        String removeName = sc.nextLine();
        if (names.remove(removeName)) {
            System.out.println(removeName + " removed from the list.");
        } else {
            System.out.println(removeName + " not found in the list.");
        }

        System.out.println("\nFinal List: " + names);
        sc.close();
    }
}
