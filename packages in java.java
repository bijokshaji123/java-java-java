import java.util.Scanner;
import Arithmetic.*;
public class Prgrm {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 int i = 1, ch;
 System.out.println("_____Program to demonstrate the basic arithmetic operations_____");
 System.out.println("Enter two numbers: ");
 float n1 = sc.nextFloat();
 float n2 = sc.nextFloat();
 
 while (i != 0) {
 System.out.println("1. Addition \t2. Subtraction \t3. Multiplication \t4. Division");
 System.out.print("Choose an option: ");
 ch = sc.nextInt();
 switch (ch) {
 case 1:
 Addition obj1 = new Addition();
 obj1.calculate(n1, n2);
 break;
 case 2:
 Subtraction obj2 = new Subtraction();
 obj2.calculate(n1, n2);
 break;
 case 3:
 Multiplication obj3 = new Multiplication();
 obj3.calculate(n1, n2);
 break;
 case 4:
 Division obj4 = new Division();
 obj4.calculate(n1, n2);
 break;
 }
 System.out.print("Do you want to continue? (0: no, 1: yes) ");
 i = sc.nextInt();
 }
 }
}
Addition.java
package Arithmetic;
public class Addition {
 public void calculate(float a, float b) {
 System.out.println("Sum of the given numbers is: " + (a + b));
 }
}
Subtraction.java
package Arithmetic;
public class Subtraction {
 public void calculate(float a, float b) {
 System.out.println("Difference of the given numbers is: " + (a - b));
 }
}
Multiplication.java
package Arithmetic;
public class Multiplication {
 public void calculate(float a, float b) {
 System.out.println("Product of the given numbers is: " + (a * b));
 }
}
Division.java 
package Arithmetic;
public class Division {
 public void calculate(float a, float b) {
 if (b != 0) {
 System.out.println("Quotient of the given numbers is: " + (a / b));
 } else {
 System.out.println("Cannot divide by zero.");
 }
 }
}




























