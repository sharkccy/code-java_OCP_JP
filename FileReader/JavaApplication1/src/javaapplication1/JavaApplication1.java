package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
           
            FileReader fr = new FileReader("src/data.txt");
            char[] ch = new char[300];
            fr.read(ch);    // 將檔案讀入，存到字元陣列
            String s = new String(ch);  // 將字元陣列轉成字串
            System.out.println(s);
            fr.close();
        } 
        catch (FileNotFoundException e1) {
            System.out.println("檔案開啟失敗");
        }
        catch(IOException e2){
            System.out.println("檔案讀取失敗");
        }
    }

}
