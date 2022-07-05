package javaapplication1;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaApplication1 {

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("c:/java");
        Files.createDirectory(p);
        System.out.println("目錄建立成功");
        Path p2 = Paths.get("c:/java/oca.txt");
        Files.createFile(p2);
        System.out.println("檔案建立成功");

    }

}


