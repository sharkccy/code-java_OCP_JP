package javaapplication2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ok = 0;
        while (ok != 1) {
            System.out.println("請輸入密碼：");
            String pwd = sc.next();
            Pattern p1 = Pattern.compile("[A-Z]");
            Matcher m1 = p1.matcher(pwd);

            Pattern p2 = Pattern.compile("[a-z]");
            Matcher m2 = p2.matcher(pwd);

            Pattern p3 = Pattern.compile("[0-9]");
            Matcher m3 = p3.matcher(pwd);

            Pattern p4 = Pattern.compile("[^a-z , A-Z , 0-9]"); // 特殊符號
            Matcher m4 = p4.matcher(pwd);

            if (!m1.find() || !m2.find() || !m3.find() || !m4.find() || pwd.length() < 6) {
                System.out.println("密碼必須包含大小寫字母、特殊符號、數字且長度 >= 6");
            } 
            else {
                System.out.println("請再次輸入密碼");
                if (sc.next().equals(pwd)) {
                    System.out.println("設定完成");
                    ok = 1;
                }
                else{
                    System.out.println("密碼確認失敗!請重新設定");
                }
            }
        }

    }

}
