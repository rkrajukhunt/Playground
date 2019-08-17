import java.util.*; 
  
 class Main { 
    static void mySort(Integer[] arr) 
    { 
        int n = arr.length; 
  
        // Sort subarray from index 1 to 4, i.e., 
        // only sort subarray {7, 6, 45, 21} and 
        // keep other elements as it is. 
        Arrays.sort(arr, 0, n / 2); 
        Arrays.sort(arr, n / 2, n, Collections.reverseOrder()); 
    } 
  
    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
         Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  Integer[] arr=new Integer[size];
  for(int i=0;i<size;i++)
  {
    arr[i]=sc.nextInt();
  }
        mySort(arr); 
       for(int i:arr)
       {
         System.out.print(i+" ");
       }
    } 
} 