import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    int i, j; 
      Scanner in = new Scanner(System.in);  
      int n=in.nextInt(); 
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= n; j++) 
            { 
                if (i == 1 || i == n ||  
                    j == 1 || j == n)             
                    System.out.print("*");             
                else           
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
	}
}