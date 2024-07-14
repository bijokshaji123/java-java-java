import java.util.Scanner;
interface Shape {
 double area();
 double perimeter();
}
class Circle implements Shape {
 private double radius;
 public Circle(double radius) {
 this.radius = radius;
 }
 @Override
 public double area() {
 return Math.PI * radius * radius;
 }
 @Override
 public double perimeter() {
 return 2 * Math.PI * radius;
 }
}
class Rectangle implements Shape {
 private double length;
 private double width;
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 @Override
 public double area() {
 return length * width;
 }
 @Override
 public double perimeter() {
 return 2 * (length + width);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 while (true) {
 System.out.println("Menu:");
 System.out.println("1. Circle");
 System.out.println("2. Rectangle");
 System.out.println("3. Exit");
 System.out.print("Choose an option: ");
 int choice = scanner.nextInt();
 switch (choice) {
 case 1:
 handleCircle(scanner);
 break;
 case 2:
 handleRectangle(scanner);
 break;
 case 3:
 System.out.println("Exiting...");
 scanner.close();
 System.exit(0);
 default:
 System.out.println("Invalid option. Please try again.");
 }
 }
 }
 private static void handleCircle(Scanner scanner) {
 System.out.print("Enter radius of the circle: ");
 double radius = scanner.nextDouble();
 Circle circle = new Circle(radius);
 System.out.println("Area: " + circle.area());
 System.out.println("Perimeter: " + circle.perimeter());
 }
 private static void handleRectangle(Scanner scanner) {
 System.out.print("Enter length of the rectangle: ");
 double length = scanner.nextDouble();
 System.out.print("Enter width of the rectangle: ");
 double width = scanner.nextDouble();
 Rectangle rectangle = new Rectangle(length, width);
 System.out.println("Area: " + rectangle.area());
 System.out.println("Perimeter: " + rectangle.perimeter());
 }
}































