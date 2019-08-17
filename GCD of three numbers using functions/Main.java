import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       int n1,n2,n3;
     Scanner sc=new Scanner(System.in);
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
     int  great=greatest(n1,n2,n3);
      System.out.print(great);
	}
  	 public static int greatest(int n1,int n2,int n3)
  {
    int great=1;
    for(int i=2;i<=n1&&i<=n2&&i<=n3;i++)
    {
      if(n1%i==0&&n2%i==0&&n3%i==0)
      {
        if(great<i)
          great=i;
      }
    }
    return great;
     }
}