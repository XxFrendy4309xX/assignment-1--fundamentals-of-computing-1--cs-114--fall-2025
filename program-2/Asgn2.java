import java.util.Scanner;

public class Asgn2 {

  public static void main(String[] args) {

    var message = "The Maximum 4-digit base 10 number in base ";

    System.out.println("Base Conversion Program");
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a base (2 -> 9): ");
    int baseint = input.nextInt();

    // lookup-table
    var baseout = 0;

    if(baseint == 2) {
      System.out.println(message + 2 + " is " + 15);
      baseout = 15;
    }
    else if(baseint == 3) {
      System.out.println(message + 3 + " is " + 90);
      baseout = 90;
    }
    else if(baseint == 4) {
      System.out.println(message + 4 + " is " + 255);
      baseout = 255;
    }
    else if(baseint == 5) {
      System.out.println(message + 5 + " is " + 624);
      baseout = 624;
    }
    else if(baseint == 6) {
      System.out.println(message + 6 + " is " + 1295);
      baseout = 1295;
    }
    else if(baseint == 7) {
      System.out.println(message + 7 + " is " + 2400);
      baseout = 2400;
    }
    else if(baseint == 8) {
      System.out.println(message + 8 + " is " + 4095);
      baseout = 4095;
    }
    else {
      System.out.println(message + 9 + " is " + 6560);
      baseout = 6560;
    }

    System.out.println("Now, Enter a Base-10 number in the range 0 to " + baseout + " to convert: ");
    int basecompare = input.nextInt();

    var divider = (basecompare/baseint);
    var modulator = (basecompare%baseint);

    System.out.println(basecompare + " (base 10) = " + divider + modulator + " (base " + baseint + ")");




  }

}
