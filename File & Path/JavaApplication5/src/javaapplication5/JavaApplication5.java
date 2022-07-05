package javaapplication5;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class JavaApplication5 {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       Path p1 = Paths.get("c:/java/oca.txt");
       Files.setAttribute(p1, "dos:readonly", true  );  // 唯讀
       //Files.setAttribute(p1, "dos:hidden", true  );    // 隱藏
       //Files.setAttribute(p1, "dos:system", true  );// 系統檔
        System.out.println("ok");
       
    }

}
