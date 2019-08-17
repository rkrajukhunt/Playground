// Java Program to find first and last 
// digits of a number 
import java.util.*; 
import java.lang.*; 

public class Main{ 
	public static void main(String argc[]) 
	{ 
      	Scanner in = new Scanner(System.in);
      	int n = in.nextInt(); 
      	String v = "" + n;
		System.out.print(v.charAt(1));
	} 
} 
