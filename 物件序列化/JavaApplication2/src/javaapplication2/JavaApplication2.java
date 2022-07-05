package javaapplication2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class JavaApplication2 {

    public static void main(String[] args) {
        Member m1 = new Member(11, "abc", "0912-456000");
        Member m2 = new Member(22, "xyz", "0912-789000");
        
        ArrayList<Member> ar = new ArrayList<>();
        ar.add(m1);
        ar.add(m2);
        
        try {
            FileOutputStream fo = new FileOutputStream("src/data.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(ar);          
            System.out.println("物件序列化完成");
            oo.close();
            fo.close();

            // ================ 讀出序列化物件 ========================
            FileInputStream fi = new FileInputStream("src/data.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            ArrayList ar2 = (ArrayList) oi.readObject();
            System.out.println(ar2);
            oi.close();
            fi.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("檔案開啟失敗");
        } catch (IOException e2) {
            System.out.println("資料寫入失敗");
        } catch (ClassNotFoundException e3) {
            System.out.println("物件讀取失敗");
        }
    }

}
