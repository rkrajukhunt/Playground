import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      Set<String> lhs=new LinkedHashSet<>();
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			String s=br.readLine();
			String[] arr=s.split(",");
			
			for (int i = 0; i < arr.length; i++)
			{
				lhs.add(arr[i]);
			}
			System.out.println(lhs);
			
			String str=br.readLine();
          System.out.println("Enter the value to be deleted: "+str);
			lhs.remove(str);
          
			System.out.println(lhs);
			String str2=br.readLine();
			lhs.add(str2);
          	System.out.println("Enter the value to be added: "+str2);
			System.out.println(lhs);
			//System.out.println(Arrays.toString(arr));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    }
}