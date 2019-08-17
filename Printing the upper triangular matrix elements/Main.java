import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int a[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = in.nextInt();
            }
        }
        int b[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
              if(i>j)
                b[i][j] = 0;
              else 
                b[i][j]=a[i][j];
            }
        }
    	int i,j,k;
        for(k = 0; k < c; k++)
        {
  	        for(i = 0, j = k; j < c ; i++, j++)
    	    System.out.print(b[i][j]+" ");
        }

    	
  }
}