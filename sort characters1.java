import java.util.Arrays;
import java.util.Scanner;
public class sort_char {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the String: ");
 String str = scanner.nextLine();
 str = str.toLowerCase();
 char[] chars = str.toCharArray();
 Arrays.sort(chars);
 String sorted = new String(chars);
 System.out.println("\nSorted characters of the string: "+ sorted);
 scanner.close();
 }
}
