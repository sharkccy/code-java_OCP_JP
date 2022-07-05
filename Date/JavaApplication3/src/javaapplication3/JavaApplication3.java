package javaapplication3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaApplication3 {

    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("MM:dd");  // M 表示月份，m 表示分鐘
        String s = sf.format(d);
        String [] data = s.split(":");
        System.out.println("今天是" + data[0] + "月" + data[1] + "日");
    }

}
