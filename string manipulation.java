public class StringManipulation {
 public static void main(String[] args) {
 String str = "Hello, World!";
 
 int length = str.length();
 System.out.println("Length of the string: " + length);
 
 String upperCaseStr = str.toUpperCase();
 System.out.println("Uppercase string: " + upperCaseStr);
 
 boolean containsWorld = str.contains("World");
 System.out.println("Does the string contain 'World'?: " + containsWorld);
 
 String[] splitStr = str.split(",");
 System.out.println("Split string: ");
 for (String s : splitStr) {
 System.out.println(s.trim()); // trim to remove leading/trailing spaces
 }
 
 StringBuffer stringBuffer = new StringBuffer();
 
 stringBuffer.append("Hello");
 stringBuffer.append(" ");
 stringBuffer.append("World");
 System.out.println("StringBuffer after appending: " + stringBuffer);
 
 stringBuffer.insert(5, ", ");
 System.out.println("StringBuffer after insertion: " + stringBuffer);
 
 stringBuffer.reverse();
 System.out.println("Reversed StringBuffer: " + stringBuffer);
 
 stringBuffer.delete(5, 8);
 System.out.println("StringBuffer after deletion: " + stringBuffer);
 }
}
