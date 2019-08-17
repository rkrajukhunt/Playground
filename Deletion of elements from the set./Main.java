import java.io.*;
import java.util.TreeSet;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      TreeSet<String> ts=new TreeSet<>();
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			String s=br.readLine();
			String[] arr=s.split(",");
			
			for (int i = 0; i < arr.length; i++)
			{
				ts.add(arr[i]);
			}
			System.out.println(ts);
			for(int i=ts.size();i>0;i--)
			{
				ts.pollLast();
				System.out.println(ts);
			}
			//System.out.println(Arrays.toString(arr));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    }
}