import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        System.out.println("\nDefault Constructor:");
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
        System.out.println("\nConstructor with Title and Author:");
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price);
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("\nConstructor with All Fields:");
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        new Book();
        new Book(title, author);
        new Book(title, author, price);

        sc.close();
    }
}
