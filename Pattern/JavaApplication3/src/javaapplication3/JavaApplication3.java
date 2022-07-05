package javaapplication3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ok = 0;
        while(ok != 1){
            System.out.println("請輸入手機號碼，ex:0910-123456");
            String phone = sc.next();
//          Pattern p = Pattern.compile("\\d\\d\\d\\d-\\d\\d\\d\\d\\d\\d");
            Pattern p = Pattern.compile("\\d{4}-\\d{6}");
            Matcher m = p.matcher(phone);
            if (m.find()) {
                System.out.println("格式正確");
                ok = 1;
            } 
            else {
                System.out.println("格式不符");
            }
        }
        
        
    }

}
