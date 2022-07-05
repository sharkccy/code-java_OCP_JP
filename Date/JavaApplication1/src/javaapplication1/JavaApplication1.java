package javaapplication1;
import java.util.Date;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());
        
        System.out.println(d.getTime());  // 從1970/1/1到目前所經過的毫秒數
        long no = d.getTime() + 3600_000 ;  // 增加1小時
        d.setTime(no);
        System.out.println(d);
    }
    
    

}
