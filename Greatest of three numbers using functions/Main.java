import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n1,n2,n3;
     Scanner sc=new Scanner(System.in);
      n1=sc.nextInt();
      n2=sc.nextInt();
      n3=sc.nextInt();
     int  great=greatest(n1,n2,n3);
      System.out.print(great);
	}
  public static int greatest(int n1,int n2,int n3)
  {
    int great=n1;
    if(great<n2)
   		great=n2;
    else if(great<n3)
      great=n3;
     else 
       return n1;
    return great;
  }
}