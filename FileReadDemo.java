import java.io.*;
import java.util.Scanner;

class FileReadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String firstLine = br.readLine();
            System.out.println("First line of the file: " + firstLine);

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found at the specified path.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }

        sc.close();
    }
}
