import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=0;
      n=sc.nextInt();
      int num=1;
      for(int i=1;i<=n;i++)
      { 
        for(int j=1;j<=n;j++)
        {
         	System.out.print(num) ;
        }
        num=num+1;
        System.out.println();
      }
	}
}