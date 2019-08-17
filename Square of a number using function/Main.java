import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(squear(n));
	} 
  public static int squear(int n)
  {
    int s=0;
    s=n*n;
    return s;
  }
}