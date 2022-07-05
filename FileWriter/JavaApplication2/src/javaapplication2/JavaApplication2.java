package javaapplication2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("src/data.txt", true);   // true表示附加
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n=====================\n");
            bw.write("Hello");
            bw.newLine();
            bw.write("大家晚安");
            bw.newLine();
            bw.write("Good night");
            bw.close();
            fw.close();
        } 
        catch (IOException e) {
            System.out.println("存檔失敗");
        }
    }
}
