import java.util.Scanner;
public class Assignment1Program2 {
  public static void main(String[] args) {
  Scanner message = new Scanner(System.in);
  System.out.println( " Base Conversion Program ");
  System.out.print( " Please enter a base (2 – 9): ");
  int base = message.nextInt(); 
  int maximum = base*base*base*base -1; 
  System.out.println("The maximum, 4-digit, base 10 number in base " + base + " is " + maximum + ".");
  System.out.print("Now, enter a base 10 number in the range 0 to " + maximum + " to convert: ");
  int number = message.nextInt();
  int A = number % base; 
  int B = (number / base ) % base;
  int C = (number / (base * base)) % base; 
  int D = (number / (base * base * base)) % base; 
  System.out.println(number + " (base 10) = " + D + C + B + A + " ( base " + base +")");

  message.close();

  }
}
