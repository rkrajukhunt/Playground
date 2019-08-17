import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner scan = new Scanner(System.in);
       int i, j;
       int r=scan.nextInt();
     	int c=scan.nextInt();
       int mat1[][] = new int[r][c];
       int mat3[][] = new int[r][c];
     for(i=0; i<r; i++)
       {
           for(j=0; j<c; j++)
           {
               mat1[i][j] = scan.nextInt();
           }
       }
     for(i=0; i<r; i++)
       {
           for(j=0; j<c; j++)
           {
               mat3[j][i] = mat1[i][j];
           }
       }
     for(i=0; i<c; i++)
       {
           for(j=0; j<r; j++)
           {
               System.out.print(mat3[i][j]+ " ");
           }
           System.out.println();
       }
    
  }
}