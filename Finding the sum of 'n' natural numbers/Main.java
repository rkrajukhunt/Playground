import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        sum=sum_natural(n);
        System.out.print(sum);
    }
  public static int sum_natural(int n)
  {
    if(n!=0)
      return n+sum_natural(n-1);
    else
    	return n;
  }
}