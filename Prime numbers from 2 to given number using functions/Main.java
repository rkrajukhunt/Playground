import java.util.*;
public class Main{
  	public static void power(int a){
       int i =0;
       int num =0;
       for (i = 1; i <= a; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--){
             if(i%num==0)
	     	{
 				counter = counter + 1;
	     	}
	  	}
	  	if (counter ==2)
	  	{
          System.out.println(i);
	  	}		
       }	
    }
	public static void main(String ar[]){
  		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
  		power(a);
    }
}