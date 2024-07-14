import java.util.Scanner;
abstract class Shape {
 public abstract void area();
}
class Rectangle extends Shape {
 @Override
 public void area() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter length and breadth of rectangle:");
 int length = scanner.nextInt();
 int breadth = scanner.nextInt();
 int area = length * breadth;
 System.out.println("Area of the rectangle is: " + area);
 }
}
class Circle extends Shape {
 @Override
 public void area() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter radius of circle:");
 double radius = scanner.nextDouble();
 double area = Math.PI * radius * radius;
 System.out.println("Area of the circle is: " + area);
 }
}
class Square extends Shape {
 @Override
 public void area() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter side of square:");
 int side = scanner.nextInt();
 int area = side * side;
 System.out.println("Area of the square is: " + area);
 }
}
public class AbstractClass {
 public static void main(String[] args) {
 Rectangle rect = new Rectangle();
 Circle cir = new Circle();
 Square sq = new Square();
 rect.area();
 cir.area();
 sq.area();
 }
}