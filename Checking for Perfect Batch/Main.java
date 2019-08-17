import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] a=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
    int sum1=0;
    for(int i=0;i<3;i++)
    {
      sum1=sum1+a[i];
    }
   int sum2=0;
   for(int i=size-3;i<size;i++)
    {
      sum2=sum2+a[i];
    } 
    if(sum1==sum2)
    {
      System.out.println("Perfect Batch");
    }
    else 
      System.out.println("Not a Perfect Batch");
  }
}