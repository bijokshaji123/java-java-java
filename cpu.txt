import java.util.Scanner;
public class cpu {
 int price = 1000;
 public class processor {
 int cores = 6;
 String manufacturer = "Pentium";
 }
 void print() {
 processor pc = new processor();
 System.out.println("Processor:\nCores=" + pc.cores + "\nManufacturer = " + pc.manufacturer);
 }
 static class ram {
 static int memory = 64;
 static String manufacturer = "Intel";
 }
 public static void main(String[] args) {
 cpu cp = new cpu();
 cpu.ram rm = new cpu.ram();
 System.out.println("CPU: \nPrice: " + cp.price);
 cp.print();
 System.out.println("RAM: \n Memory=" + rm.memory + " Manufacturer=" + rm.manufacturer);
 }
}