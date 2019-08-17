import java.util.*; 
  
 class Main { 
  
    public static void main(String[] args) 
    { 
      	Scanner sc=new Scanner(System.in);
  		int size=0;
      size=sc.nextInt();
        int[] arr =new int[size]; 
  	for(int i=0;i<=size-1;i++)
    {
      arr[i]=sc.nextInt();
    }
        Map<Integer, Boolean> numberMap 
            = new HashMap<>(); 
  
        int max = arr.length; 
  
        for (Integer i : arr) { 
  
            if (numberMap.get(i) == null) { 
                numberMap.put(i, true); 
            } 
        } 
        for (int i = 1; i <= max; i++) { 
            if (numberMap.get(i) == null) { 
                System.out.println(i); 
            } 
        } 
    } 
} 