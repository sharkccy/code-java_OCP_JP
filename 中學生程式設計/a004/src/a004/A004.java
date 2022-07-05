package a004;
//輸入說明
//年份
//
//輸出說明
//閏年 或 平年
//
//範例輸入
//1977
//範例輸出
//平年
//===================================================================
//逢4的倍數閏， 例如：西元1992、1996年等，為4的倍數，故為閏年。
//
//逢100的倍數不閏， 例如：西元1700、1800、1900年，為100的倍數，當年不閏年。
//
//逢400的倍數閏， 例如：西元1600、2000、2400年，為400的倍數，有閏年
import java.util.Scanner;

public class A004 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
           int y = sc.nextInt();
           if(y % 4 == 0 && y % 100 != 0 ){                
               System.out.println("閏年");
           }
           else if(y % 400 == 0){
               System.out.println("閏年");
           }
           else{
               System.out.println("平年");
           }
       }
    }
}
