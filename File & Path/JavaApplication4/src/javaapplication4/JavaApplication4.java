package javaapplication4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class JavaApplication4 {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("c:/java/oca.txt");        
        Path p2 = Paths.get("c:/java/ocp.txt");
        
        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES);  // 複製檔案屬性
        //Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);  // 複蓋目的地檔案
        //Files.copy(p1, p2, StandardCopyOption.ATOMIC_MOVE);       //剪貼時只能完全執行或完全不執行
        System.out.println("file copied!!");
    }

}
