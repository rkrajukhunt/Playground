import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   int number, i;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();	
		int item = number;
		for(i = 1; i <= number*2; i++)
		{
			if(i % 2 != 0)
				System.out.println(i);
		}	
	}
}