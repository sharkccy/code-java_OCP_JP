package javaapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaApplication1 {
    public static void main(String[] args) {
        Member m1 = new Member(11, "abc", "0912-456000");
        try{
            FileOutputStream fo = new FileOutputStream("src/data.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(m1);
            System.out.println("物件序列化完成");
            oo.close();
            fo.close();
           
          // ================ 讀出序列化物件 ========================
          
          FileInputStream fi= new FileInputStream("src/data.txt");
          ObjectInputStream oi = new ObjectInputStream(fi);
          System.out.println(oi.readObject());
          oi.close();
          fi.close();          
        }
        catch(FileNotFoundException e){
            System.out.println("檔案開啟失敗");
        }
        catch(IOException e2){
            System.out.println("資料寫入失敗");
        }
        catch(ClassNotFoundException e3){
            System.out.println("物件讀取失敗");
        }
    }

}
