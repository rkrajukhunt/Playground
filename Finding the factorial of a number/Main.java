import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long fact=0;
    fact=factorial(n);
    System.out.print(fact);
  }
  public static long factorial(int n)
  {
    if(n==0)
      return 1;
    else
       return n*factorial(n-1);
  }
}