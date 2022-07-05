package javaapplication2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader("src/data.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println("請輸入會員帳號");
        String name = sc.next();
        String str;
        int ok = -1;
        while ((str = br.readLine()) != null) {
            if (name.equals(str)) {
                ok = 1;
            }
        }
        if (ok == 1) {
            System.out.println("登入成功");
        }
        else{
            System.out.println("查無此帳號");
        }
        fr.close();
        br.close();
    }
}
