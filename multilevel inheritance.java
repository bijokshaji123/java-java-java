import java.util.Scanner;
class Person {
 String pname, address, gender;
 int age;
 Person(String pname, String address, String gender, int age) {
 this.pname = pname;
 this.address = address;
 this.gender = gender;
 this.age = age;
 }
}
class Employee extends Person {
 String emp_id, cp_name, qualification;
 float salary;
 Employee(String pname, String address, String gender, int age, String emp_id, String cp_name, 
String qualification, float salary) {
 super(pname, address, gender, age);
 this.emp_id = emp_id;
 this.cp_name = cp_name;
 this.qualification = qualification;
 this.salary = salary;
 }
}
class Teacher extends Employee {
 int teach_id;
 String department, subject;
 Teacher(int teach_id, String department, String subject, String emp_id, String cp_name,
String qualification, float salary, String pname, String address, String gender, int age) {
 super(pname, address, gender, age, emp_id, cp_name, qualification, salary);
 this.teach_id = teach_id;
 this.department = department;
 this.subject = subject;
 }
 public void display() {
 System.out.println("Name: " + pname);
 System.out.println("Gender: " + gender);
 System.out.println("Address: " + address);
 System.out.println("Age: " + age);
 System.out.println("Employee ID: " + emp_id);
 System.out.println("Company Name: " + cp_name);
 System.out.println("Salary: " + salary);
 System.out.println("Qualification: " + qualification);
 System.out.println("Teacher ID: " + teach_id);
 System.out.println("Department: " + department);
 System.out.println("Subject Taught: " + subject);
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of employees:");
 int n = sc.nextInt();
 sc.nextLine(); // Consume newline left-over
 Teacher[] empobj = new Teacher[n];
 for (int i = 0; i < n; i++) {
 System.out.println("Enter name of person:");
 String pname = sc.nextLine();
 System.out.println("Enter gender:");
 String gender = sc.nextLine();
 System.out.println("Enter address:");
 String address = sc.nextLine();
 System.out.println("Enter age:");
 int age = sc.nextInt();
 sc.nextLine(); // Consume newline left-over
 System.out.println("Enter employee ID:");
 String emp_id = sc.nextLine(); // Changed to String
 System.out.println("Enter company name:");
 String cp_name = sc.nextLine();
 System.out.println("Enter salary:");
 float salary = sc.nextFloat();
 sc.nextLine(); // Consume newline left-over
 System.out.println("Enter qualification:");
 String qualification = sc.nextLine();
 System.out.println("Enter teacher ID:");
 int teach_id = sc.nextInt();
 sc.nextLine(); // Consume newline left-over
 System.out.println("Enter department:");
 String department = sc.nextLine();
 System.out.println("Enter subject taught:");
 String subject = sc.nextLine();
 empobj[i] = new Teacher(teach_id, department, subject, emp_id, cp_name, qualification, salary, 
pname, address, gender, age);
 }
 System.out.println("The details are:");
 for (int i = 0; i < n; i++) {
 empobj[i].display();
 }
 }
}



































