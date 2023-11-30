import java.util.Scanner;

public class ReadInput
{
   public static void main(String args[])
   {
     System.out.print("\nEnter a number = ");
     Scanner reader = new Scanner(System.in);
     int num = reader.nextInt();
     System.out.println("\nEntered no is " + num);
   }
}