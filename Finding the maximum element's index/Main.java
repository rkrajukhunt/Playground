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
    int max=0;
    int loc=0;
    for(int i=0;i<size;i++)
    {
      if(max<a[i])
      {
        max=a[i];
        loc=i;
         
      }
     
    }
     System.out.println(loc);
  }
}