import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int n, max;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int search_elem_1;
        int search_elem_2;
        int a[] = new int[n];
        int s1 = 1;
        int s2 = 1;
      
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        search_elem_1 = s.nextInt();
        search_elem_2 = s.nextInt();
   
      	for(int i = 0; i < n; i++)
        {
			if(a[i]==search_elem_1 && s1==1){
              System.out.println(i);
              s1=0;
            }
          
             if(a[i] == search_elem_2 && s2==1 ){
               System.out.println(i);
               s2=0;
             }
        }
        if(s1==1)
          System.out.println("-1");
      
         if(s2==1)
          System.out.println("-1");
    }
}