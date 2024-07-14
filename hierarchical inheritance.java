import java.util.Scanner;
class Publisher {
 protected String pub_name;
 public Publisher(String pub_name) {
 this.pub_name = pub_name;
 }
}
class Book extends Publisher {
 protected String book_name;
 protected String author;
 protected float price;
 public Book(String pub_name, String book_name, String author, float price) {
 super(pub_name);
 this.book_name = book_name;
 this.author = author;
 this.price = price;
 }
}
class Literature extends Book {
 public Literature(String pub_name, String book_name, String author, float price) {
 super(pub_name, book_name, author, price);
 }
 public void display1() {
 System.out.println("Literature Book Details:");
 System.out.println("Publisher: " + pub_name);
 System.out.println("Book Name: " + book_name);
 System.out.println("Author: " + author);
 System.out.println("Price: Rs" + price);
 }
}
 class Fiction extends Book {
 public Fiction(String pub_name, String book_name, String author, float price) {
 super(pub_name, book_name, author, price);
 }
 public void display2() {
 System.out.println("Fiction Book Details:");
 System.out.println("Publisher: " + pub_name);
 System.out.println("Book Name: " + book_name);
 System.out.println("Author: " + author);
 System.out.println("Price: Rs" + price);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter details for a Literature book:");
 System.out.print("Publisher: ");
 String litPubName = scanner.nextLine();
 System.out.print("Book Name: ");
 String litBookName = scanner.nextLine();
 System.out.print("Author: ");
 String litAuthor = scanner.nextLine();
 System.out.print("Price: ");
 float litPrice = scanner.nextFloat();
 scanner.nextLine(); // consume the newline
 Literature litBook = new Literature(litPubName, litBookName, litAuthor, litPrice);
 System.out.println("\nEnter details for a Fiction book:");
 System.out.print("Publisher: ")
 String ficPubName = scanner.nextLine();
 System.out.print("Book Name: ");
 String ficBookName = scanner.nextLine();
 System.out.print("Author: ");
 String ficAuthor = scanner.nextLine();
 System.out.print("Price: ");
 float ficPrice = scanner.nextFloat();
 Fiction ficBook = new Fiction(ficPubName, ficBookName, ficAuthor, ficPrice);
 System.out.println();
 litBook.display1();
 System.out.println();
 ficBook.display2();
 scanner.close();
 }
}































 System.out.print("Publisher: ")