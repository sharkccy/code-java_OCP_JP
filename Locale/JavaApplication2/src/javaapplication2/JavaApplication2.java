package javaapplication2;

import java.util.Locale;
import java.util.ResourceBundle;

public class JavaApplication2 {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("data", us);
        // 資源檔的位置要放在 src/
        System.out.println(rb.getString("msg1"));
        System.out.println(rb.getString("msg2"));
        System.out.println(rb.getString("msg3"));
        
        
        Locale jp = new Locale("ja", "JP");
        ResourceBundle rb2 = ResourceBundle.getBundle("data", jp);
        System.out.println(rb2.getString("msg1"));
        System.out.println(rb2.getString("msg2"));
        System.out.println(rb2.getString("msg3"));
    }

}
