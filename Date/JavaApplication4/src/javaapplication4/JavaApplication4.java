package javaapplication4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("d");
        System.out.println(sf.format(d));
        
        SimpleDateFormat sf2 = new SimpleDateFormat("D");  // 今天是今年的第幾天
        System.out.println(sf2.format(d));
        
        SimpleDateFormat sf3 = new SimpleDateFormat("YY");
        System.out.println(sf3.format(d));
        
        SimpleDateFormat sf4 = new SimpleDateFormat("YYYY");
        System.out.println(sf4.format(d));
        
        SimpleDateFormat sf5 = new SimpleDateFormat("MMM");
        System.out.println(sf5.format(d));
        
        SimpleDateFormat sf6 = new SimpleDateFormat("MMMM", Locale.CANADA);
        System.out.println(sf6.format(d));
        
        SimpleDateFormat sf7 = new SimpleDateFormat("mm");
        System.out.println(sf7.format(d));
    }
    
}
