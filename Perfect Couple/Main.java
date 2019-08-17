import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=0;
      int sum=0;
      size=sc.nextInt();
      int[] a=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
      sum=sc.nextInt();
      //printing pair of elements
       for(int i=0;i<size;i++)
         for(int j=i+1;j<size;j++)
           if(a[i]+a[j]==sum)
             System.out.println(a[i]+", "+a[j]);
      
    }
}