import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code hereScanner sc=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(sum(n));
  
	}
  public static int sum(int n)
  {
    int sum=0;
    	for(int i=0;i<=n;i++)
        {
          sum+=i;
        }
    return sum;
  }
}