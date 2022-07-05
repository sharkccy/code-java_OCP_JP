package javaapplication2;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Date d = new Date();
       
        DateFormat df =DateFormat.getDateInstance();
        System.out.println(df.format(d));
        
        DateFormat df2 = DateFormat.getDateInstance();  // getDateInstance()可以多載
        System.out.println(df2.format(d));
        
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);  // getDateInstance()可以多載
        System.out.println(df3.format(d));
        
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT);  // getDateInstance()可以多載
        System.out.println(df4.format(d));
        
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.MEDIUM);  // getDateInstance()可以多載
        System.out.println(df5.format(d));
        
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.LONG);  // getDateInstance()可以多載
        System.out.println(df6.format(d));
        
        DateFormat df7 = DateFormat.getDateInstance(DateFormat.FULL,Locale.FRANCE) ;// getDateInstance()可以多載
        System.out.println(df7.format(d));
    }

}
