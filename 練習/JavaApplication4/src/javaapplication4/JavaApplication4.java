package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("請輸入一個數值 :");
       int no = sc.nextInt();
       int m[] = new int[20];
       int i;
       for(i = m.length - 1;i >= 0 ;i--){
           m[i] = no % 2;
           no /= 2;
       }
       for(int x : m){
           System.out.print(x + " ");
       }
       
    }

}
