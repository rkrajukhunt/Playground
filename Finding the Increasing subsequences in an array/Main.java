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
    int k=0;
    int x=1;
    while(k<size)
    {
      for(int i=x;i<size;i++)
      {
        //System.out.println(k+","+i);
        if(a[k]<a[i])
			System.out.println(a[k]+","+a[i]);
      }
      x++;
      k++;
    }
  }
}