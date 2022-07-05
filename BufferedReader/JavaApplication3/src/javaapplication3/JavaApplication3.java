package javaapplication3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
       FileReader fr = new FileReader("src/data.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println("請輸入帳號：");
        String name = sc.next();
        System.out.println("請輸入密碼：");
        String pwd = sc.next();
        
        String[] data;
        String str;
        int ok = -1;
        
        while((str = br.readLine()) != null){
            data = str.split(":");  // 把str依照冒號來切割
            if(name.equals(data[0]) && pwd.equals(data[1])){
                ok = 1;
            }
        }
        if(ok == 1){
            System.out.println("登入完成");
        }
        else{
            System.out.println("帳號或密碼錯誤");
        }
        br.close();
        fr.close();
    }
}