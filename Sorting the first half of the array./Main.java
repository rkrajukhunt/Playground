import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0;index < n; index++)
    {
      list[index] = sc.nextInt();  
    }
    int len=list.length/2;
    Arrays.sort(list,0,len);
    for(int s:list)
    {
      System.out.print(s+" ");
    }
    
  }
}