package javaapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaApplication1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fi = new FileInputStream("src/andy.jpg");
        FileOutputStream fo = new FileOutputStream("src/andy-2.jpg");
        int size = fi.available();  // 讀取檔案大小，單位是 byte
        byte[] m = new byte[size];
        fi.read(m);
        fo.write(m);

        // 這邊可加入讀檔後要處理的程式碼        
        System.out.printf("檔案大小: %.2f KB\n", size / 1024.0);
        fi.close();
    }

}
