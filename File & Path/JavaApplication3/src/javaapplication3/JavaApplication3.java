package javaapplication3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);       
        System.out.println("Name:");
        String name = sc.next();
        Path p1 = Paths.get("c:/"+name);
        if(!Files.exists(p1)){
            Files.createDirectory(p1);
            System.out.println("Email:");
            String email = sc.next();
            System.out.println("Phone");
            String phone = sc.next();
            FileWriter fw = new FileWriter(p1.toString() + "/data.txt");
            fw.write("姓名: " + name + "\r\n");  // windows的換行符號要使用：\r\n
            fw.write("Email: " + email + "\r\n");
            fw.write("電話: " + phone + "\r\n");
            fw.close();
//            BufferedWriter bw = new BufferedWriter(new FileWriter(p1.toString()+ "/data.txt"));
//            bw.write("姓名 :" + name );
//            bw.newLine();
//            bw.write("Email :" + email );
//            bw.newLine();
//            bw.write("電話 :" + phone );
//            bw.newLine();
//            bw.close();
        }
        else{
            System.out.println("帳號已存在");
        }                    
    }

}
