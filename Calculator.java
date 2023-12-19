import java.util.Scanner;
 
 public class Calculator
 { 
    public static void main(String args[])
    {
       double a,b;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       a=sc.nextDouble();
       b=sc.nextDouble();
       System.out.println("Enter the operator(+,-,*,/):");
       char op = sc.next().charAt(0);
       double o = 0;
       switch(op)
       {
         case '+':
          o=a+b;
          System.out.println(a + " " + op + " " + b + "=" + o);
          break;
          case '-':
          o=a-b;
          System.out.println(a + " " + op + " " + b + "=" + o);
          break;
          case '*':
          o=a*b;
          System.out.println(a + " " + op + " " + b + "=" + o);
          break;
          case '/':
          o=a/b;
          System.out.println(a + " " + op + " " + b + "=" + o);
          break;
         default:
          System.out.println("Entered input is wrong");
      }
      System.out.println("the final result:");
      System.out.println();
  }
}
 
 