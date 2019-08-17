import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
      	reverse_string(str);
    }
    // Function to reverse a string
    public static void reverse_string(String str)
    {
      String[] split=str.split(" ");
      //split method of string will split the statement into words and store in array seperate by delimeter like , space @ etc 
      for(String s:split)
      {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
          rev+=s.charAt(i);
        }
        System.out.print(rev);
        System.out.print(" ");
      }
      
    }
}