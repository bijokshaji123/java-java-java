import java.util.Scanner;
class Shapes {
 float a, b;
 Shapes(){}
 Shapes(float value) {
 a = value;
 }
 Shapes(float val1, float val2) {
 a = val1;
b = val2;
 }
 double area() {
System.out.println("Area of different Shapes:");
 return 0;
 }
}
class Rectangle extends Shapes{
Rectangle(float a, float b){
super(a,b);
}
double area(){
return a*b;
}
}
class Circle extends Shapes {
 Circle(float a) {
 super(a);
 }
 
 double area() {
 return Math.PI * a * a;
 }
}
class Square extends Shapes {
 Square(float a) {
 super(a);
 }
 double area() {
 return a * a;
 }
}
public class FindArea {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Shapes obj = new Shapes();
obj.area();
 System.out.print("Enter the radius of the circle: ");
 float r = sc.nextFloat();
 Circle obj1 = new Circle(r);
 System.out.println("Area of circle is: " + obj1.area());
 System.out.print("Enter the length of the rectangle: ");
 float l = sc.nextFloat();
 System.out.print("Enter the breadth of the rectangle: ");
 float b = sc.nextFloat();
 Rectangle obj2 = new Rectangle(l, b);
 System.out.println("Area of rectangle is: " + obj2.area());
 System.out.print("Enter the side length of the square: ");
 float a = sc.nextFloat();
 Square obj3 = new Square(a);
 System.out.println("Area of square is: " + obj3.area());
 
 sc.close();
 }
}































