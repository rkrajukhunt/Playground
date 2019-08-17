import java.util.*;
import java.io.*;
import java.lang.*;
 class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String str=br.readLine();
    String[] list=str.split(",");
     TreeSet ts=new TreeSet();
      System.out.println("Duplicate Entry is:");
    for (String st : list) {
            if (!ts.add(st)) {
                System.out.println(st);
            }
        }
   		System.out.println("TreeSet is : "+ts);
    }
}