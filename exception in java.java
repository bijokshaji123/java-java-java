LoginException.java
import java.util.Scanner;
class UsernameException extends Exception {
 public UsernameException(String msg) {
 super(msg);
 }
}
class PasswordException extends Exception {
 public PasswordException(String msg) {
 super(msg);
 }
}
public class LoginException {
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 String username, password;
 
 System.out.print("Enter username: ");
 username = s.nextLine();
 
 System.out.print("Enter password: ");
 password = s.nextLine();
 
 int length = username.length();
 
 try {
 if (length < 6) {
 throw new UsernameException("Username must be greater than 6 characters");
 } else if (!password.equals("abc@123")) {
 throw new PasswordException("Incorrect password\nType correct password");
 } else {
 System.out.println("Login Successful !!!");
 }
 } catch (UsernameException e) {
 System.out.println(e);
 } catch (PasswordException p) {
 System.out.println(p);
 }
 }
}
