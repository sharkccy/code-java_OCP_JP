package javaapplication1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw;
        try {
            fw = new FileWriter("src/data.txt");
            fw.write("Hello\n");
            fw.write("大家晚安\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("存檔失敗");
        }
    }

}
