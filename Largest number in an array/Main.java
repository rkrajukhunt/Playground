import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] a=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
      int great=1;
       for(int i=0;i<size;i++)
      {
       
        if(a[i]>great)
          great=a[i];
          
      }
      System.out.println(great);
    }
}