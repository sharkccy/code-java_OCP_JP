package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
        int[][] ar = {{1,23,5,9,11}, {2,4,6,8}};
        int mx = ar[0][0];
        
        for(int[] z : ar){
            print(z);
            
            int tmp = max(z);
            if(tmp > mx)
                mx = tmp;
        }
        System.out.println(mx);
    }
    
    public static void print(int[] m) {
        for(int a : m){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    
     public static int max(int[] m) {
         int mx = m[0];
         for(int a : m){
             if(a > mx)
                 mx = a;
         }
         return mx;
     }
}
