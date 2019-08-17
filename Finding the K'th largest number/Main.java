/*
Write a Java code to find the K'th largest number in a given array. For example, If k = 2, find the second largest number in the given array.
*/
import java.util.Scanner;
import java.util.Arrays;
class Main{
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
      k=sc.nextInt();
      Arrays.sort(a);
      System.out.print(a[a.length-k]);
    }   
}