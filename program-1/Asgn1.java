
import java.util.Random;
import java.util.Scanner;

public class Asgn1 {

  public static void main(String[] args) {
    String message;
    System.out.println("DDDDDDDDD            AAA");
    System.out.println("DDDDDDDDDDDD      AAAAAAAAA");
    System.out.println("DDD      DDD      AAA   AAA");
    System.out.println("DDD      DDD   AAAAAAAAAAAAAAA");
    System.out.println("DDD      DDD   AAAAAAAAAAAAAAA");
    System.out.println("DDDDDDDDDDDD   AAA         AAA");
    System.out.println("DDDDDDDDD      AAA         AAA");

    System.out.println(" ");
    System.out.println("------------------------------");
    System.out.println(" ");
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter a 5-Character String:");
    message = input.next();
    System.out.println("Please Enter a Number in Farenheit:");
    int tempConvert = input.nextInt();

    var celcius = ((5/9)*(tempConvert - 32));

    //Generate Random Number!!!
    Random rand = new Random();

    int newnumber = rand.nextInt(16352) + 32;

    System.out.println("Random Number Generated!");

    var char1 = message.charAt(3);
    var char2 = message.charAt(2);
    var char3 = message.charAt(1);

    System.out.println("Your Random Key is: " + celcius + char1 + char2 + char3 + newnumber);



  }

}
