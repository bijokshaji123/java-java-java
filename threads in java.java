import java.util.Scanner;
class Multiplication extends Thread {
 @Override
 public void run() {
 System.out.println("Multiplication table of 5:");
 for (int i = 1; i <= 10; i++) {
 System.out.println(i + " X 5 = " + i * 5);
 }
 System.out.println("Exiting from Thread Multiplication...");
 }
}
class PrimeNumbers extends Thread {
 @Override
 public void run() {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the value of n: ");
 int n = sc.nextInt();
 prime_N(n);
 sc.close();
 }
 static void prime_N(int N) {
 int x, y, flag;
 System.out.println("All the Prime numbers within 1 and " + N + " are:");
 for (x = 1; x <= N; x++) {
 if (x == 1 || x == 0) {
 continue;
 }
 flag = 1;
 for (y = 2; y <= x / 2; ++y) {
 if (x % y == 0) {
 flag = 0;
 break;
 }
 }
 if (flag == 1) {
 System.out.print(x + "\t");
 }
 }
 System.out.println();
 }
}
public class ThreadClass {
 public static void main(String args[]) {
 Multiplication a = new Multiplication();
 PrimeNumbers b = new PrimeNumbers();
 a.start();
 b.start();
 }
}