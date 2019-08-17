import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] arr=str.split(" ");
   	Set<String> s=new LinkedHashSet<String>();
    for(String val:arr)
    {
      s.add(val);
    }
     //s.forEach(s1-> System.out.println(s1));
    for(String s1:s)
    {
      System.out.print(s1+" ");
    }
  }
}