package javaapplication_delete;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JavaApplication_delete {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, passwd);
        
        if (con != null && !con.isClosed()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入要刪除的ID：");
            String id = sc.next();
            String s = "DELETE FROM member WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, id);
            int no = ps.executeUpdate();            
            
            if(no > 0)
                System.out.println("記錄刪除完成");
            else
                System.out.println("記錄刪除失敗");
                
            con.close();
        }
    }
}
