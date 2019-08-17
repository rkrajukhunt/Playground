import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      	int size;
      	size=sc.nextInt();
        int arr1[]=new int[size];
      	for(int i=0;i<=arr1.length-1;i++)
        {
          arr1[i]=sc.nextInt();
        }
      	int tmp[]=new int[arr1.length];
         for(int i=0;i<=tmp.length-1;i++)
         {
           tmp[i]=arr1[size-i-1];
         }
      if(Arrays.equals(arr1,tmp))
      {
        System.out.print("Yes");
      }
      else
        System.out.print("No");
        
    }
}