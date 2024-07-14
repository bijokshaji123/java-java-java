import java.util.Scanner;
class calc_mark{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of subjects: ");
int total_subjects = scanner.nextInt();
int[] marks = new int[total_subjects];
int total_marks = 0;
float percentage;
System.out.println("Enter the marks one by one : ");
for(int i = 0; i<total_subjects; i++){
marks[i] = scanner.nextInt();
}
for(int i = 0; i<total_subjects; i++){
total_marks = total_marks + marks[i];
}
percentage = (total_marks / (float) (total_subjects * 100)) * 100;
System.out.println("Total marks: " + total_marks);
System.out.println("Percentage: " + percentage);
}
}