import java.util.Objects;
import java.util.Scanner;

class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }
}

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}

class Student {
    int rollNumber;
    String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return rollNumber == other.rollNumber;
    }

    public int hashCode() {
        return Objects.hash(rollNumber);
    }
}

class Movie {
    String name;
    String director;
    int year;

    Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public String toString() {
        return "Movie[name=" + name + ", director=" + director + ", year=" + year + "]";
    }
}

class Player {
    String name;
    int age;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return Objects.hash(age);
    }
}

class OOPDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book title: ");
        String bTitle = sc.nextLine();
        System.out.print("Enter Book price: ");
        double bPrice = sc.nextDouble();
        sc.nextLine();
        Book book = new Book(bTitle, bPrice);
        System.out.println(book);

        System.out.print("\nEnter Car model: ");
        String cModel = sc.nextLine();
        Car car = new Car(cModel);
        System.out.println("Runtime class of Car object: " + car.getClass());

        System.out.print("\nEnter Student roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student name: ");
        String sName = sc.nextLine();
        Student s1 = new Student(roll, sName);
        Student s2 = new Student(roll, "Another Name");
        System.out.println("Students equal? " + s1.equals(s2));
        System.out.println("Student1 hashCode: " + s1.hashCode());
        System.out.println("Student2 hashCode: " + s2.hashCode());

        System.out.print("\nEnter Movie name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Director name: ");
        String director = sc.nextLine();
        System.out.print("Enter Release year: ");
        int year = sc.nextInt();
        Movie movie = new Movie(mName, director, year);
        System.out.println(movie);

        sc.nextLine();
        System.out.print("\nEnter Player name: ");
        String pName = sc.nextLine();
        System.out.print("Enter Player age: ");
        int age = sc.nextInt();
        Player player1 = new Player(pName, age);
        Player player2 = new Player("Another Player", age);
        System.out.println("Player1 hashCode: " + player1.hashCode());
        System.out.println("Player2 hashCode: " + player2.hashCode());

        sc.close();
    }
}
