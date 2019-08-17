import java.util.Scanner;
class Main {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int mark = in .nextInt();

  if (mark == 85)
   System.out.println("One");
  else if (mark == 2)
   System.out.println("Two");
  else if (mark==3)
   System.out.println("Three");
  else if (mark == 4)
   System.out.println("Four");
  else if (mark == 5)
   System.out.println("Five");
  else if (mark > 5)
   System.out.println("Invalid");
 }
}