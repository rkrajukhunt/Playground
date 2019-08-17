import java.util.Scanner;
class Main
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
    int frq[]=new int[10];
    for(int i=0;i<size;i++)
    {
      if(a[i]!=0)
      {
      frq[a[i]-1]++;
      }
    }
    int max=0;
    for(int i=0;i<size;i++)
    {
		if(frq[i]>max)
        {
          max=frq[i];
        }
    }
    System.out.print(a[max]);
  }
}