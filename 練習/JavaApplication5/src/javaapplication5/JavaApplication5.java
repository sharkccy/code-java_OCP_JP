package javaapplication5;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個數值 :");
        int n = sc.nextInt();
        int i;
        for(i = 2; i <= n / 2; i++){
            if(isPrime(i)  && n % i == 0){
                ar.add(i);
            }
        } 
        int k = 0;
        while(n > 0 && k < ar.size()){
            if(n % ar.get(k) == 0 && n / ar.get(k) == 1){
                System.out.print(ar.get(k));
                System.out.println("");
                break;
            }
            else if(n % ar.get(k) == 0){
                System.out.print(ar.get(k) + "*");
                n = n / ar.get(k);
            }            
            else{
                k++;
            }
        }
    }
    
    public static boolean isPrime(int n){  // 判斷是否是質數
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
