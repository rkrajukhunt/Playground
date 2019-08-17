import java.util.*;
class Main 
{ 
    public static void main(String ar[])
    {
      Scanner scan = new Scanner(System.in);
     int num = 0;
     int i,p,r;
     int sum = 0;
     int save_num = 0;
  
     num = scan.nextInt();
     save_num = num;
     while(num != 0)
     {
        i =1;
        p = 1;
        r = num % 10;
        while(i <= r)
        {
           p = p * i;
           i++;
        }
        sum = sum + p;
        num = num / 10;
     }
     if(sum == save_num)
     {
        System.out.print("Yes");
     }
     else
     {
        System.out.print("No");
     }
    }
}