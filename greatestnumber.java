// Program to find greatest among three numbers
import java.util.Scanner;

public class greatestnumber
{
  public static void main(String args[])
  {
     System.out.print("\nEnter three numbers ----");
     Scanner reader = new Scanner(System.in);
     System.out.print("\nEnter the first number =");
     int fn = reader.nextInt();
     System.out.print("\nEnter the second number =");
     int sn = reader.nextInt();
     System.out.print("\nEnter the third number =");
     int tn = reader.nextInt();
     reader.close(); 
     if(fn>sn)
     {
       if(fn>tn)
        {
           System.out.println("\n The Greatest number is = " + fn);
        }
         else
         {
           System.out.println("\n The Greatest number is = " + tn);
         }
     }
     else
      {
        if(sn>tn)
        {
           System.out.println("\n The Greatest number is = " + sn);
        }
         else
         {
           System.out.println("\n The Greatest number is = " + tn);
         }
      }    
   }
}    
