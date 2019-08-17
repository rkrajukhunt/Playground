import java.util.Scanner;
class Main {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int N = in .nextInt();
  int i = 1, j;
  for (; i <= N;) {
   if (i % 2 == 0) {
    System.out.print(++i);
    for (j = 1; j < N; j++)
     System.out.print(i - 1);
    System.out.println();
   } else {
    for (j = 1; j < N; j++)
     System.out.print(i);
    System.out.print(++i);
    System.out.println();
   }
  }
 }
}