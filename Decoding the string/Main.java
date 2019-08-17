import java.util.*;
class Main{
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int key=sc.nextInt();
    List<Character> li=new ArrayList();
    int len=str.length();
    for(int i=0;i<len;i++)
    {
      if(str.charAt(i)==' ')
        li.add(str.charAt(i));
      else 
      {
        char c=(char)(str.charAt(i)-key);
        if(c==']')
        	li.add('w');
        else
          li.add(c);
      }
    }
    for(char c:li)
    {
      System.out.print(c);
    }
  }
}