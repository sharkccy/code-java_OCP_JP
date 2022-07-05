package javaapplication6;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaApplication6 {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("c:/tmp/work");
        Path p2 = Paths.get("c:/tmp/data/game");
        Path p3 = Paths.get("c:/tmp/work/java");
        Path p4 = Paths.get("c:/mov/asia");
        Path p5 = Paths.get("c:/code");

        System.out.println(p1.relativize(p2));  // 輸出從p1走到p2的相對路徑

        System.out.println(p2.relativize(p4));
    }
}
