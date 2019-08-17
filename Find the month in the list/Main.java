import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       java.util.List<String> li=new LinkedList<>();
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			String s=br.readLine();
			String[] arr=s.split(",");
			
			for (int i = 0; i < arr.length; i++)
			{
				li.add(arr[i]);
			}
			System.out.println(li);
			System.out.println("Size of the linked list: "+li.size());
			System.out.println("Is LinkedList empty? "+li.isEmpty());
			
			String str=br.readLine();
         	System.out.println("Does LinkedList contains "+str+"?");
			System.out.print(li.contains(str));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    }
}