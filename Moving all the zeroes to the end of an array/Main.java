import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=0;
      size=sc.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
    int count = 0; 
    int temp;
    for (int i = 0; i < size; i++) 
    { 
          if ((a[i] != 0))
          { 
              temp = a[count]; 
              a[count] = a[i]; 
              a[i] = temp; 
              count = count + 1; 
          }  
    }
      for(int i=0;i<size;i++)
      {
        System.out.print(a[i]+" ");
      }
  }    
}