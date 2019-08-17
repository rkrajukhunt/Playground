import java.util.*;
class Main
{
  public static void main(String args[])
  {
  		Scanner sc=new Scanner(System.in);
    	int size=sc.nextInt();
    	String[] str=new String[size];
    	for(int i=0;i<size;i++)
        {
       		str[i]=sc.next();
        }
    	Arrays.sort(str);
    	for(String s:str)
        {
          System.out.println(s.toLowerCase());
        }
  }
}