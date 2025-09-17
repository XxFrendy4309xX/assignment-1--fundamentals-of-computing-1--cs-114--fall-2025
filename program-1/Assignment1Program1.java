    import java.util.Random;
    import java.util.Scanner;
    public class Assignment1Program1 {
  public static void main(String[] args) { 
    System.out.println( "KKK       KKK          NN NN           NNN ");
    System.out.println( "KKK     KKK           NNN NNN         NNN  ");
    System.out.println( "KKK   KKK            NNN   NNN       NNN   ");
    System.out.println( "KK KKK              NNN     NNN     NNN    ");
    System.out.println( "KKK   KKK          NNN       NNN   NNN     ");
    System.out.println( "KKK     KKK       NNN         NNN NNN      ");
    System.out.println( "KKK       KKK    NNN           NN NN       ");

    String message;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a 5-character string:"); 
    message = scan.nextLine(); 
    System.out.print("Processed string: ");
        String Duc = "" + message.charAt(3) + message.charAt(2) + message.charAt(1);
        System.out.println("Please enter a number in Fahrenheit:");
        double fahrenheit = scan.nextDouble();
        int Tran; 
        double celsius = ( fahrenheit - 32) * 5/9;
        Random Kaden = new Random(); 
        Tran = 32 + Kaden.nextInt(16384-32+1); 
        System.out.println("Random number generated. Continuing...");
        System.out.println("Your new string is " + celsius + Duc + Tran);
        


        

        scan.close();
         
  }
}
