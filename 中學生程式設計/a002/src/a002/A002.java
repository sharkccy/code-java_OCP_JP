package a002;
import java.util.Scanner;
//範例輸入
//5 10
//1 2
//範例輸出
//15
//3
public class A002 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a , b;
       while(sc.hasNext()){
           a = sc.nextInt();
           b = sc.nextInt();
           System.out.println(a + b);
       }
    }

}
