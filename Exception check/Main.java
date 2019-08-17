import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      try(Scanner sc=new Scanner(System.in))
      {
        int n=sc.nextInt();
        System.out.println(n);
      }
     catch(Exception e)
     {
       System.out.print("Input Mismatch Exception occurred");
     }
   }
}