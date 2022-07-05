package javaapplication3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請選擇：1-中文   2-English：");
        int en = sc.nextInt();
        int no = 5;
        if (en == 1) {
            Locale tw = new Locale("zh", "TW");
            ResourceBundle rb1 = ResourceBundle.getBundle("test", tw);
            show(rb1, no);
        } else {
            Locale us = new Locale("en", "US");
            ResourceBundle rb2 = ResourceBundle.getBundle("test", us);
            show(rb2, no);
        }
    }

    public static void show(ResourceBundle rb, int no) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/ans.txt"));
            String ans, en;               
            int sum = 0;
            int i = 1;
            while((ans = br.readLine()) != null) {              
                System.out.println(rb.getString(i + ""));
                en = sc.next();
                if(en.equals(ans)){
                    sum += 20;
                }
                i++;
            }
            System.out.println("sum = " + sum);
        }
        catch (FileNotFoundException e) {
            System.out.println("檔案讀取失敗");
        }
        catch(IOException e2){
            System.out.println("檔案開啟失敗");
        }

    }

}
