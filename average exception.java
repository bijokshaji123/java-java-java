AverageException.java
import java.util.Scanner;
class InputException extends Exception {
 public InputException(String msg) {
 super(msg);
 }
}
public class AverageException {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 int sum = 0;
 System.out.print("Enter no of integers: ");
 int n = s.nextInt();
 int arr[] = new int[n];
 System.out.print("Enter the integers: ");
 try {
 for (int i = 0; i < n; i++) {
 int in = s.nextInt();
 if (in < 0) {
 throw new InputException("Number is not positive\nType a positive number !!!");
 }
 arr[i] = in;
 sum += arr[i];
 }
 float avg = (float) sum / n; // Cast one operand to float to ensure floating point division
 System.out.println("Average is: " + avg);
 } catch (InputException e) {
 System.out.println(e);
 }
 }
}
