//Write a Java code to remove the characters in the main string which are present in the second string
import java.util.*;
class Main
{
  public static void main(String args[])
  {
   	Scanner sc=new Scanner(System.in);
    String main=sc.nextLine();
    char ch1[]=main.toCharArray();
    String repl=sc.next();
    List<Character> s=new ArrayList();
    for(char c:ch1)
    {
      s.add(c);
    }
     char[] ch2=repl.toCharArray();
    List<Character> removech2=new ArrayList();
    for(char c:ch2)
    {
      removech2.add(c);
    }
    s.removeAll(removech2);
   for(char c:s)
   {
    System.out.print(c);
   }
  }
}