import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
      int size=0;
      size=sc.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
      int count=0;
      for(int i=0;i<size;i++)
      {
        if(a[i]!=0)
        {
          count+=1;
        }
        else if(a[i]==0)
          break;
      }
      System.out.print(count);
    }
}