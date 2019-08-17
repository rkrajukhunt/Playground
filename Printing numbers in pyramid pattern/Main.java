import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
      int no = in.nextInt();
int space = no - 1;
      int i, j, k = 1;
        for (i = 1; i <= no; i++) {
          for (j = 1; j <= no - i; j++)
                System.out.print(" ");
          
            for (j = 1; j < i + 1; j++) {
                System.out.print(k++ + " ");
            }
 			System.out.println();
        }
    }    
}