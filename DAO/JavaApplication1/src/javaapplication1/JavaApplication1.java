package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      System.out.println("請輸入需要刪除的ID");
//      String id = sc.next();
//      Member m1 = new Member(id);
//      DB d = new DB();
//      d.delete(m1);
//      System.out.println("資料刪除成功");
        System.out.println("請輸入要更新資料的會員ID：");
        String id = sc.next();
        System.out.println("new name：");
        String name = sc.next();
        System.out.println("new password：");
        String pwd = sc.next();
        System.out.println("new email：");
        String mail = sc.next();
        Member m2 = new Member(id, name, pwd, mail);
        DB d2 = new DB();
        d2.update(m2);
    }

}
