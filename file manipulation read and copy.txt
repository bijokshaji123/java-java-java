class Readfile {
 public static void main(String arg[]) throws IOException {
 FileInputStream f = new FileInputStream("numbers.txt");
 FileOutputStream f2 = new FileOutputStream("odd.txt");
 FileOutputStream f3 = new FileOutputStream("even.txt");
 int c;
 while ((c = f.read()) != -1) {
 // Check if the ASCII value is even or odd
 if (c % 2 == 0) {
 f3.write(c); // Write to even.txt if ASCII value is even
 } else {
 f2.write(c); // Write to odd.txt if ASCII value is odd
 }
 // Print the character to console
 System.out.print((char) c);
 }
 f.close();
 f2.close();
 f3.close();
 System.out.println("\nContents of odd.txt:");
 try (FileInputStream oddFile = new FileInputStream("odd.txt")) {
 while ((c = oddFile.read()) != -1) {
 System.out.print((char) c);
 }
 }
 System.out.println("\nContents of even.txt:");
 try (FileInputStream evenFile = new FileInputStream("even.txt")) {
 while ((c = evenFile.read()) != -1) {
 System.out.print((char) c);
 }
 }
