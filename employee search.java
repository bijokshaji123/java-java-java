import java.util.Scanner;
class Employee {
 int eNo;
 String eName;
 double salary;
 public Employee(int eNo, String eName, double salary) {
 this.eNo = eNo;
 this.eName = eName;
 this.salary = salary;
 }
}
public class EmployeeSearch {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 System.out.print("Enter the number of employees: ");
 int n = scanner.nextInt();
 
 Employee[] employees = new Employee[n];
 
 for (int i = 0; i < n; i++) {
 System.out.println("\nEnter details for employee " + (i + 1) + ":");
 System.out.print("Employee Number: ");
 int eNo = scanner.nextInt();
 System.out.print("Employee Name: ");
 String eName = scanner.next();
 System.out.print("Employee Salary: ");
 double salary = scanner.nextDouble();
 
 employees[i] = new Employee(eNo, eName, salary);
 }
 
 System.out.print("\nEnter the employee number to search: ");
 int searchEno = scanner.nextInt();
 int flag = 0;
 for (Employee emp : employees) {
 if (emp.eNo == searchEno) {
 System.out.println("Employee found:");
 System.out.println("Employee Number: " + emp.eNo);
 System.out.println("Employee Name: " + emp.eName);
 
 System.out.println("Employee Salary: " + emp.salary);
 flag = 1;
 break;
 }
 }
 if (flag == 0) {
 System.out.println("Employee with Employee Number " + searchEno + " not found.");
 }
 
 scanner.close();
 }
}
