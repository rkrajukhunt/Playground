import java.util.Scanner;
class Main {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   int no = in.nextInt();
  int number = 1;
   boolean rk=false;
	for(int i = 1; i <= no; i++) {
		for(int j = 1; j <= i; j++) {
			if(rk){
             	System.out.print("#");
          rk=false;
            }
            else{
            	System.out.print("*");
              rk=true;
            }
        }
		System.out.println();
    }
  }
 }
