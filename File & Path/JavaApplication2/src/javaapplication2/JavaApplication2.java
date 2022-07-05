package javaapplication2;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaApplication2 {

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("c:/java");
        if (!Files.exists(p)) {
            Files.createDirectory(p);
            System.out.println("目錄建立成功");
        } 
        else {
            System.out.println("目錄已經存在!!");
        }
        Path p2 = Paths.get("c:/java/ocp.txt");
        if (!Files.exists(p2)) {
            Files.createFile(p2);
            System.out.println("檔案建立成功");
        }
        else{
            System.out.println("檔案已經存在!!");
        }

    }

}
