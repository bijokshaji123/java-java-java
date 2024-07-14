import java.util.Scanner;
class oddeven{
public static void main(String[] args){
int num;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number: ");
num = scanner.nextInt();
if(num%2==0){
System.out.println(num+" is even!!");
}
else{
System.out.println(num+" is odd!!");
}
scanner.close();
}
}
