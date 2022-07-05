package javaapplication_test;


import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class JavaApplication_test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y1,y2,y3,m1,m2,m3;
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy/M");
        String s =sf.format(d);
        String [] data = s.split("/");
        y1 = Integer.parseInt(data[0]);
        m1 = Integer.parseInt(data[1]);
        System.out.println("請輸入出生年月，例如：1995/6");
        String[] data2 = sc.next().split("/");
        y2 = Integer.parseInt(data2[0]);
        m2 = Integer.parseInt(data2[1]);
        if(m2 > m1){
            y3 = y1 -y2 -1;
            m3 = 12 + m1 - m2;
        }
        else {
            y3 = y1 - y2;
            m3 = m1 - m2;
        }
        System.out.println("實際年齡：" + y3 + "歲" + m3 + "個月");
    }
}   


