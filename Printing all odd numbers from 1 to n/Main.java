import java.util.Scanner;
class Main {
	public static void main (String[] args){
		  int n=0,i=0;
         
        Scanner X = new Scanner(System.in);
         
        n = X.nextInt();
         
        for(i=1; i<=n; i++)
        {
            if(i%2!=0)
                System.out.println(i+" ");
        } 
	}
}