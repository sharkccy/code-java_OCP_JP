
import java.util.Arrays;
import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i, n, j = 0, k = -(b-1);   //  餘數可能有負的
        int[] m = new int[a];
        int[] m2 = new int[a];
        for (i = 0; i < a; i++) {
            m[i] = sc.nextInt();
        }
        Arrays.sort(m);

        while(k < b){
           for(i = a-1; i >= 0; i--){
               if(m[i] % b == k && Math.abs(m[i] % 2) == 1){  // 負數 mod 2 也可能是負數
                   m2[j++] = m[i];
               }
           }
           for(i = 0; i < a; i++){
               if(m[i] % b == k && Math.abs(m[i] % 2) == 0){  // 注意：負數取mod可能是負數
                   m2[j++] = m[i];
               }
           }
           k++;           
        }
        for(int x : m2){
            System.out.print(x + " ");
        }
    }
}


/* 測資
19 5
-9
-8
-7
-6
-5
-4
-3
-2
-1
0
1
2
3
4
5
6
7
8
9

out
-9
-4
-3
-8
-7
-2
-1
-6
5
-5
0
1
6
7
2
3
8
9
4
*/

